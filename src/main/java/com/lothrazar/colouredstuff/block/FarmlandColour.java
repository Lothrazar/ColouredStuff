package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.pathfinder.PathComputationType;

public class FarmlandColour extends BlockFlib implements IHasColor {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public FarmlandColour(Properties p, DyeColorless s) {
    super(p.noOcclusion());
    RAINBOW.put(s, this);
    this.color = s;
    this.registerDefaultState(this.defaultBlockState().setValue(FarmBlock.MOISTURE, 0));
  }

  protected final DyeColorless color;

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public Map<DyeColorless, Block> getRainbow() {
    return RAINBOW;
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    super.createBlockStateDefinition(builder.add(FarmBlock.MOISTURE));
  }

  @Override
  public void tick(BlockState bs, ServerLevel level, BlockPos pos, RandomSource rand) {
    if (!bs.canSurvive(level, pos)) {
      turnToDirt((Entity) null, bs, level, pos);
    }
  }

  @Override
  public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
    int i = state.getValue(FarmBlock.MOISTURE);
    if (!isNearWater(level, pos) && !level.isRainingAt(pos.above())) {
      if (i > 0) {
        level.setBlock(pos, state.setValue(FarmBlock.MOISTURE, Integer.valueOf(i - 1)), 2);
      }
      else if (!shouldMaintainFarmland(level, pos)) {
        turnToDirt((Entity) null, state, level, pos);
      }
    }
    else if (i < 7) {
      level.setBlock(pos, state.setValue(FarmBlock.MOISTURE, Integer.valueOf(7)), 2);
    }
  }

  @Override
  public void fallOn(Level level, BlockState bs, BlockPos pos, Entity entity, float f) {
    if (!level.isClientSide && net.neoforged.neoforge.common.CommonHooks.onFarmlandTrample(level, pos, Blocks.DIRT.defaultBlockState(), f, entity)) { // NeoForge: Move logic to Entity#canTrample
      turnToDirt(entity, bs, level, pos);
    }
    super.fallOn(level, bs, pos, entity, f);
  }

  private void turnToDirt(Entity entity, BlockState farmlandState, Level level, BlockPos pos) {
    var dirt = DirtColour.RAINBOW.get(this.color).defaultBlockState();
    BlockState modifiedDirt = FarmBlock.pushEntitiesUp(farmlandState, dirt, level, pos);
    level.setBlockAndUpdate(pos, modifiedDirt);
    level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(entity, modifiedDirt));
  }

  private static boolean shouldMaintainFarmland(BlockGetter level, BlockPos pos) {
    return level.getBlockState(pos.above()).is(BlockTags.MAINTAINS_FARMLAND);
  }

  private static boolean isNearWater(LevelReader level, BlockPos pos) {
    BlockState state = level.getBlockState(pos);
    for (BlockPos blockpos : BlockPos.betweenClosed(pos.offset(-4, 0, -4), pos.offset(4, 1, 4))) {
      if (state.canBeHydrated(level, pos, level.getFluidState(blockpos), blockpos)) {
        return true;
      }
    }
    return net.neoforged.neoforge.common.FarmlandWaterManager.hasBlockWaterTicket(level, pos);
  }

  @Override
  public boolean isFertile(BlockState state, BlockGetter level, BlockPos pos) {
    if (state.hasProperty(FarmBlock.MOISTURE)) {
      return state.getValue(FarmBlock.MOISTURE) > 0;
    }
    return false;
  }

  @Override
  public boolean isPathfindable(BlockState p_53267_, PathComputationType p_53270_) {
    return false;
  }
}

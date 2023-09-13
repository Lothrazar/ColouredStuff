package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class FarmlandColour extends PathColour {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public FarmlandColour(Properties p, DyeColorless s) {
    super(p, s);
    RAINBOW.put(s, this);
    this.registerDefaultState(this.defaultBlockState().setValue(FarmBlock.MOISTURE, 0));
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
  public void tick(BlockState p_221134_, ServerLevel p_221135_, BlockPos p_221136_, RandomSource p_221137_) {
    if (!p_221134_.canSurvive(p_221135_, p_221136_)) {
      turnToDirt((Entity) null, p_221134_, p_221135_, p_221136_);
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
  public void fallOn(Level p_153227_, BlockState p_153228_, BlockPos p_153229_, Entity p_153230_, float p_153231_) {
    if (!p_153227_.isClientSide && net.minecraftforge.common.ForgeHooks.onFarmlandTrample(p_153227_, p_153229_, Blocks.DIRT.defaultBlockState(), p_153231_, p_153230_)) { // Forge: Move logic to Entity#canTrample
      turnToDirt(p_153230_, p_153228_, p_153227_, p_153229_);
    }
    super.fallOn(p_153227_, p_153228_, p_153229_, p_153230_, p_153231_);
  }

  public static void turnToDirt(Entity p_270981_, BlockState farmlandState, Level p_270568_, BlockPos pos) {
    //    ModColourable.LOGGER.info("turn to dirt " + pos);
    var dirt = Blocks.DIRT.defaultBlockState(); // TODO //ColourableRegistry.DIRT_BLOCK.get().defaultBlockState().setValue(COLOR, farmlandState.getValue(COLOR));
    BlockState modifiedDirt = pushEntitiesUp(farmlandState, dirt, p_270568_, pos);
    p_270568_.setBlockAndUpdate(pos, modifiedDirt);
    p_270568_.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(p_270981_, modifiedDirt));
  }

  private static boolean shouldMaintainFarmland(BlockGetter p_279219_, BlockPos p_279209_) {
    BlockState plant = p_279219_.getBlockState(p_279209_.above());
    BlockState state = p_279219_.getBlockState(p_279209_);
    return plant.getBlock() instanceof net.minecraftforge.common.IPlantable && state.canSustainPlant(p_279219_, p_279209_, Direction.UP, (net.minecraftforge.common.IPlantable) plant.getBlock());
  }

  private static boolean isNearWater(LevelReader p_53259_, BlockPos p_53260_) {
    BlockState state = p_53259_.getBlockState(p_53260_);
    for (BlockPos blockpos : BlockPos.betweenClosed(p_53260_.offset(-4, 0, -4), p_53260_.offset(4, 1, 4))) {
      if (state.canBeHydrated(p_53259_, p_53260_, p_53259_.getFluidState(blockpos), blockpos)) {
        return true;
      }
    }
    return net.minecraftforge.common.FarmlandWaterManager.hasBlockWaterTicket(p_53259_, p_53260_);
  }

  @Override
  public boolean canSustainPlant(BlockState state, BlockGetter level, BlockPos pos, Direction facing, IPlantable plantable) {
    //    BlockState plant = plantable.getPlant(level, pos.relative(facing));
    PlantType plantType = plantable.getPlantType(level, pos.relative(facing));
    // 
    return (plantType == PlantType.CROP)
        || super.canSustainPlant(state, level, pos, facing, plantable);
  }

  @Override
  public boolean isFertile(BlockState state, BlockGetter level, BlockPos pos) {
    if (state.hasProperty(FarmBlock.MOISTURE)) {
      return state.getValue(FarmBlock.MOISTURE) > 0;
    }
    return false;
  }

  @Override
  public boolean isPathfindable(BlockState p_53267_, BlockGetter p_53268_, BlockPos p_53269_, PathComputationType p_53270_) {
    return false;
  }
}

package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.IForgeShearable;

public class LeavesColour extends BlockFlib implements IHasColor, SimpleWaterloggedBlock, IForgeShearable {

  public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
  public static final int DECAY_DISTANCE = 7;
  public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE;
  public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;
  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public LeavesColour(Properties p, DyeColorless color) {
    super(p);
    RAINBOW.put(color, this);
    this.color = color;
    this.registerDefaultState(this.defaultBlockState().setValue(DISTANCE, Integer.valueOf(7)).setValue(WATERLOGGED, false));
  }

  private final DyeColorless color;

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public FluidState getFluidState(BlockState bs) {
    return bs.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(bs);
  }

  @Override
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    FluidState fluidstate = ctx.getLevel().getFluidState(ctx.getClickedPos());
    BlockState blockstate = this.defaultBlockState().setValue(PERSISTENT, Boolean.valueOf(true)).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    return updateDistance(blockstate, ctx.getLevel(), ctx.getClickedPos());
  }

  private static BlockState updateDistance(BlockState bs, LevelAccessor level, BlockPos pos) {
    int i = DECAY_DISTANCE;
    BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
    for (Direction direction : Direction.values()) {
      blockpos$mutableblockpos.setWithOffset(pos, direction);
      i = Math.min(i, getDistanceAt(level.getBlockState(blockpos$mutableblockpos)) + 1);
      if (i == 1) {
        break;
      }
    }
    return bs.setValue(DISTANCE, Integer.valueOf(i));
  }

  private static int getDistanceAt(BlockState p_54464_) {
    return getOptionalDistanceAt(p_54464_).orElse(DECAY_DISTANCE);
  }

  public static OptionalInt getOptionalDistanceAt(BlockState bs) {
    if (bs.is(BlockTags.LOGS)) {
      return OptionalInt.of(0);
    }
    else {
      return bs.hasProperty(DISTANCE) ? OptionalInt.of(bs.getValue(DISTANCE)) : OptionalInt.empty();
    }
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    super.createBlockStateDefinition(builder.add(DISTANCE, PERSISTENT, WATERLOGGED));
  }

  @Override
  public Map<DyeColorless, Block> getRainbow() {
    return RAINBOW;
  }

  @Override
  public boolean isRandomlyTicking(BlockState bs) {
    return bs.getValue(DISTANCE) == DECAY_DISTANCE && !bs.getValue(PERSISTENT);
  }

  protected boolean decaying(BlockState bs) {
    return !bs.getValue(PERSISTENT) && bs.getValue(DISTANCE) == DECAY_DISTANCE;
  }

  @Override
  public void randomTick(BlockState bs, ServerLevel level, BlockPos pos, RandomSource p_221382_) {
    if (this.decaying(bs)) {
      dropResources(bs, level, pos);
      level.removeBlock(pos, false);
    }
  }

  @Override
  public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    return ((FireBlock) Blocks.FIRE).getBurnOdds(Blocks.OAK_LEAVES.defaultBlockState());
  }

  @Override
  public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    return ((FireBlock) Blocks.FIRE).getIgniteOdds(Blocks.OAK_LEAVES.defaultBlockState());
  }
}

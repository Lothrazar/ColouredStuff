package com.lothrazar.colouredstuff.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;

@SuppressWarnings("deprecation")
public class BlockColourSaplin extends BlockColour implements IPlantable, BonemealableBlock {

  public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
  protected static final float AABB_OFFSET = 6.0F; // SaplingBlock.AABB_OFFSET;
  protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D); // SaplingBlock.SHAPE;
  private final AbstractTreeGrower treeGrower;

  public BlockColourSaplin(AbstractTreeGrower g, Properties p, Settings s) {
    super(p.mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), s.tooltip());
    this.treeGrower = g;
    this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, Integer.valueOf(0)));
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    super.createBlockStateDefinition(builder.add(STAGE));
  }

  @Override
  public BlockState updateShape(BlockState state, Direction dir, BlockState nbrState, LevelAccessor level, BlockPos pos, BlockPos nbrPos) {
    return !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, dir, nbrState, level, pos, nbrPos);
  }

  @Override
  public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
    BlockPos blockpos = pos.below();
    if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
      return level.getBlockState(blockpos).canSustainPlant(level, blockpos, Direction.UP, this);
    return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
  }

  @Override
  public boolean propagatesSkylightDown(BlockState p_51039_, BlockGetter p_51040_, BlockPos p_51041_) {
    return p_51039_.getFluidState().isEmpty();
  }

  @Override
  public boolean isPathfindable(BlockState p_51023_, BlockGetter p_51024_, BlockPos p_51025_, PathComputationType p_51026_) {
    return p_51026_ == PathComputationType.AIR && !this.hasCollision ? true : super.isPathfindable(p_51023_, p_51024_, p_51025_, p_51026_);
  }

  @Override
  public BlockState getPlant(BlockGetter world, BlockPos pos) {
    BlockState state = world.getBlockState(pos);
    if (state.getBlock() != this) return defaultBlockState();
    return state;
  }

  @Override
  public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean p_55994_) {
    return true;
  }

  @Override
  public boolean isBonemealSuccess(Level level, RandomSource rand, BlockPos pos, BlockState state) {
    return (double) level.random.nextFloat() < 0.45D;
  }

  @Override
  public void performBonemeal(ServerLevel level, RandomSource rand, BlockPos pos, BlockState state) {
    this.advanceTree(level, pos, state, rand);
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
    return SHAPE;
  }

  @Override
  public void randomTick(BlockState p_222011_, ServerLevel level, BlockPos pos, RandomSource rand) {
    if (!level.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
    if (level.getMaxLocalRawBrightness(pos.above()) >= 9 && rand.nextInt(7) == 0) {
      this.advanceTree(level, pos, p_222011_, rand);
    }
  }

  //  @Override extends from BushBlock.class 
  public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
    return state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND);
  }

  //  @Override extends from SaplingBlock.class
  public void advanceTree(ServerLevel level, BlockPos pos, BlockState state, RandomSource rand) {
    if (state.getValue(STAGE) == 0) {
      level.setBlock(pos, state.cycle(STAGE), 4);
    }
    else {
      this.treeGrower.growTree(level, level.getChunkSource().getGenerator(), pos, state, rand);
    }
  }
}

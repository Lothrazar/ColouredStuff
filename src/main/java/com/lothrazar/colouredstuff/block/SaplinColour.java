package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
@SuppressWarnings("deprecation")
public class SaplinColour extends BlockFlib implements IHasColor, BonemealableBlock {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();
  public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
  protected static final float AABB_OFFSET = 6.0F; // SaplingBlock.AABB_OFFSET;
  protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D); // SaplingBlock.SHAPE;
  private final TreeGrower treeGrower;

  public SaplinColour(TreeGrower g, Properties p, DyeColorless s) {
    super(p.mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    this.treeGrower = g;
    this.registerDefaultState(this.stateDefinition.any().setValue(STAGE, Integer.valueOf(0)));
    RAINBOW.put(s, this);
    this.color = s;
  }

  private final DyeColorless color;

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
    super.createBlockStateDefinition(builder.add(STAGE));
  }

  @Override
  public BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos, Direction dir, BlockPos nbrPos, BlockState nbrState, RandomSource random) {
    return !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, level, ticks, pos, dir, nbrPos, nbrState, random);
  }

  @Override
  public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
    BlockPos blockpos = pos.below();
    return this.mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
  }

  @Override
  protected boolean propagatesSkylightDown(BlockState p_51039_) {
    return p_51039_.getFluidState().isEmpty();
  }

  @Override
  public boolean isPathfindable(BlockState bs,  PathComputationType pct) {
    return pct == PathComputationType.AIR && !this.hasCollision ? true : super.isPathfindable(bs, pct);
  }

  @Override
  public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
    return true;
  }

  @Override
  public boolean isBonemealSuccess(Level level, RandomSource rand, BlockPos pos, BlockState state) {
    return level.getRandom().nextFloat() < 0.45D;
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
  // 26.1: vanilla SaplingBlock/BushBlock now extend VegetationBlock, whose mayPlaceOn checks
  // BlockTags.SUPPORTS_VEGETATION (dirt/mud/moss/grass blocks + farmland) instead of BlockTags.DIRT -
  // BlockTags.DIRT itself no longer includes grass_block in 26.1, which broke placing on grass.
  public boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
    return state.is(BlockTags.SUPPORTS_VEGETATION);
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

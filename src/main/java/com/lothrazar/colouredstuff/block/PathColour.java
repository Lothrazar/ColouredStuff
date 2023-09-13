package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PathColour extends BlockColour {

  public static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();
  //  protected static final VoxelShape SHAPE = FarmBlock.SHAPE;
  protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);

  public PathColour(Properties p, DyeColorless s) {
    super(p, s);
    RAINBOW.put(s, this);
  }

  @Override
  public Map<DyeColorless, BlockColour> getRainbow() {
    return RAINBOW;
  }

  @Override
  public boolean useShapeForLightOcclusion(BlockState p_153159_) {
    return true;
  }

  @Override
  public VoxelShape getShape(BlockState p_153143_, BlockGetter p_153144_, BlockPos p_153145_, CollisionContext p_153146_) {
    return SHAPE;
  }

  @Override //inherit from DirthPathBlock
  public boolean canSurvive(BlockState p_153148_, LevelReader p_153149_, BlockPos p_153150_) {
    BlockState blockstate = p_153149_.getBlockState(p_153150_.above());
    return !blockstate.isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
  }
}

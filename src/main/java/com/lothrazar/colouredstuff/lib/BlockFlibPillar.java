package com.lothrazar.colouredstuff.lib;

import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public abstract class BlockFlibPillar extends BlockFlib implements IHasColor {

  public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

  public BlockFlibPillar(Properties p) {
    super(p, new BlockFlib.Settings());
  }

  @Override
  public BlockState rotate(BlockState state, Rotation rot) {
    return RotatedPillarBlock.rotatePillar(state, rot);
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    super.createBlockStateDefinition(builder.add(AXIS));
  }

  @Override
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    return super.getStateForPlacement(ctx).setValue(AXIS, ctx.getClickedFace().getAxis());
  }
}

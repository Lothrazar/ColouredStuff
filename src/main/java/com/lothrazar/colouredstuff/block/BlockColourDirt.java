package com.lothrazar.colouredstuff.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;

public class BlockColourDirt extends BlockColour {

  public BlockColourDirt(Properties p, Settings s) {
    super(p.noOcclusion(), s);
  }

  @Override
  public BlockState getToolModifiedState(BlockState dirtState, UseOnContext context, ToolAction toolAction, boolean simulate) {
    //    if (toolAction == ToolActions.HOE_TILL && dirtState.hasProperty(BlockColour.COLOR)) {
    //      var block = ColourableRegistry.FARM_BLOCK.get();
    //      return block.defaultBlockState().setValue(BlockColour.COLOR, dirtState.getValue(BlockColour.COLOR));
    //    }
    //    if (toolAction == ToolActions.SHOVEL_FLATTEN && dirtState.hasProperty(BlockColour.COLOR)) {
    //      var block = ColourableRegistry.PATH_BLOCK.get();
    //      return block.defaultBlockState().setValue(BlockColour.COLOR, dirtState.getValue(BlockColour.COLOR));
    //    }
    return super.getToolModifiedState(dirtState, context, toolAction, simulate);
  }
}

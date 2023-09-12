package com.lothrazar.colouredstuff.block;

import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;

public class BlockColourStrippable extends BlockColourPillar {

  public BlockColourStrippable(Properties p, BlockFlib.Settings s) {
    super(p, s);
  }

  @Override
  public BlockState getToolModifiedState(BlockState logState, UseOnContext context, ToolAction toolAction, boolean simulate) {
    //    if (toolAction == ToolActions.AXE_STRIP && logState.hasProperty(COLOR)) {
    //      var block = ColourableRegistry.LOG_STR_BLOCK.get();
    //      return block.defaultBlockState().setValue(AXIS, logState.getValue(AXIS)).setValue(COLOR, logState.getValue(COLOR));
    //    }
    return super.getToolModifiedState(logState, context, toolAction, simulate);
  }
}

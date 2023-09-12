package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class LogColour extends BlockColourPillar {

  public static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();

  public LogColour(Properties p, DyeColorless s) {
    super(p, s);
    RAINBOW.put(s, this);
  }

  @Override
  public BlockState getToolModifiedState(BlockState logState, UseOnContext context, ToolAction toolAction, boolean simulate) {
    if (toolAction == ToolActions.AXE_STRIP && StrippedLogColour.RAINBOW.containsKey(this.getColor())) {
      var block = StrippedLogColour.RAINBOW.get(this.getColor());
      return block.defaultBlockState().setValue(AXIS, logState.getValue(AXIS));
    }
    return super.getToolModifiedState(logState, context, toolAction, simulate);
  }
}

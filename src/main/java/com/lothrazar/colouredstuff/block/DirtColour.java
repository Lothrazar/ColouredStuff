package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class DirtColour extends BlockColour {

  public static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();

  public DirtColour(Properties p, DyeColorless s) {
    super(p.noOcclusion(), s);
    RAINBOW.put(s, this);
  }

  @Override
  public BlockState getToolModifiedState(BlockState dirtState, UseOnContext context, ToolAction toolAction, boolean simulate) {
    if (toolAction == ToolActions.HOE_TILL && FarmlandColour.RAINBOW.containsKey(this.getColor())) {
      var block = FarmlandColour.RAINBOW.get(this.getColor());
      return block.defaultBlockState();
    }
    if (toolAction == ToolActions.SHOVEL_FLATTEN && PathColour.RAINBOW.containsKey(this.getColor())) {
      var block = PathColour.RAINBOW.get(this.getColor());
      return block.defaultBlockState();
    }
    return super.getToolModifiedState(dirtState, context, toolAction, simulate);
  }
}

package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class DirtColour extends BlockFlib implements IHasColor {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public DirtColour(Properties p, DyeColorless s) {
    super(p.noOcclusion());
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

package com.lothrazar.colouredstuff.block.stair;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SandstoneStair extends StairBlock implements IHasColor {

  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();
  private final DyeColorless color;

  //pass in the base block
  public SandstoneStair(java.util.function.Supplier<BlockState> state, Properties p, DyeColorless color) {
    super(state, p);
    RAINBOW.put(color, this);
    this.color = color;
  }

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public Map<DyeColorless, Block> getRainbow() {
    return RAINBOW;
  }
}

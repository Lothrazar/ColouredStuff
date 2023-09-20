package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;

public class StoneSlab extends SlabBlock implements IHasColor {

  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();
  private final DyeColorless color;

  public StoneSlab(Properties p, DyeColorless color) {
    super(p);
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

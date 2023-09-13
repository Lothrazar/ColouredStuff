package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.lib.BlockFlibPillar;
import net.minecraft.world.level.block.Block;

public class StrippedLogColour extends BlockFlibPillar {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public StrippedLogColour(Properties p, DyeColorless s) {
    super(p);
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
}

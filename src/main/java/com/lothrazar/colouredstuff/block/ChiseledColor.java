package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;

public class ChiseledColor extends BlockColour {

  private static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();

  public ChiseledColor(Properties p, DyeColorless color) {
    super(p, color);
    RAINBOW.put(color, this);
  }

  @Override
  public Map<DyeColorless, BlockColour> getRainbow() {
    return RAINBOW;
  }
}

package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;

public class StrippedLogColour extends BlockColourPillar {

  public static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();

  public StrippedLogColour(Properties p, DyeColorless s) {
    super(p, s);
    RAINBOW.put(s, this);
  }
}

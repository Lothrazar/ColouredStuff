package com.lothrazar.colouredstuff.color;

import java.util.Map;
import com.lothrazar.colouredstuff.block.BlockColour;

public interface IHasColor {

  public DyeColorless getColor();

  public Map<DyeColorless, BlockColour> getRainbow();
}

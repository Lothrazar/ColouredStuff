package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.level.block.Block;

public class BrickColour extends BlockFlib implements IHasColor {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public BrickColour(Properties p, DyeColorless s) {
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

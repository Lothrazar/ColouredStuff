package com.lothrazar.colouredstuff.block.wall;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;

public class CobblestoneWall extends WallBlock implements IHasColor {

  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();
  private final DyeColorless color;

  public CobblestoneWall(Properties p, DyeColorless color) {
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

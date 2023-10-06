package com.lothrazar.colouredstuff.color;

import java.util.Map;
import net.minecraft.world.level.block.Block;

public interface IHasColor {

  public DyeColorless getColor();

  public Map<DyeColorless, Block> getRainbow();
}

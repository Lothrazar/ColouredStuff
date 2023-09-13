package com.lothrazar.colouredstuff.block.stuff;

import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.colouredstuff.color.Rainbows;
import com.lothrazar.library.block.BlockFlib;

@Deprecated
public abstract class BlockColour extends BlockFlib implements IHasColor {

  public BlockColour(Properties p, DyeColorless color) {
    super(p, new BlockFlib.Settings());
    this.oldcolor = color;
    Rainbows.KEYS.put(this, color);
  }

  @Deprecated
  private final DyeColorless oldcolor;

  @Override
  public DyeColorless getColor() {
    return oldcolor;
  }
}

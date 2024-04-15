package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;

public class ColourLiquidBlock extends LiquidBlock implements IHasColor {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public ColourLiquidBlock(Supplier<? extends FlowingFluid> supplier, Block.Properties props, DyeColorless s) {
    super(supplier, props);
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

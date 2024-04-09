package com.lothrazar.colouredstuff.block;

import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;

public class ColourLiquidBlock extends LiquidBlock {

  public ColourLiquidBlock(Supplier<? extends FlowingFluid> supplier, Block.Properties props) {
    super(supplier, props);
  }
}

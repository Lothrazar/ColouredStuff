package com.lothrazar.colouredstuff.fluid;

import com.lothrazar.colouredstuff.library.FluidHolder;
import com.lothrazar.colouredstuff.registry.ConfigColourable;
import net.minecraftforge.fluids.FluidType;

public class InfiniteFluidHolder extends FluidHolder {

  /**
   * use config file to modify infinite src property of basic fluidtype
   */
  public static FluidType.Properties fluidtypeProperties() {
    return InfiniteFluidHolder.fluidtypeProperties()
        .canConvertToSource(ConfigColourable.infWater());
  }
}

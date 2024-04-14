package com.lothrazar.colouredstuff.fluid;

import com.lothrazar.colouredstuff.registry.ConfigColourable;
import com.lothrazar.library.fluid.FluidHolder;
import net.minecraftforge.fluids.FluidType;

public class InfiniteFluidHolder extends FluidHolder {

  /**
   * use config file to modify infinite src property of basic fluidtype
   */
  public static FluidType.Properties fluidtypeProperties() {
    return FluidHolder.fluidtypeProperties()
        .canConvertToSource(ConfigColourable.infWater());
  }
}

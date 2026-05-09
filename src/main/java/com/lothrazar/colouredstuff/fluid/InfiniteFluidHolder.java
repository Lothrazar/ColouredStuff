package com.lothrazar.colouredstuff.fluid;

import com.lothrazar.colouredstuff.registry.ConfigColourable;
import com.lothrazar.library.fluid.FluidHolder;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.FluidType;

public class InfiniteFluidHolder extends FluidHolder {


  public static FluidType.Properties fluidtypeProperties() {
    return FluidHolder.fluidtypeProperties();
  }

  public static FluidType createFluidType() {
    return new FluidType(fluidtypeProperties()) {
      @Override
      public boolean canConvertToSource(FluidState state, LevelReader level, BlockPos pos) {
        return ConfigColourable.INFINITE_WATER.get();
      }
    };
  }
}

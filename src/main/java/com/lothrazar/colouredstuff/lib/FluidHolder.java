package com.lothrazar.colouredstuff.lib;

import com.lothrazar.colouredstuff.registry.ConfigColourable;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;

public class FluidHolder {

  public static Block.Properties blockProps() {
    return Block.Properties.of().liquid()
        .replaceable()
        .pushReaction(PushReaction.DESTROY)
        .sound(SoundType.EMPTY)
        .noCollission()
        .noOcclusion()
        .strength(100.0F)
        .noLootTable();
  }

  public static FluidType.Properties fluidtypeProperties() {
    return fluidtypeProperties(ConfigColourable.infWater());
  }

  public static FluidType.Properties fluidtypeProperties(boolean isInfinite) {
    return FluidType.Properties.create()
        .canConvertToSource(isInfinite)
        .canExtinguish(true)
        .canSwim(true)
        .canHydrate(true)
        .supportsBoating(true)
        .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
        .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
        .rarity(Rarity.UNCOMMON);
  }
}

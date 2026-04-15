package com.lothrazar.colouredstuff.world;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RainbowTreeGrower {

  private static final Map<DyeColorless, TreeGrower> GROWERS = new HashMap<>();

  static {
    for (DyeColorless color : DyeColorless.values()) {
      String name = color.name().toLowerCase();
      ResourceKey<ConfiguredFeature<?, ?>> key = ResourceKey.create(Registries.CONFIGURED_FEATURE,
          ResourceLocation.fromNamespaceAndPath(ModColourable.MODID, "tree_" + name));
      Optional<ResourceKey<ConfiguredFeature<?, ?>>> none = Optional.empty();
      GROWERS.put(color, new TreeGrower("rainbow_" + name, none, Optional.of(key), none));
    }
  }

  public static TreeGrower get(DyeColorless color) {
    return GROWERS.getOrDefault(color, GROWERS.get(DyeColorless.NONE));
  }
}

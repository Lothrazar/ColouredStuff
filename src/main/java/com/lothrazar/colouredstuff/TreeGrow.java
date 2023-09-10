package com.lothrazar.colouredstuff;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class TreeGrow extends AbstractTreeGrower {

  public static final ResourceKey<ConfiguredFeature<?, ?>> TREE = FeatureUtils.createKey(ModMain.MODID + ":tree");

  @Override
  protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource rand, boolean fancy) {
    return TREE;
  }
}

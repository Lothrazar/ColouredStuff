package com.lothrazar.colouredstuff.world;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class RainbowTreeGrower extends AbstractTreeGrower {

  //  public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK = FeatureUtils.createKey(ModMain.MODID + ":tree_black");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE = FeatureUtils.createKey(ModMain.MODID + ":tree_blue");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN = FeatureUtils.createKey(ModMain.MODID + ":tree_brown");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN = FeatureUtils.createKey(ModMain.MODID + ":tree_cyan");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY = FeatureUtils.createKey(ModMain.MODID + ":tree_gray");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN = FeatureUtils.createKey(ModMain.MODID + ":tree_green");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE = FeatureUtils.createKey(ModMain.MODID + ":tree_light_blue");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY = FeatureUtils.createKey(ModMain.MODID + ":tree_light_gray");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> LIME = FeatureUtils.createKey(ModMain.MODID + ":tree_lime");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA = FeatureUtils.createKey(ModMain.MODID + ":tree_magenta");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE = FeatureUtils.createKey(ModMain.MODID + ":tree_orange");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> PINK = FeatureUtils.createKey(ModMain.MODID + ":tree_pink");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE = FeatureUtils.createKey(ModMain.MODID + ":tree_purple");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> RED = FeatureUtils.createKey(ModMain.MODID + ":tree_red");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE = FeatureUtils.createKey(ModMain.MODID + ":tree_white");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW = FeatureUtils.createKey(ModMain.MODID + ":tree_yellow");
  //
  public static final Map<DyeColorless, ResourceKey> RAINBOW_OF_TREES = new HashMap<>() {

    {
      put(DyeColorless.BLACK, FeatureUtils.createKey(ModColourable.MODID + ":tree_black"));
      put(DyeColorless.BLUE, FeatureUtils.createKey(ModColourable.MODID + ":tree_blue"));
      put(DyeColorless.BROWN, FeatureUtils.createKey(ModColourable.MODID + ":tree_brown"));
      put(DyeColorless.CYAN, FeatureUtils.createKey(ModColourable.MODID + ":tree_cyan"));
      put(DyeColorless.GRAY, FeatureUtils.createKey(ModColourable.MODID + ":tree_gray"));
      put(DyeColorless.GREEN, FeatureUtils.createKey(ModColourable.MODID + ":tree_green"));
      put(DyeColorless.LIGHT_BLUE, FeatureUtils.createKey(ModColourable.MODID + ":tree_light_blue"));
      put(DyeColorless.LIGHT_GRAY, FeatureUtils.createKey(ModColourable.MODID + ":tree_light_gray"));
      put(DyeColorless.LIME, FeatureUtils.createKey(ModColourable.MODID + ":tree_lime"));
      put(DyeColorless.MAGENTA, FeatureUtils.createKey(ModColourable.MODID + ":tree_magenta"));
      put(DyeColorless.ORANGE, FeatureUtils.createKey(ModColourable.MODID + ":tree_orange"));
      put(DyeColorless.PINK, FeatureUtils.createKey(ModColourable.MODID + ":tree_pink"));
      put(DyeColorless.PURPLE, FeatureUtils.createKey(ModColourable.MODID + ":tree_purple"));
      put(DyeColorless.RED, FeatureUtils.createKey(ModColourable.MODID + ":tree_red"));
      put(DyeColorless.WHITE, FeatureUtils.createKey(ModColourable.MODID + ":tree_white"));
      put(DyeColorless.YELLOW, FeatureUtils.createKey(ModColourable.MODID + ":tree_yellow"));
      put(DyeColorless.NONE, FeatureUtils.createKey(ModColourable.MODID + ":tree_none"));
    }
  };

  @Override
  protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource rand, boolean hasFlowers) {
    return RAINBOW_OF_TREES.get(DyeColorless.NONE); // default
  }

  @Override
  public boolean growTree(ServerLevel level, ChunkGenerator cgen, BlockPos pos, BlockState saplingState, RandomSource rand) {
    final boolean hasFlowers = false;
    var resourcekey = this.getConfiguredFeature(rand, hasFlowers); //default 
    if (saplingState.hasProperty(BlockColour.COLOR)) {
      DyeColorless color = saplingState.getValue(BlockColour.COLOR);
      resourcekey = RAINBOW_OF_TREES.get(color);
    }
    if (resourcekey == null) {
      return false;
    }
    else {
      Holder<ConfiguredFeature<?, ?>> holder = level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolder(resourcekey).orElse((Holder.Reference<ConfiguredFeature<?, ?>>) null);
      var event = net.minecraftforge.event.ForgeEventFactory.blockGrowFeature(level, rand, pos, holder);
      holder = event.getFeature();
      if (event.getResult() == net.minecraftforge.eventbus.api.Event.Result.DENY) return false;
      if (holder == null) {
        return false;
      }
      else {
        ConfiguredFeature<?, ?> configuredfeature = holder.value();
        BlockState blockstate = level.getFluidState(pos).createLegacyBlock();
        level.setBlock(pos, blockstate, 4);
        if (configuredfeature.place(level, cgen, rand, pos)) {
          if (level.getBlockState(pos) == blockstate) {
            level.sendBlockUpdated(pos, saplingState, blockstate, 2);
          }
          return true;
        }
        else {
          level.setBlock(pos, saplingState, 4);
          return false;
        }
      }
    }
  }
}

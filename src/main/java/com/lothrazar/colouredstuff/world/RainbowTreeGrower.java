package com.lothrazar.colouredstuff.world;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.ModMain;
import com.lothrazar.colouredstuff.block.BlockColour;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
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
  public static final Map<DyeColor, ResourceKey> RAINBOW_OF_TREES = new HashMap<>() {

    {
      put(DyeColor.BLACK, FeatureUtils.createKey(ModMain.MODID + ":tree_black"));
      put(DyeColor.BLUE, FeatureUtils.createKey(ModMain.MODID + ":tree_blue"));
      put(DyeColor.BROWN, FeatureUtils.createKey(ModMain.MODID + ":tree_brown"));
      put(DyeColor.CYAN, FeatureUtils.createKey(ModMain.MODID + ":tree_cyan"));
      put(DyeColor.GRAY, FeatureUtils.createKey(ModMain.MODID + ":tree_gray"));
      put(DyeColor.GREEN, FeatureUtils.createKey(ModMain.MODID + ":tree_green"));
      put(DyeColor.LIGHT_BLUE, FeatureUtils.createKey(ModMain.MODID + ":tree_light_blue"));
      put(DyeColor.LIGHT_GRAY, FeatureUtils.createKey(ModMain.MODID + ":tree_light_gray"));
      put(DyeColor.LIME, FeatureUtils.createKey(ModMain.MODID + ":tree_lime"));
      put(DyeColor.MAGENTA, FeatureUtils.createKey(ModMain.MODID + ":tree_magenta"));
      put(DyeColor.ORANGE, FeatureUtils.createKey(ModMain.MODID + ":tree_orange"));
      put(DyeColor.PINK, FeatureUtils.createKey(ModMain.MODID + ":tree_pink"));
      put(DyeColor.PURPLE, FeatureUtils.createKey(ModMain.MODID + ":tree_purple"));
      put(DyeColor.RED, FeatureUtils.createKey(ModMain.MODID + ":tree_red"));
      put(DyeColor.WHITE, FeatureUtils.createKey(ModMain.MODID + ":tree_white"));
      put(DyeColor.YELLOW, FeatureUtils.createKey(ModMain.MODID + ":tree_yellow"));
    }
  };

  @Override
  protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource rand, boolean hasFlowers) {
    return RAINBOW_OF_TREES.get(DyeColor.WHITE); // default
  }

  @Override
  public boolean growTree(ServerLevel level, ChunkGenerator cgen, BlockPos pos, BlockState saplingState, RandomSource rand) {
    System.out.println("growTree " + saplingState);
    System.out.println("growTree " + saplingState);
    System.out.println("growTree " + saplingState);
    System.out.println("growTree " + saplingState);
    System.out.println("growTree " + saplingState);
    final boolean hasFlowers = false;
    var resourcekey = this.getConfiguredFeature(rand, hasFlowers); //default 
    if (saplingState.hasProperty(BlockColour.COLOR)) {
      var color = saplingState.getValue(BlockColour.COLOR);
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

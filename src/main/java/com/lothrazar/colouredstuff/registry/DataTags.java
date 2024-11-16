package com.lothrazar.colouredstuff.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DataTags {

  public static final TagKey<Block> WOODEN_GATES = BlockTags.create(new ResourceLocation("forge", "fence_gates/wooden"));
  public static final TagKey<Block> BRICKS = BlockTags.create(new ResourceLocation("forge", "bricks"));
  public static final TagKey<Block> STONE = BlockTags.create(new ResourceLocation("forge", "stone"));
  public static final TagKey<Block> COBBLESTONE = BlockTags.create(new ResourceLocation("forge", "cobblestone"));
  public static final TagKey<Block> SANDSTONE = BlockTags.create(new ResourceLocation("forge", "sandstone"));
  public static final TagKey<Block> SANDSTONE_CHISELED = BlockTags.create(new ResourceLocation("forge", "chiseled_sandstone"));
  public static final TagKey<Block> SANDSTONE_CUT = BlockTags.create(new ResourceLocation("forge", "cut_sandstone"));
  public static final TagKey<Block> SANDSTONE_SMOOTH = BlockTags.create(new ResourceLocation("forge", "smooth_sandstone"));
  //
  public static final TagKey<Block> STRIPPED_LOGS = BlockTags.create(new ResourceLocation("forge", "stripped_logs"));
  public static final TagKey<Block> STRIPPED_WOOD = BlockTags.create(new ResourceLocation("forge", "stripped_wood"));
  public static final TagKey<Block> WOOD = BlockTags.create(new ResourceLocation("forge", "wood"));
  //
  public static final TagKey<Block> BRICK_STAIRS = BlockTags.create(new ResourceLocation("forge", "brick_stairs"));
  public static final TagKey<Block> COBBLESTONE_STAIRS = BlockTags.create(new ResourceLocation("forge", "cobblestone_stairs"));
  public static final TagKey<Block> SANDSTONE_STAIRS = BlockTags.create(new ResourceLocation("forge", "sandstone_stairs"));
  public static final TagKey<Block> STONE_BRICK_STAIRS = BlockTags.create(new ResourceLocation("forge", "stone_brick_stairs"));
  public static final TagKey<Block> STONE_STAIRS = BlockTags.create(new ResourceLocation("forge", "stone_stairs"));
  //
  public static final TagKey<Block> BRICK_SLAB = BlockTags.create(new ResourceLocation("forge", "brick_slab"));
  public static final TagKey<Block> COBBLESTONE_SLAB = BlockTags.create(new ResourceLocation("forge", "cobblestone_slab"));
  public static final TagKey<Block> SANDSTONE_SLAB = BlockTags.create(new ResourceLocation("forge", "sandstone_slab"));
  public static final TagKey<Block> STONE_BRICK_SLAB = BlockTags.create(new ResourceLocation("forge", "stone_brick_slab"));
  public static final TagKey<Block> STONE_SLAB = BlockTags.create(new ResourceLocation("forge", "stone_slab"));
  //
  public static final TagKey<Block> BRICK_WALLS = BlockTags.create(new ResourceLocation("forge", "brick_walls"));
  public static final TagKey<Block> COBBLESTONE_WALLS = BlockTags.create(new ResourceLocation("forge", "cobblestone_walls"));
  public static final TagKey<Block> SANDSTONE_WALLS = BlockTags.create(new ResourceLocation("forge", "sandstone_walls"));
  public static final TagKey<Block> STONE_BRICK_WALLS = BlockTags.create(new ResourceLocation("forge", "stone_brick_walls"));
  public static final TagKey<Block> STONE_WALLS = BlockTags.create(new ResourceLocation("forge", "stone_walls"));
  public static final TagKey<Block> WOODEN_WALLS = BlockTags.create(new ResourceLocation("forge", "wooden_walls"));
}
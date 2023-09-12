package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColourableBlockRegistry {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModColourable.MODID);
  public static final RegistryObject<BlockColour> PLANKS_BLACK = BLOCKS.register("planks_black", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> PLANKS_BLUE = BLOCKS.register("planks_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> PLANKS_brown = BLOCKS.register("planks_brown", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_cyan = BLOCKS.register("planks_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_gray = BLOCKS.register("planks_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_green = BLOCKS.register("planks_green", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_light_blue = BLOCKS.register("planks_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_light_gray = BLOCKS.register("planks_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_lime = BLOCKS.register("planks_lime", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_magenta = BLOCKS.register("planks_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_none = BLOCKS.register("planks_none", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_orange = BLOCKS.register("planks_orange", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_pink = BLOCKS.register("planks_pink", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_purple = BLOCKS.register("planks_purple", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_red = BLOCKS.register("planks_red", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_white = BLOCKS.register("planks_white", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_yellow = BLOCKS.register("planks_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
}

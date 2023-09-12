package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.block.BlockColourPillar;
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
  //
  public static final RegistryObject<BlockColour> PLANKS_none = BLOCKS.register("planks_none", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> planks_black = BLOCKS.register("planks_black", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> planks_blue = BLOCKS.register("planks_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> PLANKS_brown = BLOCKS.register("planks_brown", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_cyan = BLOCKS.register("planks_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_gray = BLOCKS.register("planks_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_green = BLOCKS.register("planks_green", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_light_blue = BLOCKS.register("planks_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_light_gray = BLOCKS.register("planks_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_lime = BLOCKS.register("planks_lime", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_magenta = BLOCKS.register("planks_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_orange = BLOCKS.register("planks_orange", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_pink = BLOCKS.register("planks_pink", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_purple = BLOCKS.register("planks_purple", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_red = BLOCKS.register("planks_red", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_white = BLOCKS.register("planks_white", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> PLANKS_yellow = BLOCKS.register("planks_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  //
  public static final RegistryObject<BlockColour> log_none = BLOCKS.register("log_none", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_black = BLOCKS.register("log_black", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_blue = BLOCKS.register("log_blue", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_brown = BLOCKS.register("log_brown", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_cyan = BLOCKS.register("log_cyan", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_gray = BLOCKS.register("log_gray", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_green = BLOCKS.register("log_green", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_light_blue = BLOCKS.register("log_light_blue", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_light_gray = BLOCKS.register("log_light_gray", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_lime = BLOCKS.register("log_lime", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_magenta = BLOCKS.register("log_magenta", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_orange = BLOCKS.register("log_orange", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_pink = BLOCKS.register("log_pink", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_purple = BLOCKS.register("log_purple", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_red = BLOCKS.register("log_red", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_white = BLOCKS.register("log_white", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> log_yellow = BLOCKS.register("log_yellow", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), new BlockFlib.Settings()));
  //
  public static final RegistryObject<BlockColour> stone_none = BLOCKS.register("stone_none", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_black = BLOCKS.register("stone_black", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_blue = BLOCKS.register("stone_blue", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_brown = BLOCKS.register("stone_brown", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_cyan = BLOCKS.register("stone_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_gray = BLOCKS.register("stone_gray", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_green = BLOCKS.register("stone_green", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_light_blue = BLOCKS.register("stone_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_light_gray = BLOCKS.register("stone_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_lime = BLOCKS.register("stone_lime", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_magenta = BLOCKS.register("stone_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_orange = BLOCKS.register("stone_orange", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_pink = BLOCKS.register("stone_pink", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_purple = BLOCKS.register("stone_purple", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_red = BLOCKS.register("stone_red", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_white = BLOCKS.register("stone_white", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> stone_yellow = BLOCKS.register("stone_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  //
  public static final RegistryObject<BlockColour> cobblestone_none = BLOCKS.register("cobblestone_none", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_black = BLOCKS.register("cobblestone_black", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_blue = BLOCKS.register("cobblestone_blue", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_brown = BLOCKS.register("cobblestone_brown", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_cyan = BLOCKS.register("cobblestone_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_gray = BLOCKS.register("cobblestone_gray", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_green = BLOCKS.register("cobblestone_green", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_light_blue = BLOCKS.register("cobblestone_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_light_gray = BLOCKS.register("cobblestone_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_lime = BLOCKS.register("cobblestone_lime", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_magenta = BLOCKS.register("cobblestone_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_orange = BLOCKS.register("cobblestone_orange", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_pink = BLOCKS.register("cobblestone_pink", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_purple = BLOCKS.register("cobblestone_purple", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_red = BLOCKS.register("cobblestone_red", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_white = BLOCKS.register("cobblestone_white", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<BlockColour> cobblestone_yellow = BLOCKS.register("cobblestone_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  //
}

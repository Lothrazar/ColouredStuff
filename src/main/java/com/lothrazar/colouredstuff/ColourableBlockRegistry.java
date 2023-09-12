package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.block.BlockColourDirt;
import com.lothrazar.colouredstuff.block.BlockColourPathy;
import com.lothrazar.colouredstuff.block.BlockColourPillar;
import com.lothrazar.colouredstuff.block.BlockColourSaplin;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.world.RainbowTreeGrower;
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
  public static final RegistryObject<BlockColour> PLANKS_none = BLOCKS.register("planks_none", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> planks_black = BLOCKS.register("planks_black", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.BLACK)); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> planks_blue = BLOCKS.register("planks_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.BLUE)); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> PLANKS_brown = BLOCKS.register("planks_brown", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> PLANKS_cyan = BLOCKS.register("planks_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> PLANKS_gray = BLOCKS.register("planks_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> PLANKS_green = BLOCKS.register("planks_green", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> PLANKS_light_blue = BLOCKS.register("planks_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> PLANKS_light_gray = BLOCKS.register("planks_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> PLANKS_lime = BLOCKS.register("planks_lime", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> PLANKS_magenta = BLOCKS.register("planks_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> PLANKS_orange = BLOCKS.register("planks_orange", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> PLANKS_pink = BLOCKS.register("planks_pink", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> PLANKS_purple = BLOCKS.register("planks_purple", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> PLANKS_red = BLOCKS.register("planks_red", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.RED));
  public static final RegistryObject<BlockColour> PLANKS_white = BLOCKS.register("planks_white", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> PLANKS_yellow = BLOCKS.register("planks_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColour> log_none = BLOCKS.register("log_none", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> log_black = BLOCKS.register("log_black", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> log_blue = BLOCKS.register("log_blue", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> log_brown = BLOCKS.register("log_brown", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> log_cyan = BLOCKS.register("log_cyan", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> log_gray = BLOCKS.register("log_gray", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> log_green = BLOCKS.register("log_green", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> log_light_blue = BLOCKS.register("log_light_blue", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> log_light_gray = BLOCKS.register("log_light_gray", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> log_lime = BLOCKS.register("log_lime", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> log_magenta = BLOCKS.register("log_magenta", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> log_orange = BLOCKS.register("log_orange", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> log_pink = BLOCKS.register("log_pink", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> log_purple = BLOCKS.register("log_purple", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> log_red = BLOCKS.register("log_red", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.RED));
  public static final RegistryObject<BlockColour> log_white = BLOCKS.register("log_white", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> log_yellow = BLOCKS.register("log_yellow", () -> new BlockColourPillar(Block.Properties.copy(Blocks.OAK_LOG), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColour> stone_none = BLOCKS.register("stone_none", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> stone_black = BLOCKS.register("stone_black", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> stone_blue = BLOCKS.register("stone_blue", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> stone_brown = BLOCKS.register("stone_brown", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> stone_cyan = BLOCKS.register("stone_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> stone_gray = BLOCKS.register("stone_gray", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> stone_green = BLOCKS.register("stone_green", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> stone_light_blue = BLOCKS.register("stone_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> stone_light_gray = BLOCKS.register("stone_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> stone_lime = BLOCKS.register("stone_lime", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> stone_magenta = BLOCKS.register("stone_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> stone_orange = BLOCKS.register("stone_orange", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> stone_pink = BLOCKS.register("stone_pink", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> stone_purple = BLOCKS.register("stone_purple", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> stone_red = BLOCKS.register("stone_red", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.RED));
  public static final RegistryObject<BlockColour> stone_white = BLOCKS.register("stone_white", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> stone_yellow = BLOCKS.register("stone_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColour> cobblestone_none = BLOCKS.register("cobblestone_none", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> cobblestone_black = BLOCKS.register("cobblestone_black", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> cobblestone_blue = BLOCKS.register("cobblestone_blue", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> cobblestone_brown = BLOCKS.register("cobblestone_brown", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> cobblestone_cyan = BLOCKS.register("cobblestone_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> cobblestone_gray = BLOCKS.register("cobblestone_gray", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> cobblestone_green = BLOCKS.register("cobblestone_green", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> cobblestone_light_blue = BLOCKS.register("cobblestone_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> cobblestone_light_gray = BLOCKS.register("cobblestone_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> cobblestone_lime = BLOCKS.register("cobblestone_lime", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> cobblestone_magenta = BLOCKS.register("cobblestone_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> cobblestone_orange = BLOCKS.register("cobblestone_orange", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> cobblestone_pink = BLOCKS.register("cobblestone_pink", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> cobblestone_purple = BLOCKS.register("cobblestone_purple", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> cobblestone_red = BLOCKS.register("cobblestone_red", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.RED));
  public static final RegistryObject<BlockColour> cobblestone_white = BLOCKS.register("cobblestone_white", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> cobblestone_yellow = BLOCKS.register("cobblestone_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColour> leaves_none = BLOCKS.register("leaves_none", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> leaves_black = BLOCKS.register("leaves_black", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> leaves_blue = BLOCKS.register("leaves_blue", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> leaves_brown = BLOCKS.register("leaves_brown", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> leaves_cyan = BLOCKS.register("leaves_cyan", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> leaves_gray = BLOCKS.register("leaves_gray", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> leaves_green = BLOCKS.register("leaves_green", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> leaves_light_blue = BLOCKS.register("leaves_light_blue", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> leaves_light_gray = BLOCKS.register("leaves_light_gray", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> leaves_lime = BLOCKS.register("leaves_lime", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> leaves_magenta = BLOCKS.register("leaves_magenta", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> leaves_orange = BLOCKS.register("leaves_orange", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> leaves_pink = BLOCKS.register("leaves_pink", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> leaves_purple = BLOCKS.register("leaves_purple", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> leaves_red = BLOCKS.register("leaves_red", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.RED));
  public static final RegistryObject<BlockColour> leaves_white = BLOCKS.register("leaves_white", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> leaves_yellow = BLOCKS.register("leaves_yellow", () -> new BlockColour(Block.Properties.copy(Blocks.OAK_LEAVES), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColourSaplin> sapling_none = BLOCKS.register("sapling_none", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.NONE));
  public static final RegistryObject<BlockColourSaplin> sapling_black = BLOCKS.register("sapling_black", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.BLACK));
  public static final RegistryObject<BlockColourSaplin> sapling_blue = BLOCKS.register("sapling_blue", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.BLUE));
  public static final RegistryObject<BlockColourSaplin> sapling_brown = BLOCKS.register("sapling_brown", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.BROWN));
  public static final RegistryObject<BlockColourSaplin> sapling_cyan = BLOCKS.register("sapling_cyan", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.CYAN));
  public static final RegistryObject<BlockColourSaplin> sapling_gray = BLOCKS.register("sapling_gray", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.GRAY));
  public static final RegistryObject<BlockColourSaplin> sapling_green = BLOCKS.register("sapling_green", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.GREEN));
  public static final RegistryObject<BlockColourSaplin> sapling_light_blue = BLOCKS.register("sapling_light_blue", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColourSaplin> sapling_light_gray = BLOCKS.register("sapling_light_gray", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColourSaplin> sapling_lime = BLOCKS.register("sapling_lime", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.LIME));
  public static final RegistryObject<BlockColourSaplin> sapling_magenta = BLOCKS.register("sapling_magenta", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColourSaplin> sapling_orange = BLOCKS.register("sapling_orange", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColourSaplin> sapling_pink = BLOCKS.register("sapling_pink", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.PINK));
  public static final RegistryObject<BlockColourSaplin> sapling_purple = BLOCKS.register("sapling_purple", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColourSaplin> sapling_red = BLOCKS.register("sapling_red", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.RED));
  public static final RegistryObject<BlockColourSaplin> sapling_white = BLOCKS.register("sapling_white", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.WHITE));
  public static final RegistryObject<BlockColourSaplin> sapling_yellow = BLOCKS.register("sapling_yellow", () -> new BlockColourSaplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), DyeColorless.YELLOW));
  // 
  public static final RegistryObject<BlockColour> dirt_none = BLOCKS.register("dirt_none", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> dirt_black = BLOCKS.register("dirt_black", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> dirt_blue = BLOCKS.register("dirt_blue", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> dirt_brown = BLOCKS.register("dirt_brown", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> dirt_cyan = BLOCKS.register("dirt_cyan", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> dirt_gray = BLOCKS.register("dirt_gray", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> dirt_green = BLOCKS.register("dirt_green", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> dirt_light_blue = BLOCKS.register("dirt_light_blue", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> dirt_light_gray = BLOCKS.register("dirt_light_gray", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> dirt_lime = BLOCKS.register("dirt_lime", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> dirt_magenta = BLOCKS.register("dirt_magenta", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> dirt_orange = BLOCKS.register("dirt_orange", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> dirt_pink = BLOCKS.register("dirt_pink", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> dirt_purple = BLOCKS.register("dirt_purple", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> dirt_red = BLOCKS.register("dirt_red", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.RED));
  public static final RegistryObject<BlockColour> dirt_white = BLOCKS.register("dirt_white", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> dirt_yellow = BLOCKS.register("dirt_yellow", () -> new BlockColourDirt(Block.Properties.copy(Blocks.DIRT), DyeColorless.YELLOW));
  //
  public static final RegistryObject<BlockColour> path_none = BLOCKS.register("path_none", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.NONE));
  public static final RegistryObject<BlockColour> path_black = BLOCKS.register("path_black", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.BLACK));
  public static final RegistryObject<BlockColour> path_blue = BLOCKS.register("path_blue", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.BLUE));
  public static final RegistryObject<BlockColour> path_brown = BLOCKS.register("path_brown", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.BROWN));
  public static final RegistryObject<BlockColour> path_cyan = BLOCKS.register("path_cyan", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.CYAN));
  public static final RegistryObject<BlockColour> path_gray = BLOCKS.register("path_gray", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.GRAY));
  public static final RegistryObject<BlockColour> path_green = BLOCKS.register("path_green", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.GREEN));
  public static final RegistryObject<BlockColour> path_light_blue = BLOCKS.register("path_light_blue", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.LIGHT_BLUE));
  public static final RegistryObject<BlockColour> path_light_gray = BLOCKS.register("path_light_gray", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.LIGHT_GRAY));
  public static final RegistryObject<BlockColour> path_lime = BLOCKS.register("path_lime", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.LIME));
  public static final RegistryObject<BlockColour> path_magenta = BLOCKS.register("path_magenta", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.MAGENTA));
  public static final RegistryObject<BlockColour> path_orange = BLOCKS.register("path_orange", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.ORANGE));
  public static final RegistryObject<BlockColour> path_pink = BLOCKS.register("path_pink", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.PINK));
  public static final RegistryObject<BlockColour> path_purple = BLOCKS.register("path_purple", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.PURPLE));
  public static final RegistryObject<BlockColour> path_red = BLOCKS.register("path_red", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.RED));
  public static final RegistryObject<BlockColour> path_white = BLOCKS.register("path_white", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.WHITE));
  public static final RegistryObject<BlockColour> path_yellow = BLOCKS.register("path_yellow", () -> new BlockColourPathy(Block.Properties.copy(Blocks.DIRT_PATH), DyeColorless.YELLOW));
  //
}

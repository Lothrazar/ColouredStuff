package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.item.ItemColour;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColourableItemRegistry {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModColourable.MODID);
  public static final RegistryObject<Item> PLANKS_none = ITEMS.register("planks_none", () -> new ItemColour(ColourableBlockRegistry.PLANKS_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_BLACK = ITEMS.register("planks_black", () -> new ItemColour(ColourableBlockRegistry.planks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_BLUE = ITEMS.register("planks_blue", () -> new ItemColour(ColourableBlockRegistry.planks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_brown = ITEMS.register("planks_brown", () -> new ItemColour(ColourableBlockRegistry.PLANKS_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_cyan = ITEMS.register("planks_cyan", () -> new ItemColour(ColourableBlockRegistry.PLANKS_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_gray = ITEMS.register("planks_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_green = ITEMS.register("planks_green", () -> new ItemColour(ColourableBlockRegistry.PLANKS_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_light_blue = ITEMS.register("planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_light_gray = ITEMS.register("planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_lime = ITEMS.register("planks_lime", () -> new ItemColour(ColourableBlockRegistry.PLANKS_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_magenta = ITEMS.register("planks_magenta", () -> new ItemColour(ColourableBlockRegistry.PLANKS_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_orange = ITEMS.register("planks_orange", () -> new ItemColour(ColourableBlockRegistry.PLANKS_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_pink = ITEMS.register("planks_pink", () -> new ItemColour(ColourableBlockRegistry.PLANKS_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_purple = ITEMS.register("planks_purple", () -> new ItemColour(ColourableBlockRegistry.PLANKS_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_red = ITEMS.register("planks_red", () -> new ItemColour(ColourableBlockRegistry.PLANKS_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_white = ITEMS.register("planks_white", () -> new ItemColour(ColourableBlockRegistry.PLANKS_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_yellow = ITEMS.register("planks_yellow", () -> new ItemColour(ColourableBlockRegistry.PLANKS_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> log_none = ITEMS.register("log_none", () -> new ItemColour(ColourableBlockRegistry.log_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_BLACK = ITEMS.register("log_black", () -> new ItemColour(ColourableBlockRegistry.log_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_BLUE = ITEMS.register("log_blue", () -> new ItemColour(ColourableBlockRegistry.log_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_brown = ITEMS.register("log_brown", () -> new ItemColour(ColourableBlockRegistry.log_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_cyan = ITEMS.register("log_cyan", () -> new ItemColour(ColourableBlockRegistry.log_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_gray = ITEMS.register("log_gray", () -> new ItemColour(ColourableBlockRegistry.log_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_green = ITEMS.register("log_green", () -> new ItemColour(ColourableBlockRegistry.log_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_light_blue = ITEMS.register("log_light_blue", () -> new ItemColour(ColourableBlockRegistry.log_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_light_gray = ITEMS.register("log_light_gray", () -> new ItemColour(ColourableBlockRegistry.log_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_lime = ITEMS.register("log_lime", () -> new ItemColour(ColourableBlockRegistry.log_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_magenta = ITEMS.register("log_magenta", () -> new ItemColour(ColourableBlockRegistry.log_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_orange = ITEMS.register("log_orange", () -> new ItemColour(ColourableBlockRegistry.log_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_pink = ITEMS.register("log_pink", () -> new ItemColour(ColourableBlockRegistry.log_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_purple = ITEMS.register("log_purple", () -> new ItemColour(ColourableBlockRegistry.log_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_red = ITEMS.register("log_red", () -> new ItemColour(ColourableBlockRegistry.log_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_white = ITEMS.register("log_white", () -> new ItemColour(ColourableBlockRegistry.log_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_yellow = ITEMS.register("log_yellow", () -> new ItemColour(ColourableBlockRegistry.log_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> log_stripped_none = ITEMS.register("log_stripped_none", () -> new ItemColour(ColourableBlockRegistry.log_stripped_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_BLACK = ITEMS.register("log_stripped_black", () -> new ItemColour(ColourableBlockRegistry.log_stripped_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_BLUE = ITEMS.register("log_stripped_blue", () -> new ItemColour(ColourableBlockRegistry.log_stripped_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_brown = ITEMS.register("log_stripped_brown", () -> new ItemColour(ColourableBlockRegistry.log_stripped_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_cyan = ITEMS.register("log_stripped_cyan", () -> new ItemColour(ColourableBlockRegistry.log_stripped_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_gray = ITEMS.register("log_stripped_gray", () -> new ItemColour(ColourableBlockRegistry.log_stripped_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_green = ITEMS.register("log_stripped_green", () -> new ItemColour(ColourableBlockRegistry.log_stripped_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_light_blue = ITEMS.register("log_stripped_light_blue", () -> new ItemColour(ColourableBlockRegistry.log_stripped_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_light_gray = ITEMS.register("log_stripped_light_gray", () -> new ItemColour(ColourableBlockRegistry.log_stripped_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_lime = ITEMS.register("log_stripped_lime", () -> new ItemColour(ColourableBlockRegistry.log_stripped_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_magenta = ITEMS.register("log_stripped_magenta", () -> new ItemColour(ColourableBlockRegistry.log_stripped_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_orange = ITEMS.register("log_stripped_orange", () -> new ItemColour(ColourableBlockRegistry.log_stripped_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_pink = ITEMS.register("log_stripped_pink", () -> new ItemColour(ColourableBlockRegistry.log_stripped_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_purple = ITEMS.register("log_stripped_purple", () -> new ItemColour(ColourableBlockRegistry.log_stripped_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_red = ITEMS.register("log_stripped_red", () -> new ItemColour(ColourableBlockRegistry.log_stripped_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_white = ITEMS.register("log_stripped_white", () -> new ItemColour(ColourableBlockRegistry.log_stripped_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> log_stripped_yellow = ITEMS.register("log_stripped_yellow", () -> new ItemColour(ColourableBlockRegistry.log_stripped_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> stone_none = ITEMS.register("stone_none", () -> new ItemColour(ColourableBlockRegistry.stone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_BLACK = ITEMS.register("stone_black", () -> new ItemColour(ColourableBlockRegistry.stone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_BLUE = ITEMS.register("stone_blue", () -> new ItemColour(ColourableBlockRegistry.stone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_brown = ITEMS.register("stone_brown", () -> new ItemColour(ColourableBlockRegistry.stone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_cyan = ITEMS.register("stone_cyan", () -> new ItemColour(ColourableBlockRegistry.stone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_gray = ITEMS.register("stone_gray", () -> new ItemColour(ColourableBlockRegistry.stone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_green = ITEMS.register("stone_green", () -> new ItemColour(ColourableBlockRegistry.stone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_light_blue = ITEMS.register("stone_light_blue", () -> new ItemColour(ColourableBlockRegistry.stone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_light_gray = ITEMS.register("stone_light_gray", () -> new ItemColour(ColourableBlockRegistry.stone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_lime = ITEMS.register("stone_lime", () -> new ItemColour(ColourableBlockRegistry.stone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_magenta = ITEMS.register("stone_magenta", () -> new ItemColour(ColourableBlockRegistry.stone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_orange = ITEMS.register("stone_orange", () -> new ItemColour(ColourableBlockRegistry.stone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_pink = ITEMS.register("stone_pink", () -> new ItemColour(ColourableBlockRegistry.stone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_purple = ITEMS.register("stone_purple", () -> new ItemColour(ColourableBlockRegistry.stone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_red = ITEMS.register("stone_red", () -> new ItemColour(ColourableBlockRegistry.stone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_white = ITEMS.register("stone_white", () -> new ItemColour(ColourableBlockRegistry.stone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_yellow = ITEMS.register("stone_yellow", () -> new ItemColour(ColourableBlockRegistry.stone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> cobblestone_none = ITEMS.register("cobblestone_none", () -> new ItemColour(ColourableBlockRegistry.cobblestone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_BLACK = ITEMS.register("cobblestone_black", () -> new ItemColour(ColourableBlockRegistry.cobblestone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_BLUE = ITEMS.register("cobblestone_blue", () -> new ItemColour(ColourableBlockRegistry.cobblestone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_brown = ITEMS.register("cobblestone_brown", () -> new ItemColour(ColourableBlockRegistry.cobblestone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_cyan = ITEMS.register("cobblestone_cyan", () -> new ItemColour(ColourableBlockRegistry.cobblestone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_gray = ITEMS.register("cobblestone_gray", () -> new ItemColour(ColourableBlockRegistry.cobblestone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_green = ITEMS.register("cobblestone_green", () -> new ItemColour(ColourableBlockRegistry.cobblestone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_light_blue = ITEMS.register("cobblestone_light_blue", () -> new ItemColour(ColourableBlockRegistry.cobblestone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_light_gray = ITEMS.register("cobblestone_light_gray", () -> new ItemColour(ColourableBlockRegistry.cobblestone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_lime = ITEMS.register("cobblestone_lime", () -> new ItemColour(ColourableBlockRegistry.cobblestone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_magenta = ITEMS.register("cobblestone_magenta", () -> new ItemColour(ColourableBlockRegistry.cobblestone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_orange = ITEMS.register("cobblestone_orange", () -> new ItemColour(ColourableBlockRegistry.cobblestone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_pink = ITEMS.register("cobblestone_pink", () -> new ItemColour(ColourableBlockRegistry.cobblestone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_purple = ITEMS.register("cobblestone_purple", () -> new ItemColour(ColourableBlockRegistry.cobblestone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_red = ITEMS.register("cobblestone_red", () -> new ItemColour(ColourableBlockRegistry.cobblestone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_white = ITEMS.register("cobblestone_white", () -> new ItemColour(ColourableBlockRegistry.cobblestone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> cobblestone_yellow = ITEMS.register("cobblestone_yellow", () -> new ItemColour(ColourableBlockRegistry.cobblestone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> leaves_none = ITEMS.register("leaves_none", () -> new ItemColour(ColourableBlockRegistry.leaves_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_BLACK = ITEMS.register("leaves_black", () -> new ItemColour(ColourableBlockRegistry.leaves_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_BLUE = ITEMS.register("leaves_blue", () -> new ItemColour(ColourableBlockRegistry.leaves_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_brown = ITEMS.register("leaves_brown", () -> new ItemColour(ColourableBlockRegistry.leaves_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_cyan = ITEMS.register("leaves_cyan", () -> new ItemColour(ColourableBlockRegistry.leaves_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_gray = ITEMS.register("leaves_gray", () -> new ItemColour(ColourableBlockRegistry.leaves_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_green = ITEMS.register("leaves_green", () -> new ItemColour(ColourableBlockRegistry.leaves_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_light_blue = ITEMS.register("leaves_light_blue", () -> new ItemColour(ColourableBlockRegistry.leaves_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_light_gray = ITEMS.register("leaves_light_gray", () -> new ItemColour(ColourableBlockRegistry.leaves_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_lime = ITEMS.register("leaves_lime", () -> new ItemColour(ColourableBlockRegistry.leaves_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_magenta = ITEMS.register("leaves_magenta", () -> new ItemColour(ColourableBlockRegistry.leaves_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_orange = ITEMS.register("leaves_orange", () -> new ItemColour(ColourableBlockRegistry.leaves_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_pink = ITEMS.register("leaves_pink", () -> new ItemColour(ColourableBlockRegistry.leaves_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_purple = ITEMS.register("leaves_purple", () -> new ItemColour(ColourableBlockRegistry.leaves_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_red = ITEMS.register("leaves_red", () -> new ItemColour(ColourableBlockRegistry.leaves_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_white = ITEMS.register("leaves_white", () -> new ItemColour(ColourableBlockRegistry.leaves_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> leaves_yellow = ITEMS.register("leaves_yellow", () -> new ItemColour(ColourableBlockRegistry.leaves_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> sapling_none = ITEMS.register("sapling_none", () -> new ItemColour(ColourableBlockRegistry.sapling_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_BLACK = ITEMS.register("sapling_black", () -> new ItemColour(ColourableBlockRegistry.sapling_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_BLUE = ITEMS.register("sapling_blue", () -> new ItemColour(ColourableBlockRegistry.sapling_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_brown = ITEMS.register("sapling_brown", () -> new ItemColour(ColourableBlockRegistry.sapling_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_cyan = ITEMS.register("sapling_cyan", () -> new ItemColour(ColourableBlockRegistry.sapling_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_gray = ITEMS.register("sapling_gray", () -> new ItemColour(ColourableBlockRegistry.sapling_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_green = ITEMS.register("sapling_green", () -> new ItemColour(ColourableBlockRegistry.sapling_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_light_blue = ITEMS.register("sapling_light_blue", () -> new ItemColour(ColourableBlockRegistry.sapling_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_light_gray = ITEMS.register("sapling_light_gray", () -> new ItemColour(ColourableBlockRegistry.sapling_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_lime = ITEMS.register("sapling_lime", () -> new ItemColour(ColourableBlockRegistry.sapling_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_magenta = ITEMS.register("sapling_magenta", () -> new ItemColour(ColourableBlockRegistry.sapling_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_orange = ITEMS.register("sapling_orange", () -> new ItemColour(ColourableBlockRegistry.sapling_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_pink = ITEMS.register("sapling_pink", () -> new ItemColour(ColourableBlockRegistry.sapling_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_purple = ITEMS.register("sapling_purple", () -> new ItemColour(ColourableBlockRegistry.sapling_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_red = ITEMS.register("sapling_red", () -> new ItemColour(ColourableBlockRegistry.sapling_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_white = ITEMS.register("sapling_white", () -> new ItemColour(ColourableBlockRegistry.sapling_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> sapling_yellow = ITEMS.register("sapling_yellow", () -> new ItemColour(ColourableBlockRegistry.sapling_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> dirt_none = ITEMS.register("dirt_none", () -> new ItemColour(ColourableBlockRegistry.dirt_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_BLACK = ITEMS.register("dirt_black", () -> new ItemColour(ColourableBlockRegistry.dirt_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_BLUE = ITEMS.register("dirt_blue", () -> new ItemColour(ColourableBlockRegistry.dirt_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_brown = ITEMS.register("dirt_brown", () -> new ItemColour(ColourableBlockRegistry.dirt_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_cyan = ITEMS.register("dirt_cyan", () -> new ItemColour(ColourableBlockRegistry.dirt_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_gray = ITEMS.register("dirt_gray", () -> new ItemColour(ColourableBlockRegistry.dirt_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_green = ITEMS.register("dirt_green", () -> new ItemColour(ColourableBlockRegistry.dirt_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_light_blue = ITEMS.register("dirt_light_blue", () -> new ItemColour(ColourableBlockRegistry.dirt_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_light_gray = ITEMS.register("dirt_light_gray", () -> new ItemColour(ColourableBlockRegistry.dirt_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_lime = ITEMS.register("dirt_lime", () -> new ItemColour(ColourableBlockRegistry.dirt_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_magenta = ITEMS.register("dirt_magenta", () -> new ItemColour(ColourableBlockRegistry.dirt_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_orange = ITEMS.register("dirt_orange", () -> new ItemColour(ColourableBlockRegistry.dirt_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_pink = ITEMS.register("dirt_pink", () -> new ItemColour(ColourableBlockRegistry.dirt_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_purple = ITEMS.register("dirt_purple", () -> new ItemColour(ColourableBlockRegistry.dirt_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_red = ITEMS.register("dirt_red", () -> new ItemColour(ColourableBlockRegistry.dirt_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_white = ITEMS.register("dirt_white", () -> new ItemColour(ColourableBlockRegistry.dirt_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> dirt_yellow = ITEMS.register("dirt_yellow", () -> new ItemColour(ColourableBlockRegistry.dirt_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> path_none = ITEMS.register("path_none", () -> new ItemColour(ColourableBlockRegistry.path_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_BLACK = ITEMS.register("path_black", () -> new ItemColour(ColourableBlockRegistry.path_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_BLUE = ITEMS.register("path_blue", () -> new ItemColour(ColourableBlockRegistry.path_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_brown = ITEMS.register("path_brown", () -> new ItemColour(ColourableBlockRegistry.path_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_cyan = ITEMS.register("path_cyan", () -> new ItemColour(ColourableBlockRegistry.path_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_gray = ITEMS.register("path_gray", () -> new ItemColour(ColourableBlockRegistry.path_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_green = ITEMS.register("path_green", () -> new ItemColour(ColourableBlockRegistry.path_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_light_blue = ITEMS.register("path_light_blue", () -> new ItemColour(ColourableBlockRegistry.path_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_light_gray = ITEMS.register("path_light_gray", () -> new ItemColour(ColourableBlockRegistry.path_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_lime = ITEMS.register("path_lime", () -> new ItemColour(ColourableBlockRegistry.path_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_magenta = ITEMS.register("path_magenta", () -> new ItemColour(ColourableBlockRegistry.path_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_orange = ITEMS.register("path_orange", () -> new ItemColour(ColourableBlockRegistry.path_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_pink = ITEMS.register("path_pink", () -> new ItemColour(ColourableBlockRegistry.path_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_purple = ITEMS.register("path_purple", () -> new ItemColour(ColourableBlockRegistry.path_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_red = ITEMS.register("path_red", () -> new ItemColour(ColourableBlockRegistry.path_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_white = ITEMS.register("path_white", () -> new ItemColour(ColourableBlockRegistry.path_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> path_yellow = ITEMS.register("path_yellow", () -> new ItemColour(ColourableBlockRegistry.path_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  // 
  public static final RegistryObject<Item> farmland_none = ITEMS.register("farmland_none", () -> new ItemColour(ColourableBlockRegistry.farmland_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_BLACK = ITEMS.register("farmland_black", () -> new ItemColour(ColourableBlockRegistry.farmland_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_BLUE = ITEMS.register("farmland_blue", () -> new ItemColour(ColourableBlockRegistry.farmland_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_brown = ITEMS.register("farmland_brown", () -> new ItemColour(ColourableBlockRegistry.farmland_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_cyan = ITEMS.register("farmland_cyan", () -> new ItemColour(ColourableBlockRegistry.farmland_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_gray = ITEMS.register("farmland_gray", () -> new ItemColour(ColourableBlockRegistry.farmland_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_green = ITEMS.register("farmland_green", () -> new ItemColour(ColourableBlockRegistry.farmland_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_light_blue = ITEMS.register("farmland_light_blue", () -> new ItemColour(ColourableBlockRegistry.farmland_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_light_gray = ITEMS.register("farmland_light_gray", () -> new ItemColour(ColourableBlockRegistry.farmland_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_lime = ITEMS.register("farmland_lime", () -> new ItemColour(ColourableBlockRegistry.farmland_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_magenta = ITEMS.register("farmland_magenta", () -> new ItemColour(ColourableBlockRegistry.farmland_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_orange = ITEMS.register("farmland_orange", () -> new ItemColour(ColourableBlockRegistry.farmland_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_pink = ITEMS.register("farmland_pink", () -> new ItemColour(ColourableBlockRegistry.farmland_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_purple = ITEMS.register("farmland_purple", () -> new ItemColour(ColourableBlockRegistry.farmland_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_red = ITEMS.register("farmland_red", () -> new ItemColour(ColourableBlockRegistry.farmland_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_white = ITEMS.register("farmland_white", () -> new ItemColour(ColourableBlockRegistry.farmland_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> farmland_yellow = ITEMS.register("farmland_yellow", () -> new ItemColour(ColourableBlockRegistry.farmland_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final RegistryObject<Item> stone_bricks_none = ITEMS.register("stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_BLACK = ITEMS.register("stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_BLUE = ITEMS.register("stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_brown = ITEMS.register("stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_cyan = ITEMS.register("stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_gray = ITEMS.register("stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_green = ITEMS.register("stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_light_blue = ITEMS.register("stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_light_gray = ITEMS.register("stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_lime = ITEMS.register("stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_magenta = ITEMS.register("stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_orange = ITEMS.register("stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_pink = ITEMS.register("stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_purple = ITEMS.register("stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_red = ITEMS.register("stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_white = ITEMS.register("stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final RegistryObject<Item> stone_bricks_yellow = ITEMS.register("stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final TagKey<Item> DYES_NONE = ItemTags.create(new ResourceLocation("forge:dyes/none"));
  private static final ResourceKey<CreativeModeTab> TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ModColourable.MODID, "tab"));

  @SubscribeEvent
  public static void onCreativeModeTabRegister(RegisterEvent event) {
    event.register(Registries.CREATIVE_MODE_TAB, helper -> {
      helper.register(TAB, CreativeModeTab.builder().icon(() -> new ItemStack(PLANKS_BLACK.get()))
          .title(Component.translatable("itemGroup." + ModColourable.MODID))
          .displayItems((enabledFlags, populator) -> {
            for (RegistryObject<Item> entry : ITEMS.getEntries()) {
              populator.accept(entry.get());
            }
          }).build());
    });
  }
}

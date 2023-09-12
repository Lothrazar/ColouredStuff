package com.lothrazar.colouredstuff;

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
  public static final RegistryObject<Item> PLANKS_BLACK = ITEMS.register("planks_black", () -> new ItemColour(ColourableBlockRegistry.planks_black.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_BLUE = ITEMS.register("planks_blue", () -> new ItemColour(ColourableBlockRegistry.planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_brown = ITEMS.register("planks_brown", () -> new ItemColour(ColourableBlockRegistry.PLANKS_brown.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_cyan = ITEMS.register("planks_cyan", () -> new ItemColour(ColourableBlockRegistry.PLANKS_cyan.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_gray = ITEMS.register("planks_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_gray.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_green = ITEMS.register("planks_green", () -> new ItemColour(ColourableBlockRegistry.PLANKS_green.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_light_blue = ITEMS.register("planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_light_gray = ITEMS.register("planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_lime = ITEMS.register("planks_lime", () -> new ItemColour(ColourableBlockRegistry.PLANKS_lime.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_magenta = ITEMS.register("planks_magenta", () -> new ItemColour(ColourableBlockRegistry.PLANKS_magenta.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_none = ITEMS.register("planks_none", () -> new ItemColour(ColourableBlockRegistry.PLANKS_none.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_orange = ITEMS.register("planks_orange", () -> new ItemColour(ColourableBlockRegistry.PLANKS_orange.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_pink = ITEMS.register("planks_pink", () -> new ItemColour(ColourableBlockRegistry.PLANKS_pink.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_purple = ITEMS.register("planks_purple", () -> new ItemColour(ColourableBlockRegistry.PLANKS_purple.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_red = ITEMS.register("planks_red", () -> new ItemColour(ColourableBlockRegistry.PLANKS_red.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_white = ITEMS.register("planks_white", () -> new ItemColour(ColourableBlockRegistry.PLANKS_white.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_yellow = ITEMS.register("planks_yellow", () -> new ItemColour(ColourableBlockRegistry.PLANKS_yellow.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //
  public static final RegistryObject<Item> log_BLACK = ITEMS.register("log_black", () -> new ItemColour(ColourableBlockRegistry.log_black.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_BLUE = ITEMS.register("log_blue", () -> new ItemColour(ColourableBlockRegistry.log_blue.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_brown = ITEMS.register("log_brown", () -> new ItemColour(ColourableBlockRegistry.log_brown.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_cyan = ITEMS.register("log_cyan", () -> new ItemColour(ColourableBlockRegistry.log_cyan.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_gray = ITEMS.register("log_gray", () -> new ItemColour(ColourableBlockRegistry.log_gray.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_green = ITEMS.register("log_green", () -> new ItemColour(ColourableBlockRegistry.log_green.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_light_blue = ITEMS.register("log_light_blue", () -> new ItemColour(ColourableBlockRegistry.log_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_light_gray = ITEMS.register("log_light_gray", () -> new ItemColour(ColourableBlockRegistry.log_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_lime = ITEMS.register("log_lime", () -> new ItemColour(ColourableBlockRegistry.log_lime.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_magenta = ITEMS.register("log_magenta", () -> new ItemColour(ColourableBlockRegistry.log_magenta.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_none = ITEMS.register("log_none", () -> new ItemColour(ColourableBlockRegistry.log_none.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_orange = ITEMS.register("log_orange", () -> new ItemColour(ColourableBlockRegistry.log_orange.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_pink = ITEMS.register("log_pink", () -> new ItemColour(ColourableBlockRegistry.log_pink.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_purple = ITEMS.register("log_purple", () -> new ItemColour(ColourableBlockRegistry.log_purple.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_red = ITEMS.register("log_red", () -> new ItemColour(ColourableBlockRegistry.log_red.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_white = ITEMS.register("log_white", () -> new ItemColour(ColourableBlockRegistry.log_white.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> log_yellow = ITEMS.register("log_yellow", () -> new ItemColour(ColourableBlockRegistry.log_yellow.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //
  //
  //  public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new ItemColour(BRICKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new ItemColour(SANDSTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> LOG_ITEM = ITEMS.register("log", () -> new ItemColour(LOG_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> LOG_STR_ITEM = ITEMS.register("log_stripped", () -> new ItemColour(LOG_STR_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> LEAVES_ITEM = ITEMS.register("leaves", () -> new ItemColour(LEAVES_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> SANDSTONE_CH_ITEM = ITEMS.register("chiseled_sandstone", () -> new ItemColour(SANDSTONE_CH_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> STONE_ITEM = ITEMS.register("stone", () -> new ItemColour(STONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> COBBLE_ITEM = ITEMS.register("cobblestone", () -> new ItemColour(COBBLESTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> SAPLIN = ITEMS.register("sapling", () -> new ItemColour(SAPLIN_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("dirt", () -> new ItemColour(DIRT_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> PATH_ITEM = ITEMS.register("path", () -> new ItemColour(PATH_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  //  public static final RegistryObject<Item> FARM_ITEM = ITEMS.register("farmland", () -> new ItemColour(FARM_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
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

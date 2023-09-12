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
  //  public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new ItemColour(BRICKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new ItemColour(SANDSTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> LOG_STR_ITEM = ITEMS.register("log_stripped", () -> new ItemColour(LOG_STR_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> SANDSTONE_CH_ITEM = ITEMS.register("chiseled_sandstone", () -> new ItemColour(SANDSTONE_CH_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> SAPLIN = ITEMS.register("sapling", () -> new ItemColour(SAPLIN_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("dirt", () -> new ItemColour(DIRT_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> PATH_ITEM = ITEMS.register("path", () -> new ItemColour(PATH_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  public static final RegistryObject<Item> FARM_ITEM = ITEMS.register("farmland", () -> new ItemColour(FARM_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings()));
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

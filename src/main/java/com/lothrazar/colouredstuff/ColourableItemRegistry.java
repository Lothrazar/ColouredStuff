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
  public static final RegistryObject<Item> PLANKS_BLACK = ITEMS.register("planks_black", () -> new ItemColour(ColourableBlockRegistry.PLANKS_BLACK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> PLANKS_BLUE = ITEMS.register("planks_blue", () -> new ItemColour(ColourableBlockRegistry.PLANKS_BLUE.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
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

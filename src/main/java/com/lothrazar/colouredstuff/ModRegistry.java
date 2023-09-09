package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.block.BlockColourLog;
import com.lothrazar.library.block.BlockFlib;
import com.lothrazar.library.item.BlockItemFlib;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMain.MODID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModMain.MODID);
  public static final RegistryObject<Block> PLANKS_BLOCK = BLOCKS.register("planks", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS).strength(2.0F, 3.0F), new BlockFlib.Settings()));
  public static final RegistryObject<Block> BRICKS_BLOCK = BLOCKS.register("bricks", () -> new BlockColour(Block.Properties.copy(Blocks.STONE_BRICKS).strength(1.5F, 6.0F), new BlockFlib.Settings()));
  public static final RegistryObject<Block> SANDSTONE_BLOCK = BLOCKS.register("sandstone", () -> new BlockColour(Block.Properties.copy(Blocks.SANDSTONE).strength(0.8F), new BlockFlib.Settings()));
  public static final RegistryObject<Block> DIRT_BLOCK = BLOCKS.register("dirt", () -> new BlockColour(Block.Properties.copy(Blocks.DIRT), new BlockFlib.Settings()));
  public static final RegistryObject<Block> LOG_BLOCK = BLOCKS.register("log", () -> new BlockColourLog(Block.Properties.copy(Blocks.ACACIA_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<Block> LOG_STR_BLOCK = BLOCKS.register("log_stripped", () -> new BlockColourLog(Block.Properties.copy(Blocks.ACACIA_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<Block> SANDSTONE_CH_BLOCK = BLOCKS.register("chiseled_sandstone", () -> new BlockColour(Block.Properties.of(), new BlockFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_ITEM = ITEMS.register("planks", () -> new BlockItemFlib(PLANKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new BlockItemFlib(BRICKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new BlockItemFlib(SANDSTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("dirt", () -> new BlockItemFlib(DIRT_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> LOG_ITEM = ITEMS.register("log", () -> new BlockItemFlib(LOG_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> LOG_STR_ITEM = ITEMS.register("log_stripped", () -> new BlockItemFlib(LOG_STR_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> SANDSTONE_CH_ITEM = ITEMS.register("chiseled_sandstone", () -> new BlockItem(SANDSTONE_CH_BLOCK.get(), new Item.Properties()));
  private static final ResourceKey<CreativeModeTab> TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ModMain.MODID, "tab"));

  @SubscribeEvent
  public static void onCreativeModeTabRegister(RegisterEvent event) {
    event.register(Registries.CREATIVE_MODE_TAB, helper -> {
      helper.register(TAB, CreativeModeTab.builder().icon(() -> new ItemStack(PLANKS_BLOCK.get()))
          .title(Component.translatable("itemGroup." + ModMain.MODID))
          .displayItems((enabledFlags, populator) -> {
            for (RegistryObject<Item> entry : ITEMS.getEntries()) {
              populator.accept(entry.get());
            }
          }).build());
    });
  }
}

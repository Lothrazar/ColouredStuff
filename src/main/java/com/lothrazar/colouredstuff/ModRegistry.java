package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.block.BlockColourPillar;
import com.lothrazar.colouredstuff.block.BlockColourStrippable;
import com.lothrazar.colouredstuff.block.Saplin;
import com.lothrazar.colouredstuff.item.ItemColour;
import com.lothrazar.colouredstuff.world.RainbowTreeGrower;
import com.lothrazar.library.block.BlockFlib;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
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
  public static final RegistryObject<Block> STONE_BLOCK = BLOCKS.register("stone", () -> new BlockColour(Block.Properties.copy(Blocks.STONE), new BlockFlib.Settings()));
  public static final RegistryObject<Block> COBBLESTONE_BLOCK = BLOCKS.register("cobblestone", () -> new BlockColour(Block.Properties.copy(Blocks.COBBLESTONE), new BlockFlib.Settings()));
  public static final RegistryObject<Block> LOG_BLOCK = BLOCKS.register("log", () -> new BlockColourStrippable(Block.Properties.copy(Blocks.ACACIA_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<Block> LOG_STR_BLOCK = BLOCKS.register("log_stripped", () -> new BlockColourPillar(Block.Properties.copy(Blocks.STRIPPED_ACACIA_LOG), new BlockFlib.Settings()));
  public static final RegistryObject<Block> LEAVES_BLOCK = BLOCKS.register("leaves", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_LEAVES), new BlockFlib.Settings())); // .noOcclusion()
  public static final RegistryObject<Block> SANDSTONE_CH_BLOCK = BLOCKS.register("chiseled_sandstone", () -> new BlockColour(Block.Properties.copy(Blocks.CHISELED_RED_SANDSTONE), new BlockFlib.Settings()));
  public static final RegistryObject<Block> SAPLIN_BLOCK = BLOCKS.register("sapling", () -> new Saplin(new RainbowTreeGrower(), Block.Properties.copy(Blocks.OAK_SAPLING), new BlockFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_ITEM = ITEMS.register("planks", () -> new ItemColour(PLANKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new ItemColour(BRICKS_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new ItemColour(SANDSTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> DIRT_ITEM = ITEMS.register("dirt", () -> new ItemColour(DIRT_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> LOG_ITEM = ITEMS.register("log", () -> new ItemColour(LOG_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> LOG_STR_ITEM = ITEMS.register("log_stripped", () -> new ItemColour(LOG_STR_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> LEAVES_ITEM = ITEMS.register("leaves", () -> new ItemColour(LEAVES_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> SANDSTONE_CH_ITEM = ITEMS.register("chiseled_sandstone", () -> new ItemColour(SANDSTONE_CH_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> STONE_ITEM = ITEMS.register("stone", () -> new ItemColour(STONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> COBBLE_ITEM = ITEMS.register("cobblestone", () -> new ItemColour(COBBLESTONE_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
  public static final RegistryObject<Item> SAPLIN = ITEMS.register("sapling", () -> new ItemColour(SAPLIN_BLOCK.get(), new Item.Properties(), new ItemFlib.Settings().tooltip()));
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

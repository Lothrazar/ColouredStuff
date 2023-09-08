package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.library.block.BlockFlib;
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
  public static final RegistryObject<Block> PLANKS_BLOCK = BLOCKS.register("planks", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings()));
  public static final RegistryObject<Block> BRICKS_BLOCK = BLOCKS.register("bricks", () -> new BlockColour(Block.Properties.copy(Blocks.STONE_BRICKS), new BlockFlib.Settings()));
  public static final RegistryObject<Block> SANDSTONE_BLOCK = BLOCKS.register("sandstone", () -> new BlockColour(Block.Properties.copy(Blocks.SANDSTONE), new BlockFlib.Settings()));
  //  public static final RegistryObject<Block> SANDSTONE_CH_BLOCK = BLOCKS.register("sandstone_chiseled", () -> new BlockColour(Block.Properties.of(), new BlockFlib.Settings()));
  public static final RegistryObject<Item> PLANKS_ITEM = ITEMS.register("planks", () -> new BlockItem(PLANKS_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> BRICKS_ITEM = ITEMS.register("bricks", () -> new BlockItem(BRICKS_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> SANDSTONE_ITEM = ITEMS.register("sandstone", () -> new BlockItem(SANDSTONE_BLOCK.get(), new Item.Properties()));
  //  public static final RegistryObject<Item> SANDSTONE_CH_ITEM = ITEMS.register("sandstone_chiseled", () -> new BlockItem(SANDSTONE_CH_BLOCK.get(), new Item.Properties()));
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

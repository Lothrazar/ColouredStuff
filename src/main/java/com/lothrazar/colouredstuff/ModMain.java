package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.colouredstuff.item.ItemColour;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MODID)
public class ModMain {

  public static final String MODID = "colouredstuff";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModMain() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    ModRegistry.BLOCKS.register(eventBus);
    ModRegistry.ITEMS.register(eventBus);
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
  }

  @SuppressWarnings("deprecation")
  private void setupClient(final FMLClientSetupEvent event) {
    //for client side only setup
    final ResourceLocation dyeId = new ResourceLocation(ModMain.MODID, "dye");
    final ItemPropertyFunction predicate = (stack, world, living, id) -> {
      if (stack.hasTag()) {
        String color = ItemColour.getColorStringFromNbt(stack);
        return DyeColor.valueOf(color.toUpperCase()).ordinal();
      }
      return DyeColor.WHITE.ordinal();
    };
    event.enqueueWork(() -> {
      ItemProperties.register(ModRegistry.BRICKS_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.SANDSTONE_CH_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.COBBLE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.DIRT_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.LEAVES_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.LOG_STR_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.LOG_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.PLANKS_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.SANDSTONE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.STONE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ModRegistry.SAPLIN.get(), dyeId, predicate);
    });
  }
}

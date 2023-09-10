package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.item.DyeColorless;
import com.lothrazar.colouredstuff.item.ItemColour;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientColorSetup {

  @SuppressWarnings("deprecation")
  public static void setupClient(final FMLClientSetupEvent event) {
    //for client side only setup
    final ResourceLocation dyeId = new ResourceLocation(ModMain.MODID, "dye");
    final ItemPropertyFunction predicate = (stack, world, living, id) -> {
      if (stack.hasTag()) {
        String colorString = ItemColour.getColorStringFromNbt(stack).toUpperCase();
        return DyeColorless.valueOf(colorString).ordinal();
      }
      return DyeColorless.NONE.ordinal();
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

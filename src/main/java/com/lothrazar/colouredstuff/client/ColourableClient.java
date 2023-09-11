package com.lothrazar.colouredstuff.client;

import com.lothrazar.colouredstuff.ColourableRegistry;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.item.ItemColour;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ColourableClient {

  @SuppressWarnings("deprecation")
  public static void setupClient(final FMLClientSetupEvent event) {
    //for client side only setup
    final ResourceLocation dyeId = new ResourceLocation(ModColourable.MODID, "dye");
    final ItemPropertyFunction predicate = (stack, world, living, id) -> {
      if (stack.hasTag()) {
        String colorString = ItemColour.getColorStringFromNbt(stack).toUpperCase();
        return DyeColorless.valueOf(colorString).ordinal();
      }
      return DyeColorless.NONE.ordinal();
    };
    event.enqueueWork(() -> {
      ItemProperties.register(ColourableRegistry.BRICKS_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.SANDSTONE_CH_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.COBBLE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.DIRT_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.LEAVES_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.LOG_STR_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.LOG_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.PLANKS_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.SANDSTONE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.STONE_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.SAPLIN.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.PATH_ITEM.get(), dyeId, predicate);
      ItemProperties.register(ColourableRegistry.FARM_ITEM.get(), dyeId, predicate);
    });
  }
}

package com.lothrazar.colouredstuff.registry.client;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ColourableClient {

  public static String getColorStringFromNbt(ItemStack stack) {
    if (stack.hasTag() && stack.getTag().contains("BlockStateTag")
        && stack.getTag().getCompound("BlockStateTag").contains("color")) {
      String color = stack.getTag().getCompound("BlockStateTag").getString("color");
      return color;
    }
    return DyeColorless.NONE.getSerializedName(); // default
  }

  @SuppressWarnings("deprecation")
  public static void setupClient(final FMLClientSetupEvent event) {
    //for client side only setup
    final ResourceLocation dyeId = new ResourceLocation(ModColourable.MODID, "dye");
    final ItemPropertyFunction predicate = (stack, world, living, id) -> {
      if (stack.hasTag()) {
        String colorString = getColorStringFromNbt(stack).toUpperCase();
        return DyeColorless.valueOf(colorString).ordinal();
      }
      return DyeColorless.NONE.ordinal();
    };
    event.enqueueWork(() -> {
      //      ItemProperties.register(ColourableRegistry.BRICKS_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.SANDSTONE_CH_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.COBBLE_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.DIRT_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.LEAVES_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.LOG_STR_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.LOG_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.PLANKS_BLACK.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.SANDSTONE_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.STONE_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.SAPLIN.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.PATH_ITEM.get(), dyeId, predicate);
      //      ItemProperties.register(ColourableRegistry.FARM_ITEM.get(), dyeId, predicate);
    });
  }
}

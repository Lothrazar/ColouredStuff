package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

  private void setupClient(final FMLClientSetupEvent event) {
    //for client side only setup
    @SuppressWarnings("deprecation")
    ItemPropertyFunction predicate = (stack, world, living, id) -> {
      System.out.println("check it " + stack.getTag());
      if (stack.hasTag() && stack.getTag().contains("BlockStateTag")) {
        String color = stack.getTag().getCompound("BlockStateTag").getString("color");
        return DyeColor.valueOf(color.toUpperCase()).ordinal();
      }
      return DyeColor.WHITE.ordinal();
    };
    event.enqueueWork(() -> {
      ItemProperties.register(ModRegistry.DIRT_ITEM.get(), new ResourceLocation(ModMain.MODID, "dye"), predicate);
    });
  }
}

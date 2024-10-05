package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.item.ItemColour;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry.BurnTime;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DynamicRegistry {

  public static void register(final FMLCommonSetupEvent event) {}

  @SubscribeEvent
  public static void onRegistry(RegisterEvent event) {
    event.register(Registries.ITEM, reg -> {
      //  darkosto
      if (ConfigColourable.RGB_CRAFTING_TABLE.get()) {
        reg.register("crafting_table_rainbow", new ItemColour(ColourableBlockRegistry.crafting_table_rainbow.get(),
            new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
      }
    });
  }
}

package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.item.ItemColour;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry.BurnTime;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

//@EventBusSubscriber(modid = ModColourable.MODID)
public class DynamicRegistry {

  public static void register(final FMLCommonSetupEvent event) {}

//  @SubscribeEvent
//  public static void onRegistry(RegisterEvent event) {
//    // Items must always be registered unconditionally - config is not loaded yet during RegisterEvent.
//    // The config value RGB_CRAFTING_TABLE is checked at usage time (e.g. in recipes or block behaviour).
//    event.register(Registries.ITEM, reg -> {
//      //  darkosto
//      reg.register(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ModColourable.MODID, "crafting_table_rainbow")),
//
//
//      new ItemColour(ColourableBlockRegistry.crafting_table_rainbow.get(),          new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD))
//
//      );
//    });
//  }
}

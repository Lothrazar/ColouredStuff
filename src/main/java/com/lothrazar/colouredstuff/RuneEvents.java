package com.lothrazar.colouredstuff;

import net.minecraftforge.event.entity.player.PlayerEvent.ItemCraftedEvent;
//import net.minecraftforge.event.entity.player.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RuneEvents {

  @SubscribeEvent
  public void test(ItemCraftedEvent event) {
    //    ItemStack crafting = event.getCrafting();
    //    ResourceLocation output = ForgeRegistries.ITEMS.getKey(crafting.getItem());
    //    if (!ModColourable.MODID.equalsIgnoreCase(output.getNamespace())) {
    //      //
    //      return;
    //    }
    //    //for all recipes where outputs is one of my items, super hack
    //    ModColourable.LOGGER.error("debug: item crafted event " + crafting);
    //    Container inventory = event.getInventory();
    //    for (int i = 0; i < inventory.getContainerSize(); i++) {
    //      //
    //      var item = inventory.getItem(i);
    //      //   ResourceLocation x=item.getItem().
    //      if (item.hasTag()) { //TODO: max color not first. 
    //        //TODO: ignore recipes iwth dye input?
    //        String color = ItemColour.getColorStringFromNbt(item);
    //        //add to output color
    //        ItemColour.writeColorStringNbt(crafting, color);
    //        ModColourable.LOGGER.error("debug: hack color onto crafting output item" + crafting);
    //        break;
    //      }
    //    }
  }
}

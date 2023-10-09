package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.colouredstuff.color.PlayerUseEvents;
import com.lothrazar.colouredstuff.registry.ColourableBlockRegistry;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModColourable.MODID)
public class ModColourable {

  public static final String MODID = "colouredstuff";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModColourable() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    ColourableBlockRegistry.BLOCKS.register(eventBus);
    ColourableItemRegistry.ITEMS.register(eventBus);
    new PlayerUseEvents();
    //TODO: door_
    //TODO: chiseled_stone_
    // wooden_button_
    // stone_button_
    // trapdoor_
    // smooth_stone_
    // cracked_stone_bricks_
    // cut_sandstone_
  }
}

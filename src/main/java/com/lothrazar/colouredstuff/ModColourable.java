package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.colouredstuff.client.ColourableClient;
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
    FMLJavaModLoadingContext.get().getModEventBus().addListener(ColourableClient::setupClient);
    //    MinecraftForge.EVENT_BUS.register(new RuneEvents());  
  }
}

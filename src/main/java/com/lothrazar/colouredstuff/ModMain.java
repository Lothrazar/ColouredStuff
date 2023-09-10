package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MODID)
public class ModMain {

  public static final String MODID = "colouredstuff";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModMain() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    ModRegistry.BLOCKS.register(eventBus);
    ModRegistry.ITEMS.register(eventBus);
    FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientColorSetup::setupClient);
  }
}

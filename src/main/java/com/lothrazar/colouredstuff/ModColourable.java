package com.lothrazar.colouredstuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.lothrazar.colouredstuff.color.PlayerUseEvents;
import com.lothrazar.colouredstuff.registry.ClientRegistry;
import com.lothrazar.colouredstuff.registry.ColourableBlockRegistry;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.colouredstuff.registry.ConfigColourable;
import com.lothrazar.colouredstuff.registry.FluidColourRegistry;
import com.lothrazar.colouredstuff.registry.InteractionRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(ModColourable.MODID)
public class ModColourable {

  public static final String MODID = "colouredstuff";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModColourable(IEventBus modEventBus) {
    new ConfigColourable();
    ColourableBlockRegistry.BLOCKS.register(modEventBus);
    ColourableItemRegistry.ITEMS.register(modEventBus);
    ColourableItemRegistry.ENTITIES.register(modEventBus);
    FluidColourRegistry.FLUID_TYPES.register(modEventBus);
    FluidColourRegistry.FLUIDS.register(modEventBus);
    new PlayerUseEvents();
    modEventBus.addListener(InteractionRegistry::register);
    modEventBus.addListener(ClientRegistry::register);
//    modEventBus.addListener(DynamicRegistry::register);
    if (FMLEnvironment.dist == Dist.CLIENT) {
      modEventBus.addListener(ClientRegistry::registerEntityRenders);
      modEventBus.addListener(ClientRegistry::registerClientExtensions);
    }
  }
}

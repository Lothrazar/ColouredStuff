package com.lothrazar.colouredstuff;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
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

  public ModColourable(IEventBus bus, ModContainer modContainer) {
    modContainer.registerConfig(ModConfig.Type.COMMON, ConfigColourable.CONFIG);
    ColourableBlockRegistry.BLOCKS.register(bus);
    ColourableItemRegistry.ITEMS.register(bus);
    ColourableItemRegistry.ENTITIES.register(bus);
    FluidColourRegistry.FLUID_TYPES.register(bus);
    FluidColourRegistry.FLUIDS.register(bus);
    new PlayerUseEvents();
    bus.addListener(InteractionRegistry::register);
    bus.addListener(ClientRegistry::register);
//    modEventBus.addListener(DynamicRegistry::register);
    if (FMLEnvironment.dist == Dist.CLIENT) {
      bus.addListener(ClientRegistry::registerEntityRenders);
      bus.addListener(ClientRegistry::registerClientExtensions);
    }
  }
}

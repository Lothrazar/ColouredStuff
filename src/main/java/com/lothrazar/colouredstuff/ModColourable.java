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
//    modEventBus.addListener(DynamicRegistry::register);
    // 26.1: registering any listener referencing ClientRegistry forces the JVM to load/verify the
    // whole class, which transitively pulls in the client-only ColourBoatRender/EntityRenderer -
    // must stay behind this Dist.CLIENT gate or it NoClassDefFoundErrors on a dedicated server.
    if (FMLEnvironment.getDist() == Dist.CLIENT) {
      bus.addListener(ClientRegistry::register);
      bus.addListener(ClientRegistry::registerEntityRenders);
      bus.addListener(ClientRegistry::registerFluidModels);
    }
  }
}

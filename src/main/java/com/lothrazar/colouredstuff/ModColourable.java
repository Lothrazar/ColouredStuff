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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModColourable.MODID)
public class ModColourable {

  public static final String MODID = "colouredstuff";
  public static final Logger LOGGER = LogManager.getLogger();

  public ModColourable() {
    new ConfigColourable();
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    ColourableBlockRegistry.BLOCKS.register(bus);
    ColourableItemRegistry.ITEMS.register(bus);
    FluidColourRegistry.FLUID_TYPES.register(bus);
    FluidColourRegistry.FLUIDS.register(bus);
    new PlayerUseEvents();
    bus.addListener(InteractionRegistry::register);
    bus.addListener(ClientRegistry::register);
  }
}

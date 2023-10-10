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
    //TODO: new SIMPLE blocks 
    // chiseled_stone_bricks_
    // TODO: new block types
    // grass_  BUT bottom is only normal dirt, top changes 
    // door_
    // button_
    // trapdoor_
    // pressure_plate_
    // sign_
    // hanging_sign_
    // TODO: big crazy extra stuff  - might not do these
    // cobblestone: furnace, dropper, dispenser, observer, piston
    //wood: CHEST, Barrel, BOATS!? , ladders
  }
}

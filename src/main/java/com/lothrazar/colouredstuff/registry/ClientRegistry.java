package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.entity.client.ColourBoatRender;
import com.lothrazar.colouredstuff.fluid.water.*;

import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientRegistry {

  public static void registerEntityRenders(RegisterRenderers event) {
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_NONE.get(), "boat_none");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_BLACK.get(), "boat_black");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_BLUE.get(), "boat_blue");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_BROWN.get(), "boat_brown");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_CYAN.get(), "boat_cyan");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_GRAY.get(), "boat_gray");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_GREEN.get(), "boat_green");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_LIGHT_BLUE.get(), "boat_light_blue");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_LIGHT_GRAY.get(), "boat_light_gray");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_LIME.get(), "boat_lime");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_MAGENTA.get(), "boat_magenta");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_ORANGE.get(), "boat_orange");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_PINK.get(), "boat_pink");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_PURPLE.get(), "boat_purple");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_RED.get(), "boat_red");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_WHITE.get(), "boat_white");
    registerBoat(event, ColourableItemRegistry.BOAT_ENTITY_YELLOW.get(), "boat_yellow");
  }

  private static void registerBoat(RegisterRenderers event, net.minecraft.world.entity.EntityType<? extends net.minecraft.world.entity.vehicle.boat.AbstractBoat> entityType, String textureName) {
    Identifier texture = Identifier.fromNamespaceAndPath(ModColourable.MODID, "textures/entity/boat/" + textureName + ".png");
    event.registerEntityRenderer(entityType, context -> new ColourBoatRender(context, texture));
  }

  public static void registerFluidModels(RegisterFluidModelsEvent event) {
    registerFluid(event, NoneFluidHolder.FLUID_STILL, NoneFluidHolder.FLUID_FLOWING, NoneFluidHolder.STILL, NoneFluidHolder.FLOWING);
    registerFluid(event, BlackFluidHolder.FLUID_STILL, BlackFluidHolder.FLUID_FLOWING, BlackFluidHolder.STILL, BlackFluidHolder.FLOWING);
    registerFluid(event, BlueFluidHolder.FLUID_STILL, BlueFluidHolder.FLUID_FLOWING, BlueFluidHolder.STILL, BlueFluidHolder.FLOWING);
    registerFluid(event, BrownFluidHolder.FLUID_STILL, BrownFluidHolder.FLUID_FLOWING, BrownFluidHolder.STILL, BrownFluidHolder.FLOWING);
    registerFluid(event, CyanFluidHolder.FLUID_STILL, CyanFluidHolder.FLUID_FLOWING, CyanFluidHolder.STILL, CyanFluidHolder.FLOWING);
    registerFluid(event, GrayFluidHolder.FLUID_STILL, GrayFluidHolder.FLUID_FLOWING, GrayFluidHolder.STILL, GrayFluidHolder.FLOWING);
    registerFluid(event, GreenFluidHolder.FLUID_STILL, GreenFluidHolder.FLUID_FLOWING, GreenFluidHolder.STILL, GreenFluidHolder.FLOWING);
    registerFluid(event, LightblueFluidHolder.FLUID_STILL, LightblueFluidHolder.FLUID_FLOWING, LightblueFluidHolder.STILL, LightblueFluidHolder.FLOWING);
    registerFluid(event, LightgrayFluidHolder.FLUID_STILL, LightgrayFluidHolder.FLUID_FLOWING, LightgrayFluidHolder.STILL, LightgrayFluidHolder.FLOWING);
    registerFluid(event, LimeFluidHolder.FLUID_STILL, LimeFluidHolder.FLUID_FLOWING, LimeFluidHolder.STILL, LimeFluidHolder.FLOWING);
    registerFluid(event, MagentaFluidHolder.FLUID_STILL, MagentaFluidHolder.FLUID_FLOWING, MagentaFluidHolder.STILL, MagentaFluidHolder.FLOWING);
    registerFluid(event, OrangeFluidHolder.FLUID_STILL, OrangeFluidHolder.FLUID_FLOWING, OrangeFluidHolder.STILL, OrangeFluidHolder.FLOWING);
    registerFluid(event, PinkFluidHolder.FLUID_STILL, PinkFluidHolder.FLUID_FLOWING, PinkFluidHolder.STILL, PinkFluidHolder.FLOWING);
    registerFluid(event, PurpleFluidHolder.FLUID_STILL, PurpleFluidHolder.FLUID_FLOWING, PurpleFluidHolder.STILL, PurpleFluidHolder.FLOWING);
    registerFluid(event, RedFluidHolder.FLUID_STILL, RedFluidHolder.FLUID_FLOWING, RedFluidHolder.STILL, RedFluidHolder.FLOWING);
    registerFluid(event, WhiteFluidHolder.FLUID_STILL, WhiteFluidHolder.FLUID_FLOWING, WhiteFluidHolder.STILL, WhiteFluidHolder.FLOWING);
    registerFluid(event, YellowFluidHolder.FLUID_STILL, YellowFluidHolder.FLUID_FLOWING, YellowFluidHolder.STILL, YellowFluidHolder.FLOWING);
  }

  private static void registerFluid(RegisterFluidModelsEvent event, Identifier still, Identifier flowing,
      net.neoforged.neoforge.registries.DeferredHolder<net.minecraft.world.level.material.Fluid, ? extends net.minecraft.world.level.material.Fluid> stillFluid,
      net.neoforged.neoforge.registries.DeferredHolder<net.minecraft.world.level.material.Fluid, ? extends net.minecraft.world.level.material.Fluid> flowingFluid) {
    FluidModel.Unbaked model = new FluidModel.Unbaked(new Material(still), new Material(flowing), null, null);
    event.register(model, stillFluid, flowingFluid);
  }

  /**
   * In NeoForge 1.21.1, ItemBlockRenderTypes is removed.
   * Fluid liquid blocks are rendered via the fluid rendering pipeline automatically.
   */
  public static void register(final FMLClientSetupEvent event) {
    // fluid render types are handled automatically by the fluid rendering system
  }
}

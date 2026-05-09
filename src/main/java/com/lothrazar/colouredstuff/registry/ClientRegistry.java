package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.entity.client.ColourBoatRender;
import com.lothrazar.colouredstuff.fluid.water.*;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.minecraft.core.Holder;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientRegistry {

  public static void registerEntityRenders(RegisterRenderers event) {
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_NONE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_BLACK.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_BLUE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_BROWN.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_CYAN.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_GRAY.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_GREEN.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_LIGHT_BLUE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_LIGHT_GRAY.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_LIME.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_MAGENTA.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_ORANGE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_PINK.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_PURPLE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_RED.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_WHITE.get(), ColourBoatRender::new);
    event.registerEntityRenderer(ColourableItemRegistry.BOAT_ENTITY_YELLOW.get(), ColourBoatRender::new);
  }

  public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
    registerFluid(event, NoneFluidHolder.FLUID_STILL, NoneFluidHolder.FLUID_FLOWING, NoneFluidHolder.FTYPE);
    registerFluid(event, BlackFluidHolder.FLUID_STILL, BlackFluidHolder.FLUID_FLOWING, BlackFluidHolder.FTYPE);
    registerFluid(event, BlueFluidHolder.FLUID_STILL, BlueFluidHolder.FLUID_FLOWING, BlueFluidHolder.FTYPE);
    registerFluid(event, BrownFluidHolder.FLUID_STILL, BrownFluidHolder.FLUID_FLOWING, BrownFluidHolder.FTYPE);
    registerFluid(event, CyanFluidHolder.FLUID_STILL, CyanFluidHolder.FLUID_FLOWING, CyanFluidHolder.FTYPE);
    registerFluid(event, GrayFluidHolder.FLUID_STILL, GrayFluidHolder.FLUID_FLOWING, GrayFluidHolder.FTYPE);
    registerFluid(event, GreenFluidHolder.FLUID_STILL, GreenFluidHolder.FLUID_FLOWING, GreenFluidHolder.FTYPE);
    registerFluid(event, LightblueFluidHolder.FLUID_STILL, LightblueFluidHolder.FLUID_FLOWING, LightblueFluidHolder.FTYPE);
    registerFluid(event, LightgrayFluidHolder.FLUID_STILL, LightgrayFluidHolder.FLUID_FLOWING, LightgrayFluidHolder.FTYPE);
    registerFluid(event, LimeFluidHolder.FLUID_STILL, LimeFluidHolder.FLUID_FLOWING, LimeFluidHolder.FTYPE);
    registerFluid(event, MagentaFluidHolder.FLUID_STILL, MagentaFluidHolder.FLUID_FLOWING, MagentaFluidHolder.FTYPE);
    registerFluid(event, OrangeFluidHolder.FLUID_STILL, OrangeFluidHolder.FLUID_FLOWING, OrangeFluidHolder.FTYPE);
    registerFluid(event, PinkFluidHolder.FLUID_STILL, PinkFluidHolder.FLUID_FLOWING, PinkFluidHolder.FTYPE);
    registerFluid(event, PurpleFluidHolder.FLUID_STILL, PurpleFluidHolder.FLUID_FLOWING, PurpleFluidHolder.FTYPE);
    registerFluid(event, RedFluidHolder.FLUID_STILL, RedFluidHolder.FLUID_FLOWING, RedFluidHolder.FTYPE);
    registerFluid(event, WhiteFluidHolder.FLUID_STILL, WhiteFluidHolder.FLUID_FLOWING, WhiteFluidHolder.FTYPE);
    registerFluid(event, YellowFluidHolder.FLUID_STILL, YellowFluidHolder.FLUID_FLOWING, YellowFluidHolder.FTYPE);
  }

  private static void registerFluid(RegisterClientExtensionsEvent event, ResourceLocation still, ResourceLocation flowing, Holder<FluidType> ftype) {
    event.registerFluidType(new IClientFluidTypeExtensions() {
      @Override
      public ResourceLocation getStillTexture() { return still; }
      @Override
      public ResourceLocation getFlowingTexture() { return flowing; }
    }, ftype);
  }

  /**
   * In NeoForge 1.21.1, ItemBlockRenderTypes is removed.
   * Fluid liquid blocks are rendered via the fluid rendering pipeline automatically.
   */
  public static void register(final FMLClientSetupEvent event) {
    // fluid render types are handled automatically by the fluid rendering system
  }
}

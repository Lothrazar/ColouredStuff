package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.entity.client.ColourBoatRender;
import com.lothrazar.colouredstuff.fluid.water.BlackFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.BlueFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.BrownFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.CyanFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.GrayFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.GreenFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.LightblueFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.LightgrayFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.LimeFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.MagentaFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.NoneFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.OrangeFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.PinkFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.PurpleFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.RedFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.WhiteFluidHolder;
import com.lothrazar.colouredstuff.fluid.water.YellowFluidHolder;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

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
  /**
   * make the water translucent
   */
  public static void register(final FMLClientSetupEvent event) {
    var rt = RenderType.translucent();
    ItemBlockRenderTypes.setRenderLayer(BlackFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(BlackFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(BlueFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(BlueFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(BrownFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(BrownFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(CyanFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(CyanFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(GrayFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(GrayFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(GreenFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(GreenFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LightblueFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LightblueFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LightgrayFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LightgrayFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LimeFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(LimeFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(MagentaFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(MagentaFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(NoneFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(NoneFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(OrangeFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(OrangeFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(PinkFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(PinkFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(PurpleFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(PurpleFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(RedFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(RedFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(WhiteFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(WhiteFluidHolder.STILL.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(YellowFluidHolder.FLOWING.get(), rt);
    ItemBlockRenderTypes.setRenderLayer(YellowFluidHolder.STILL.get(), rt);
  }
}

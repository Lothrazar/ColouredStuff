package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.water.BlackFluidHolder;
import com.lothrazar.colouredstuff.water.BlueFluidHolder;
import com.lothrazar.colouredstuff.water.BrownFluidHolder;
import com.lothrazar.colouredstuff.water.CyanFluidHolder;
import com.lothrazar.colouredstuff.water.GrayFluidHolder;
import com.lothrazar.colouredstuff.water.GreenFluidHolder;
import com.lothrazar.colouredstuff.water.LightblueFluidHolder;
import com.lothrazar.colouredstuff.water.LightgrayFluidHolder;
import com.lothrazar.colouredstuff.water.LimeFluidHolder;
import com.lothrazar.colouredstuff.water.MagentaFluidHolder;
import com.lothrazar.colouredstuff.water.NoneFluidHolder;
import com.lothrazar.colouredstuff.water.OrangeFluidHolder;
import com.lothrazar.colouredstuff.water.PinkFluidHolder;
import com.lothrazar.colouredstuff.water.PurpleFluidHolder;
import com.lothrazar.colouredstuff.water.RedFluidHolder;
import com.lothrazar.colouredstuff.water.WhiteFluidHolder;
import com.lothrazar.colouredstuff.water.YellowFluidHolder;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientRegistry {

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

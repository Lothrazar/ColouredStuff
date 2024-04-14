package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.fluid.InfiniteFluidHolder;
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
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidColourRegistry {

  public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, ModColourable.MODID);
  public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ModColourable.MODID);
  //
  public static final InfiniteFluidHolder BLACK = new BlackFluidHolder();
  public static final InfiniteFluidHolder BLUE = new BlueFluidHolder();
  public static final InfiniteFluidHolder BROWN = new BrownFluidHolder();
  public static final InfiniteFluidHolder CYAN = new CyanFluidHolder();
  public static final InfiniteFluidHolder GRAY = new GrayFluidHolder();
  public static final InfiniteFluidHolder GREEN = new GreenFluidHolder();
  public static final InfiniteFluidHolder LIGHTBLUE = new LightblueFluidHolder();
  public static final InfiniteFluidHolder LIGHTGRAY = new LightgrayFluidHolder();
  public static final InfiniteFluidHolder LIME = new LimeFluidHolder();
  public static final InfiniteFluidHolder MAGENTA = new MagentaFluidHolder();
  public static final InfiniteFluidHolder NONE = new NoneFluidHolder();
  public static final InfiniteFluidHolder ORANGE = new OrangeFluidHolder();
  public static final InfiniteFluidHolder PINK = new PinkFluidHolder();
  public static final InfiniteFluidHolder PURP = new PurpleFluidHolder();
  public static final InfiniteFluidHolder RED = new RedFluidHolder();
  public static final InfiniteFluidHolder WHITE = new WhiteFluidHolder();
  public static final InfiniteFluidHolder YELLOW = new YellowFluidHolder();

}

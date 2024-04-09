package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.lib.FluidHolder;
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
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidColourRegistry {

  public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, ModColourable.MODID);
  public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ModColourable.MODID);
  //
  public static final FluidHolder BLACK = new BlackFluidHolder();
  public static final FluidHolder BLUE = new BlueFluidHolder();
  public static final FluidHolder BROWN = new BrownFluidHolder();
  public static final FluidHolder CYAN = new CyanFluidHolder();
  public static final FluidHolder GRAY = new GrayFluidHolder();
  public static final FluidHolder GREEN = new GreenFluidHolder();
  public static final FluidHolder LIGHTBLUE = new LightblueFluidHolder();
  public static final FluidHolder LIGHTGRAY = new LightgrayFluidHolder();
  public static final FluidHolder LIME = new LimeFluidHolder();
  public static final FluidHolder MAGENTA = new MagentaFluidHolder();
  public static final FluidHolder NONE = new NoneFluidHolder();
  public static final FluidHolder ORANGE = new OrangeFluidHolder();
  public static final FluidHolder PINK = new PinkFluidHolder();
  public static final FluidHolder PURP = new PurpleFluidHolder();
  public static final FluidHolder RED = new RedFluidHolder();
  public static final FluidHolder WHITE = new WhiteFluidHolder();
  public static final FluidHolder YELLOW = new YellowFluidHolder();

}

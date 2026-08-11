package com.lothrazar.colouredstuff.fluid.water;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.block.ColourLiquidBlock;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.fluid.InfiniteFluidHolder;
import com.lothrazar.colouredstuff.registry.ColourableBlockRegistry;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.colouredstuff.registry.FluidColourRegistry;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;

public class PinkFluidHolder extends InfiniteFluidHolder {

  private static final String COLOUR = "pink";
  private static final String TYPE = "water";
  private static final String ID = TYPE + "_" + COLOUR;
  public static final Identifier FLUID_FLOWING = Identifier.fromNamespaceAndPath(ModColourable.MODID, "block/" + TYPE + "/" + TYPE + "_flow_" + COLOUR);
  public static final Identifier FLUID_STILL = Identifier.fromNamespaceAndPath(ModColourable.MODID, "block/" + TYPE + "/" + TYPE + "_still_" + COLOUR);
  public static DeferredHolder<Fluid, FlowingFluid> FLOWING = FluidColourRegistry.FLUIDS.register(ID + "_flowing", () -> new BaseFlowingFluid.Flowing(makeProperties()));
  public static DeferredHolder<Fluid, FlowingFluid> STILL = FluidColourRegistry.FLUIDS.register(ID, () -> new BaseFlowingFluid.Source(makeProperties()));
  public static DeferredHolder<Block, LiquidBlock> BLOCK = ColourableBlockRegistry.BLOCKS.registerBlock(ID + "_block", props -> new ColourLiquidBlock(STILL,
      props.mapColor(DyeColor.PINK), DyeColorless.PINK), InfiniteFluidHolder::blockProps);
  public static DeferredHolder<Item, Item> BUCKET = ColourableItemRegistry.ITEMS.registerItem(TYPE + "_bucket_" + COLOUR, props -> new BucketItem(STILL.get(), props
      .craftRemainder(Items.BUCKET).stacksTo(1)));
  public static DeferredHolder<FluidType, FluidType> FTYPE = FluidColourRegistry.FLUID_TYPES.register(ID, () -> InfiniteFluidHolder.createFluidType());

  private static BaseFlowingFluid.Properties makeProperties() {
    return new BaseFlowingFluid.Properties(FTYPE, STILL, FLOWING).bucket(BUCKET).block(BLOCK);
  }
}

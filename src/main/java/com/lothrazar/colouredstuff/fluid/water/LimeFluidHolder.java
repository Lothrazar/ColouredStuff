package com.lothrazar.colouredstuff.fluid.water;

import java.util.function.Consumer;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.block.ColourLiquidBlock;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.fluid.InfiniteFluidHolder;
import com.lothrazar.colouredstuff.registry.ColourableBlockRegistry;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.colouredstuff.registry.FluidColourRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

public class LimeFluidHolder extends InfiniteFluidHolder {

  private static final String COLOUR = "lime";
  private static final String TYPE = "water";
  private static final String ID = TYPE + "_" + COLOUR;
  private static final ResourceLocation FLUID_FLOWING = new ResourceLocation(ModColourable.MODID, "block/" + TYPE + "/" + TYPE + "_flow_" + COLOUR);
  private static final ResourceLocation FLUID_STILL = new ResourceLocation(ModColourable.MODID, "block/" + TYPE + "/" + TYPE + "_still_" + COLOUR);
  public static RegistryObject<FlowingFluid> FLOWING = FluidColourRegistry.FLUIDS.register(ID + "_flowing", () -> new ForgeFlowingFluid.Flowing(makeProperties()));
  public static RegistryObject<FlowingFluid> STILL = FluidColourRegistry.FLUIDS.register(ID, () -> new ForgeFlowingFluid.Source(makeProperties()));
  public static RegistryObject<LiquidBlock> BLOCK = ColourableBlockRegistry.BLOCKS.register(ID + "_block", () -> new ColourLiquidBlock(STILL,
      blockProps().mapColor(DyeColor.LIME), DyeColorless.LIME));
  public static RegistryObject<Item> BUCKET = ColourableItemRegistry.ITEMS.register(TYPE + "_bucket_" + COLOUR, () -> new BucketItem(STILL, new Item.Properties()
      .craftRemainder(Items.BUCKET).stacksTo(1)));
  public static RegistryObject<FluidType> FTYPE = FluidColourRegistry.FLUID_TYPES.register(ID, () -> new FluidType(fluidtypeProperties()) {

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
      consumer.accept(new IClientFluidTypeExtensions() {

        @Override
        public ResourceLocation getStillTexture() {
          return FLUID_STILL;
        }

        @Override
        public ResourceLocation getFlowingTexture() {
          return FLUID_FLOWING;
        }

        @Override
        public ResourceLocation getOverlayTexture() {
          return null;
        }
      });
    }
  });

  private static ForgeFlowingFluid.Properties makeProperties() {
    return new ForgeFlowingFluid.Properties(FTYPE, STILL, FLOWING).bucket(BUCKET).block(BLOCK);
  }
}

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
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DispensibleContainerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.FluidInteractionRegistry.InteractionInformation;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class InteractionRegistry {

  public static void register(final FMLCommonSetupEvent event) {
    //
    lavaCobblestone(BlackFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_BLACK.get(), ColourableBlockRegistry.COBBLESTONE_BLACK.get());
    lavaCobblestone(BlueFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_BLUE.get(), ColourableBlockRegistry.COBBLESTONE_BLUE.get());
    lavaCobblestone(BrownFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_BROWN.get(), ColourableBlockRegistry.COBBLESTONE_BROWN.get());
    lavaCobblestone(CyanFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_CYAN.get(), ColourableBlockRegistry.COBBLESTONE_CYAN.get());
    lavaCobblestone(GrayFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_GRAY.get(), ColourableBlockRegistry.COBBLESTONE_GRAY.get());
    lavaCobblestone(GreenFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_GREEN.get(), ColourableBlockRegistry.COBBLESTONE_GREEN.get());
    lavaCobblestone(LightblueFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_LIGHT_BLUE.get(), ColourableBlockRegistry.COBBLESTONE_LIGHT_BLUE.get());
    lavaCobblestone(LightgrayFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_LIGHT_GRAY.get(), ColourableBlockRegistry.COBBLESTONE_LIGHT_GRAY.get());
    lavaCobblestone(LimeFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_LIME.get(), ColourableBlockRegistry.COBBLESTONE_LIME.get());
    lavaCobblestone(MagentaFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_MAGENTA.get(), ColourableBlockRegistry.COBBLESTONE_MAGENTA.get());
    lavaCobblestone(NoneFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_NONE.get(), ColourableBlockRegistry.COBBLESTONE_NONE.get());
    lavaCobblestone(OrangeFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_ORANGE.get(), ColourableBlockRegistry.COBBLESTONE_ORANGE.get());
    lavaCobblestone(PinkFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_PINK.get(), ColourableBlockRegistry.COBBLESTONE_PINK.get());
    lavaCobblestone(PurpleFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_PURPLE.get(), ColourableBlockRegistry.COBBLESTONE_PURPLE.get());
    lavaCobblestone(RedFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_RED.get(), ColourableBlockRegistry.COBBLESTONE_RED.get());
    lavaCobblestone(WhiteFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_WHITE.get(), ColourableBlockRegistry.COBBLESTONE_WHITE.get());
    lavaCobblestone(YellowFluidHolder.FTYPE.get(), ColourableBlockRegistry.STONE_YELLOW.get(), ColourableBlockRegistry.COBBLESTONE_YELLOW.get());
    //
    final DispenseItemBehavior dispenseBucket = new DefaultDispenseItemBehavior() {

      private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

      @Override
      public ItemStack execute(BlockSource lvl, ItemStack stack) {
        DispensibleContainerItem dispensiblecontaineritem = (DispensibleContainerItem) stack.getItem();
        BlockPos blockpos = lvl.getPos().relative(lvl.getBlockState().getValue(DispenserBlock.FACING));
        Level level = lvl.getLevel();
        if (dispensiblecontaineritem.emptyContents((Player) null, level, blockpos, (BlockHitResult) null, stack)) {
          dispensiblecontaineritem.checkExtraContent((Player) null, level, stack, blockpos);
          return new ItemStack(Items.BUCKET);
        }
        else {
          return this.defaultDispenseItemBehavior.dispense(lvl, stack);
        }
      }
    };
    DispenserBlock.registerBehavior(BlackFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(BlueFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(BrownFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(CyanFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(GrayFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(GreenFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(LightblueFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(LightgrayFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(LimeFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(MagentaFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(NoneFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(OrangeFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(PinkFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(PurpleFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(RedFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(WhiteFluidHolder.BUCKET.get(), dispenseBucket);
    DispenserBlock.registerBehavior(YellowFluidHolder.BUCKET.get(), dispenseBucket);
  }

  //
  // Lava + COLOUR-Water = Obsidian (Source Lava) / COLOUR-Cobblestone (Flowing Lava)
  //
  public static void lavaCobblestone(FluidType colouredWater, Block stone, Block cobblestone) {
    FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new InteractionInformation(
        colouredWater,
        lavaState -> lavaState.isSource() ? Blocks.OBSIDIAN.defaultBlockState() : cobblestone.defaultBlockState()));
    //
    //   COLOUR-Water + Lava = COLOUR-Smoothstone (Source&flowing water)
    //
    FluidInteractionRegistry.addInteraction(colouredWater, new InteractionInformation(
        ForgeMod.LAVA_TYPE.get(),
        lavaState -> lavaState.isSource() ? stone.defaultBlockState() : cobblestone.defaultBlockState()));
  }
}

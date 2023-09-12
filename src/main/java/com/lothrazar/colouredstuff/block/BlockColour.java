package com.lothrazar.colouredstuff.block;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

public class BlockColour extends BlockFlib implements IHasColor {

  private final DyeColorless color;

  public BlockColour(Properties p, DyeColorless color) {
    super(p, new BlockFlib.Settings());
    this.color = color;
  }

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override // TODO port
  public void onRightClickBlock(RightClickBlock event, BlockState state) {
    final ItemStack itemInHand = event.getItemStack();
    boolean doConnected = event.getEntity().isCrouching();
    ModColourable.LOGGER.error("itemInHand " + itemInHand);
    if ( // me.rotateColour &&
    itemInHand.getItem() instanceof DyeItem newColor) {
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.toColorless(newColor.getDyeColor()), doConnected);
    }
    else if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      //is dyes none 
      ModColourable.LOGGER.error("DYES_NONEDYES_NONEis");
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla dye , we should fix this");
    }
  }

  //  @Override // TODO port
  public void rotateDye(BlockState state, Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {
    ModColourable.LOGGER.error("Rotate color disabled for transition");
    //    DyeColorless oldColour = state.getValue(COLOR);
    //    if (newColour != oldColour) {
    //      //new color is different, NOW update
    //      world.setBlockAndUpdate(pos, state.setValue(COLOR, newColour));
    //      //      if (me.rotateColourConsume) {
    //      ItemStackUtil.shrink(player, heldStack);
    //      //      }
    //      if (doConnected) {
    //        this.setConnectedColour(world, pos, oldColour, newColour, 0);
    //      }
    //    }
  }

  private static final int MAX_CONNECTED_UPDATE = 18;

  //  @Override // TODO port
  public void setConnectedColour(Level world, BlockPos pos, DyeColorless oldColour, DyeColorless newColor, int rec) {
    if (rec > MAX_CONNECTED_UPDATE) {
      return;
    }
    for (Direction d : Direction.values()) {
      BlockPos offset = pos.relative(d);
      BlockState here = world.getBlockState(offset);
      //      if (here.getBlock() == this && oldColour == here.getValue(COLOR)) {
      //        world.setBlockAndUpdate(offset, here.setValue(COLOR, newColor));
      //        rec++;
      //        this.setConnectedColour(world, offset, oldColour, newColor, rec);
      //      }
    }
  }
}

package com.lothrazar.colouredstuff.block;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.colouredstuff.color.Rainbows;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.library.block.BlockFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

public abstract class BlockColour extends BlockFlib implements IHasColor {

  private final DyeColorless color;

  public BlockColour(Properties p, DyeColorless color) {
    super(p, new BlockFlib.Settings());
    this.color = color;
    Rainbows.KEYS.put(this, color);
  }

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public void onRightClickBlock(RightClickBlock event, BlockState state) {
    final ItemStack itemInHand = event.getItemStack();
    boolean doConnected = event.getEntity().isCrouching();
    ModColourable.LOGGER.error("itemInHand " + itemInHand);
    if (itemInHand.getItem() instanceof DyeItem newColor) {
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.toColorless(newColor.getDyeColor()), doConnected);
    }
    else if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      //is dyes none  
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla dye , we should fix this");
    }
  }

  private void rotateDye(BlockState oldState, Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {
    DyeColorless originalSourceColour = this.getColor();
    boolean success = Rainbows.rotateToColor(world, pos, originalSourceColour, newColour);
    //new color is different, NOW update
    if (success) {
      ItemStackUtil.shrink(player, heldStack);
      if (doConnected) {
        Rainbows.setConnectedColour(world, pos, originalSourceColour, newColour, 0);
      }
    }
  }
}

package com.lothrazar.colouredstuff.color;

import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

public interface IHasColor {

  public DyeColorless getColor();

  public Map<DyeColorless, Block> getRainbow();

  default void onRightClickBlock(RightClickBlock event) {
    final ItemStack itemInHand = event.getItemStack();
    boolean doConnected = event.getEntity().isCrouching();
    if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      rotateDye(event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
    }
    else if (itemInHand.is(Tags.Items.DYES) || itemInHand.is(Tags.Items.DYES)) {
      DyeColorless dye = DyeColorless.getDyeFromItem(itemInHand);
      if (dye != null) {
        rotateDye(event.getLevel(), event.getPos(), event.getEntity(), itemInHand, dye, doConnected);
      }
      else {
        ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla 16x dye  " + dye);
      }
    }
  }

  default void rotateDye(Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {
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

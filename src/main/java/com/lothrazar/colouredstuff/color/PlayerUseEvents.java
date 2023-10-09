package com.lothrazar.colouredstuff.color;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.library.events.EventFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent
  public void onRightClickBlock(RightClickBlock event) {
    final ItemStack itemInHand = event.getItemStack();
    if (itemInHand.isEmpty()) {
      return;
    }
    final Level level = event.getLevel();
    BlockState stateHit = level.getBlockState(event.getPos());
    DyeColorless originalSourceColour = null;
    DyeColorless dye = null;
    if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      dye = DyeColorless.NONE;
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      dye = DyeColorless.getDyeFromItem(itemInHand);
    }
    else { //this never happens
      ModColourable.LOGGER.error(itemInHand);
      ModColourable.LOGGER.error("This is tagged as a dye item but its not a vanilla 16x dye  " + dye);
      return;
    }
    //dye is non-null now
    boolean doConnected = false;

    //TODO: config to allow right click to dye yes no. default true
    if (stateHit.getBlock() instanceof IHasColor block) {
      originalSourceColour = block.getColor();
      doConnected = event.getEntity().isCrouching(); // TODO: standalone connected-multiblock config default true
      //      Rainbows.rotateColourByEvent(event, block.getRainbow(), originalSourceColour, doConnected);
      var rainbow = block.getRainbow();
      // Rainbows.rotateDye(rainbow, originalSourceColour, level, event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
      boolean success = Rainbows.rotateToColor(rainbow, level, event.getPos(), originalSourceColour, dye);
      //new color is different, NOW update
      if (success) {
        ItemStackUtil.shrink(event.getEntity(), itemInHand);
        if (doConnected) {
          //get new rainbow for this new block..?
          Rainbows.rotateToColorConnectedRecursive(level, event.getPos(), originalSourceColour, dye, 0);
        }
      }
    }
    //TODO: config to allow non-mod block dyes. default true
    //    else if (stateHit.is(Blocks.DIRT)) {
    //      Rainbows.rotateColourByEvent(event, DirtColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.FARMLAND)) {
    //      Rainbows.rotateColourByEvent(event, FarmlandColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.DIRT_PATH)) {
    //      Rainbows.rotateColourByEvent(event, PathColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.SANDSTONE)) {
    //      Rainbows.rotateColourByEvent(event, SandstoneColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.CHISELED_SANDSTONE)) {
    //      Rainbows.rotateColourByEvent(event, ChiseledColor.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.CHISELED_RED_SANDSTONE)) {
    //      Rainbows.rotateColourByEvent(event, ChiseledColor.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.STONE)) {
    //      Rainbows.rotateColourByEvent(event, StoneColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.COBBLESTONE)) {
    //      Rainbows.rotateColourByEvent(event, CobbleColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.STONE_BRICKS)) {
    //      Rainbows.rotateColourByEvent(event, BrickstoneColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(Blocks.BRICKS)) {
    //      Rainbows.rotateColourByEvent(event, BrickColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(BlockTags.SAPLINGS)) {
    //      Rainbows.rotateColourByEvent(event, SaplinColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(BlockTags.LEAVES)) {
    //      Rainbows.rotateColourByEvent(event, LeavesColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(BlockTags.LOGS)) {
    //      Rainbows.rotateColourByEvent(event, LogColour.RAINBOW, originalSourceColour, doConnected);
    //    }
    //    else if (stateHit.is(BlockTags.PLANKS)) {
    //      Rainbows.rotateColourByEvent(event, PlanksColour.RAINBOW, originalSourceColour, doConnected);
    //    }
  }
}

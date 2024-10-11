package com.lothrazar.colouredstuff.color;

import com.lothrazar.colouredstuff.block.BrickColour;
import com.lothrazar.colouredstuff.block.BrickstoneColour;
import com.lothrazar.colouredstuff.block.ChiseledColor;
import com.lothrazar.colouredstuff.block.CobbleColour;
import com.lothrazar.colouredstuff.block.ColourLiquidBlock;
import com.lothrazar.colouredstuff.block.DirtColour;
import com.lothrazar.colouredstuff.block.FarmlandColour;
import com.lothrazar.colouredstuff.block.LeavesColour;
import com.lothrazar.colouredstuff.block.LogColour;
import com.lothrazar.colouredstuff.block.PathColour;
import com.lothrazar.colouredstuff.block.PlanksColour;
import com.lothrazar.colouredstuff.block.SandstoneColour;
import com.lothrazar.colouredstuff.block.SaplinColour;
import com.lothrazar.colouredstuff.block.StoneColour;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.colouredstuff.registry.ConfigColourable;
import com.lothrazar.library.events.EventFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * Don't look its a giant mess of if-else statements
 */
public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent(priority = EventPriority.HIGHEST)
  public void onRightClickBlock(RightClickBlock event) {
    if (ConfigColourable.IN_WORLD_DYE.get()) {
      rightClickDye(event);
    }
  }

  private void rightClickDye(RightClickBlock event) {
    final ItemStack itemInHand = event.getItemStack();
    if (itemInHand.isEmpty()) {
      return;
    }
    if (itemInHand.is(ColourableItemRegistry.STATIONERY_ITEMTAG)) {
      //      ModColourable.LOGGER.info("ignore stationery");
      return;
    }
    DyeColorless dye = null;
    if (itemInHand.is(ColourableItemRegistry.DYES_NONE_ITEMTAG)) {
      dye = DyeColorless.NONE;
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      dye = DyeColorless.getDyeFromItem(itemInHand);
    }
    else { //this never happens 
      return;
    }
    //dye is non-null now
    boolean success = false;
    final Level level = event.getLevel();
    BlockPos eventPos = event.getPos();
    BlockState stateHit = level.getBlockState(eventPos);
    if (stateHit.getBlock() instanceof IHasColor block) {
      success = dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
    }
    else {
      if (ConfigColourable.VANILLA_OVERRIDE.get()) {
        dyeMojangBlocks(level, eventPos, stateHit, dye);
      }
      if (event.getFace() != null) { //  last we check to dye fluid
        eventPos = eventPos.relative(event.getFace());
        BlockState offsetStateHit = level.getBlockState(eventPos);
        if (offsetStateHit.getBlock() == Blocks.WATER && ConfigColourable.VANILLA_OVERRIDE.get()) {
          //dye water if allowed  
          Rainbows.rotateToColor(ColourLiquidBlock.RAINBOW, level, eventPos, null, dye);
        }
        else if (offsetStateHit.getBlock() instanceof IHasColor block) {
          // is it dye-able liquid that is not water
          success = dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
        }
      }
    }
    if (success) {
      event.getEntity().swing(event.getHand());
      //      event.setResult(Result.DENY);
      event.setCanceled(true);
      //      event.setCancellationResult(InteractionResult.SUCCESS); 
    }
  }

  private boolean dyeMojangBlocks(final Level level, BlockPos eventPos, BlockState stateHit, DyeColorless dye) {
    if (stateHit.is(Blocks.DIRT)) {
      return Rainbows.rotateToColor(DirtColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.FARMLAND)) {
      return Rainbows.rotateToColor(FarmlandColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.DIRT_PATH)) {
      return Rainbows.rotateToColor(PathColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.SANDSTONE)) {
      return Rainbows.rotateToColor(SandstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.CHISELED_SANDSTONE)) {
      return Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.CHISELED_RED_SANDSTONE)) {
      return Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.STONE)) {
      return Rainbows.rotateToColor(StoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.COBBLESTONE)) {
      return Rainbows.rotateToColor(CobbleColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.STONE_BRICKS)) {
      return Rainbows.rotateToColor(BrickstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.BRICKS)) {
      return Rainbows.rotateToColor(BrickColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.SAPLINGS)) {
      return Rainbows.rotateToColor(SaplinColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LEAVES)) {
      return Rainbows.rotateToColor(LeavesColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LOGS)) {
      return Rainbows.rotateToColor(LogColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.PLANKS)) {
      return Rainbows.rotateToColor(PlanksColour.RAINBOW, level, eventPos, null, dye);
    }
    return false;
  }

  /**
   * 
   * Dye single blockpos re-used by liquid and solid blocks. Too many params TBH
   * 
   * @param hand
   */
  private boolean dyeBlockInWorld(Player playerIn, final ItemStack itemInHand, final Level level, BlockPos eventPos, DyeColorless dye, IHasColor block) {
    DyeColorless originalSourceColour = block.getColor();
    //if configs allows it, then sneaking/crouching does the multiblock 
    boolean doConnected = ConfigColourable.MULTI_DYE.get() && playerIn.isCrouching();
    var rainbow = block.getRainbow();
    boolean success = Rainbows.rotateToColor(rainbow, level, eventPos, originalSourceColour, dye);
    //new color is different, NOW update
    if (success) {
      if (ConfigColourable.CONSUME.get()) {
        // if the config says we consume one item each time 
        ItemStackUtil.shrink(playerIn, itemInHand);
      }
      //  fluids dont enter here due to how crouching fires
      if (doConnected) {
        //get new rainbow for this new block..?
        Rainbows.rotateToColorConnectedRecursive(level, eventPos, originalSourceColour, dye, 0);
      }
    }
    return success;
  }
}

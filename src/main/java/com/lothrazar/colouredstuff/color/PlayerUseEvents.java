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
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * Don't look its a giant mess of if-else statements
 */
public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent
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
    final Level level = event.getLevel();
    BlockPos eventPos = event.getPos();
    BlockState stateHit = level.getBlockState(eventPos);
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
    if (stateHit.getBlock() instanceof IHasColor block) {
      dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
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
          dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
        }
      }
    }
  }

  private void dyeMojangBlocks(final Level level, BlockPos eventPos, BlockState stateHit, DyeColorless dye) {
    if (stateHit.is(Blocks.DIRT)) {
      Rainbows.rotateToColor(DirtColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.FARMLAND)) {
      Rainbows.rotateToColor(FarmlandColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.DIRT_PATH)) {
      Rainbows.rotateToColor(PathColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.SANDSTONE)) {
      Rainbows.rotateToColor(SandstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.CHISELED_SANDSTONE)) {
      Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.CHISELED_RED_SANDSTONE)) {
      Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.STONE)) {
      Rainbows.rotateToColor(StoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.COBBLESTONE)) {
      Rainbows.rotateToColor(CobbleColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.STONE_BRICKS)) {
      Rainbows.rotateToColor(BrickstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.BRICKS)) {
      Rainbows.rotateToColor(BrickColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.SAPLINGS)) {
      Rainbows.rotateToColor(SaplinColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LEAVES)) {
      Rainbows.rotateToColor(LeavesColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LOGS)) {
      Rainbows.rotateToColor(LogColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.PLANKS)) {
      Rainbows.rotateToColor(PlanksColour.RAINBOW, level, eventPos, null, dye);
    }
  }

  /**
   * 
   * Dye single blockpos re-used by liquid and solid blocks. Too many params TBH
   */
  private void dyeBlockInWorld(Player playerIn, final ItemStack itemInHand, final Level level, BlockPos eventPos, DyeColorless dye, IHasColor block) {
    DyeColorless originalSourceColour = block.getColor();
    //if configs allows it, then sneaking/crouching does the multiblock 
    boolean doConnected = ConfigColourable.MULTI_DYE.get() && playerIn.isCrouching();
    var rainbow = block.getRainbow();
    boolean success = Rainbows.rotateToColor(rainbow, level, eventPos, originalSourceColour, dye);
    //new color is different, NOW update
    if (success) {
      ItemStackUtil.shrink(playerIn, itemInHand);
      //  fluids dont enter here due to how crouching fires
      if (doConnected) {
        //get new rainbow for this new block..?
        Rainbows.rotateToColorConnectedRecursive(level, eventPos, originalSourceColour, dye, 0);
      }
    }
  }
}

package com.lothrazar.colouredstuff.color;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.block.BrickColour;
import com.lothrazar.colouredstuff.block.BrickstoneColour;
import com.lothrazar.colouredstuff.block.ChiseledColor;
import com.lothrazar.colouredstuff.block.CobbleColour;
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
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent
  public void onRightClickBlock(RightClickBlock event) {
    if (!ConfigColourable.IN_WORLD_DYE.get()) {
      return;
    }
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
    if (stateHit.getBlock() instanceof IHasColor block) {
      originalSourceColour = block.getColor();
      //if configs allows it, then sneaking/crouching does the multiblock 
      doConnected = ConfigColourable.MULTI_DYE.get() && event.getEntity().isCrouching();
      var rainbow = block.getRainbow();
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
    else if (ConfigColourable.VANILLA_OVERRIDE.get()) {
      if (stateHit.is(Blocks.DIRT)) {
        Rainbows.rotateToColor(DirtColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.FARMLAND)) {
        Rainbows.rotateToColor(FarmlandColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.DIRT_PATH)) {
        Rainbows.rotateToColor(PathColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.SANDSTONE)) {
        Rainbows.rotateToColor(SandstoneColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.CHISELED_SANDSTONE)) {
        Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.CHISELED_RED_SANDSTONE)) {
        Rainbows.rotateToColor(ChiseledColor.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.STONE)) {
        Rainbows.rotateToColor(StoneColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.COBBLESTONE)) {
        Rainbows.rotateToColor(CobbleColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.STONE_BRICKS)) {
        Rainbows.rotateToColor(BrickstoneColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(Blocks.BRICKS)) {
        Rainbows.rotateToColor(BrickColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(BlockTags.SAPLINGS)) {
        Rainbows.rotateToColor(SaplinColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(BlockTags.LEAVES)) {
        Rainbows.rotateToColor(LeavesColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(BlockTags.LOGS)) {
        Rainbows.rotateToColor(LogColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
      else if (stateHit.is(BlockTags.PLANKS)) {
        Rainbows.rotateToColor(PlanksColour.RAINBOW, level, event.getPos(), originalSourceColour, dye);
      }
    }
  }
}

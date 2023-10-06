package com.lothrazar.colouredstuff.color;

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
import com.lothrazar.library.events.EventFlib;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent
  public void onRightClickBlock(RightClickBlock event) {
    if (event.getItemStack().isEmpty()) {
      return;
    }
    BlockState stateHit = event.getLevel().getBlockState(event.getPos());
    DyeColorless originalSourceColour = null;
    boolean doConnected = false;
    //TODO: config to allow right click to dye yes no. default true
    if (stateHit.getBlock() instanceof IHasColor block) {
      originalSourceColour = block.getColor();
      doConnected = event.getEntity().isCrouching(); // TODO: standalone connected-multiblock config default true
      Rainbows.rotateColourByEvent(event, block.getRainbow(), originalSourceColour, doConnected);
    }
    //TODO: config to allow non-mod block dyes. default true
    else if (stateHit.is(Blocks.DIRT)) {
      Rainbows.rotateColourByEvent(event, DirtColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.FARMLAND)) {
      Rainbows.rotateColourByEvent(event, FarmlandColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.DIRT_PATH)) {
      Rainbows.rotateColourByEvent(event, PathColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.SANDSTONE)) {
      Rainbows.rotateColourByEvent(event, SandstoneColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.CHISELED_SANDSTONE)) {
      Rainbows.rotateColourByEvent(event, ChiseledColor.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.CHISELED_RED_SANDSTONE)) {
      Rainbows.rotateColourByEvent(event, ChiseledColor.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.STONE)) {
      Rainbows.rotateColourByEvent(event, StoneColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.COBBLESTONE)) {
      Rainbows.rotateColourByEvent(event, CobbleColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.STONE_BRICKS)) {
      Rainbows.rotateColourByEvent(event, BrickstoneColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(Blocks.BRICKS)) {
      Rainbows.rotateColourByEvent(event, BrickColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(BlockTags.SAPLINGS)) {
      Rainbows.rotateColourByEvent(event, SaplinColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(BlockTags.LEAVES)) {
      Rainbows.rotateColourByEvent(event, LeavesColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(BlockTags.LOGS)) {
      Rainbows.rotateColourByEvent(event, LogColour.RAINBOW, originalSourceColour, doConnected);
    }
    else if (stateHit.is(BlockTags.PLANKS)) {
      Rainbows.rotateColourByEvent(event, PlanksColour.RAINBOW, originalSourceColour, doConnected);
    }
  }
}

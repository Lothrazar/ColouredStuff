package com.lothrazar.colouredstuff.color;

import com.lothrazar.colouredstuff.block.BrickColour;
import com.lothrazar.colouredstuff.block.BrickstoneColour;
import com.lothrazar.colouredstuff.block.ButtonColour;
import com.lothrazar.colouredstuff.block.ChiseledBrickstoneColour;
import com.lothrazar.colouredstuff.block.CobbleColour;
import com.lothrazar.colouredstuff.block.ColourLiquidBlock;
import com.lothrazar.colouredstuff.block.DirtColour;
import com.lothrazar.colouredstuff.block.FarmlandColour;
import com.lothrazar.colouredstuff.block.LeavesColour;
import com.lothrazar.colouredstuff.block.LogColour;
import com.lothrazar.colouredstuff.block.PathColour;
import com.lothrazar.colouredstuff.block.PlanksColour;
import com.lothrazar.colouredstuff.block.PressurePlateColour;
import com.lothrazar.colouredstuff.block.SandstoneChiseledColour;
import com.lothrazar.colouredstuff.block.SandstoneColour;
import com.lothrazar.colouredstuff.block.SandstoneCutColour;
import com.lothrazar.colouredstuff.block.SandstoneSmoothColour;
import com.lothrazar.colouredstuff.block.SaplinColour;
import com.lothrazar.colouredstuff.block.StoneColour;
import com.lothrazar.colouredstuff.block.StrippedLogColour;
import com.lothrazar.colouredstuff.block.StrippedWoodColour;
import com.lothrazar.colouredstuff.block.TrapDoorColour;
import com.lothrazar.colouredstuff.block.WoodColour;
import com.lothrazar.colouredstuff.block.fence.PlanksFence;
import com.lothrazar.colouredstuff.block.gate.PlanksGate;
import com.lothrazar.colouredstuff.block.slab.BrickSlab;
import com.lothrazar.colouredstuff.block.slab.CobblestoneSlab;
import com.lothrazar.colouredstuff.block.slab.PlanksSlab;
import com.lothrazar.colouredstuff.block.slab.SandstoneSlab;
import com.lothrazar.colouredstuff.block.slab.StoneSlab;
import com.lothrazar.colouredstuff.block.slab.StonebrickSlab;
import com.lothrazar.colouredstuff.block.stair.BrickStair;
import com.lothrazar.colouredstuff.block.stair.CobblestoneStair;
import com.lothrazar.colouredstuff.block.stair.PlanksStair;
import com.lothrazar.colouredstuff.block.stair.SandstoneStair;
import com.lothrazar.colouredstuff.block.stair.StoneStair;
import com.lothrazar.colouredstuff.block.stair.StonebrickStair;
import com.lothrazar.colouredstuff.block.wall.BrickWall;
import com.lothrazar.colouredstuff.block.wall.CobblestoneWall;
import com.lothrazar.colouredstuff.block.wall.PlanksWall;
import com.lothrazar.colouredstuff.block.wall.SandstoneWall;
import com.lothrazar.colouredstuff.block.wall.StoneWall;
import com.lothrazar.colouredstuff.block.wall.StonebrickWall;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.colouredstuff.registry.ConfigColourable;
import com.lothrazar.colouredstuff.registry.DataTags;
import com.lothrazar.library.events.EventFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;

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
      //dye native in-mod blocks first
      success = dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
    }
    else {
      //Then try mojang blocks baesd on tags
      if (ConfigColourable.VANILLA_OVERRIDE.get()) {
        success = dyeMojangBlocks(level, eventPos, stateHit, dye);
      }
      //    last we check to dye fluid
      if (event.getFace() != null) {
        eventPos = eventPos.relative(event.getFace());
        BlockState offsetStateHit = level.getBlockState(eventPos);
        if (offsetStateHit.getBlock() == Blocks.WATER && ConfigColourable.VANILLA_OVERRIDE.get()) {
          //dye water if allowed  
          success = Rainbows.rotateToColor(ColourLiquidBlock.RAINBOW, level, eventPos, null, dye);
        }
        else if (offsetStateHit.getBlock() instanceof IHasColor block) {
          // is it dye-able liquid that is not water
          success = dyeBlockInWorld(event.getEntity(), itemInHand, level, eventPos, dye, block);
        }
      }
    }
    if (success) {
      if (ConfigColourable.CONSUME.get()) {
        // if the config says we consume one item each time
        ItemStackUtil.shrink(event.getEntity(), itemInHand);
      }
      event.getEntity().swing(event.getHand());
      event.setCanceled(true);
      event.setCancellationResult(InteractionResult.PASS);
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
    else if (stateHit.is(DataTags.SANDSTONE_CUT)) {
      return Rainbows.rotateToColor(SandstoneCutColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE_SMOOTH)) {
      return Rainbows.rotateToColor(SandstoneSmoothColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE_CHISELED)) {
      return Rainbows.rotateToColor(SandstoneChiseledColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE)) {
      return Rainbows.rotateToColor(SandstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE)) {
      return Rainbows.rotateToColor(StoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.COBBLESTONE)) {
      return Rainbows.rotateToColor(CobbleColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(Blocks.CHISELED_STONE_BRICKS)) {
      return Rainbows.rotateToColor(ChiseledBrickstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.STONE_BRICKS)) {
      return Rainbows.rotateToColor(BrickstoneColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.BRICKS)) {
      return Rainbows.rotateToColor(BrickColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.SAPLINGS)) {
      return Rainbows.rotateToColor(SaplinColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LEAVES)) {
      return Rainbows.rotateToColor(LeavesColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STRIPPED_LOGS)) {
      return Rainbows.rotateToColor(StrippedLogColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STRIPPED_WOOD)) {
      return Rainbows.rotateToColor(StrippedWoodColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.WOOD)) {
      return Rainbows.rotateToColor(WoodColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.LOGS)) {
      return Rainbows.rotateToColor(LogColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.PLANKS)) {
      return Rainbows.rotateToColor(PlanksColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_SLABS)) {
      return Rainbows.rotateToColor(PlanksSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_STAIRS)) {
      return Rainbows.rotateToColor(PlanksStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_STAIRS)) {
      return Rainbows.rotateToColor(StoneStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.COBBLESTONE_STAIRS)) {
      return Rainbows.rotateToColor(CobblestoneStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_BRICK_STAIRS)) {
      return Rainbows.rotateToColor(StonebrickStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE_STAIRS)) {
      return Rainbows.rotateToColor(SandstoneStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.BRICK_STAIRS)) {
      return Rainbows.rotateToColor(BrickStair.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.BRICK_SLAB)) {
      return Rainbows.rotateToColor(BrickSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.COBBLESTONE_SLAB)) {
      return Rainbows.rotateToColor(CobblestoneSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE_SLAB)) {
      return Rainbows.rotateToColor(SandstoneSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_BRICK_SLAB)) {
      return Rainbows.rotateToColor(StonebrickSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_SLAB)) {
      return Rainbows.rotateToColor(StoneSlab.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.BRICK_WALLS)) {
      return Rainbows.rotateToColor(BrickWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.COBBLESTONE_WALLS)) {
      return Rainbows.rotateToColor(CobblestoneWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.SANDSTONE_WALLS)) {
      return Rainbows.rotateToColor(SandstoneWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.WOODEN_WALLS)) {
      return Rainbows.rotateToColor(PlanksWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_BRICK_WALLS)) {
      return Rainbows.rotateToColor(StonebrickWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.STONE_WALLS)) {
      return Rainbows.rotateToColor(StoneWall.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_PRESSURE_PLATES)) {
      return Rainbows.rotateToColor(PressurePlateColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_TRAPDOORS)) {
      return Rainbows.rotateToColor(TrapDoorColour.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_FENCES)) {
      return Rainbows.rotateToColor(PlanksFence.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(DataTags.WOODEN_GATES)) {
      return Rainbows.rotateToColor(PlanksGate.RAINBOW, level, eventPos, null, dye);
    }
    else if (stateHit.is(BlockTags.WOODEN_BUTTONS)) {
      return Rainbows.rotateToColor(ButtonColour.RAINBOW, level, eventPos, null, dye);
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
    if (rainbow == null) {
      // doors get cancelled here
      return false;
    }
    boolean success = Rainbows.rotateToColor(rainbow, level, eventPos, originalSourceColour, dye);
    //new color is different, NOW update
    if (success) {

      //  fluids dont enter here due to how crouching fires
      if (doConnected) {
        //get new rainbow for this new block..?
        Rainbows.rotateToColorConnectedRecursive(level, eventPos, originalSourceColour, dye, 0);
      }
    }
    return success;
  }
}

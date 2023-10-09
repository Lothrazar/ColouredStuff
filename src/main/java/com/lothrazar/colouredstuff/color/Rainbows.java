package com.lothrazar.colouredstuff.color;

import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.lib.BlockFlibPillar;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class Rainbows {

  public static final int MAX_CONNECTED_UPDATE = 24;

  public static boolean rotateToColor(Map<DyeColorless, Block> rainbow, Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColour) {
    //
    BlockState stateFromPos = world.getBlockState(pos);
    DyeColorless oldColour = null;
    if (stateFromPos.getBlock() instanceof IHasColor cblock) {
      oldColour = cblock.getColor();
    }
    if ((oldColour == null || newColour != oldColour)
        && (originalSourceColour == null || oldColour == originalSourceColour)) {
      BlockState newState = rainbow.get(newColour).defaultBlockState();
      //life hacks
      if (newState.hasProperty(BlockFlibPillar.AXIS) && stateFromPos.hasProperty(BlockFlibPillar.AXIS))
        newState = newState.setValue(BlockFlibPillar.AXIS, stateFromPos.getValue(BlockFlibPillar.AXIS));
      if (newState.hasProperty(SlabBlock.TYPE) && stateFromPos.hasProperty(SlabBlock.TYPE))
        newState = newState.setValue(SlabBlock.TYPE, stateFromPos.getValue(SlabBlock.TYPE));
      if (newState.hasProperty(BlockStateProperties.WATERLOGGED) && stateFromPos.hasProperty(BlockStateProperties.WATERLOGGED))
        newState = newState.setValue(BlockStateProperties.WATERLOGGED, stateFromPos.getValue(BlockStateProperties.WATERLOGGED));
      if (newState.hasProperty(FarmBlock.MOISTURE) && stateFromPos.hasProperty(FarmBlock.MOISTURE))
        newState = newState.setValue(FarmBlock.MOISTURE, stateFromPos.getValue(FarmBlock.MOISTURE));
      if (newState.hasProperty(HorizontalDirectionalBlock.FACING) && stateFromPos.hasProperty(HorizontalDirectionalBlock.FACING))
        newState = newState.setValue(HorizontalDirectionalBlock.FACING, stateFromPos.getValue(HorizontalDirectionalBlock.FACING));
      if (newState.hasProperty(StairBlock.HALF) && stateFromPos.hasProperty(StairBlock.HALF))
        newState = newState.setValue(StairBlock.HALF, stateFromPos.getValue(StairBlock.HALF));
      if (newState.hasProperty(StairBlock.SHAPE) && stateFromPos.hasProperty(StairBlock.SHAPE))
        newState = newState.setValue(StairBlock.SHAPE, stateFromPos.getValue(StairBlock.SHAPE));
      //
      //ok continue as normal
      ModColourable.LOGGER.debug(pos + " set to  " + newColour);
      world.removeBlock(pos, false);
      return world.setBlock(pos, newState, 0);
    }
    //    }
    return false;
  }

  public static void rotateToColorConnectedRecursive(Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColor, int rec) {
    if (rec > MAX_CONNECTED_UPDATE) {
      return;
    }
    for (Direction d : Direction.values()) {
      var newPos = pos.relative(d);
      BlockState wtfIsIt = world.getBlockState(newPos);
      if (wtfIsIt.getBlock() instanceof IHasColor block) {
        //get rainbow for target block here
        if (rotateToColor(block.getRainbow(), world, newPos, originalSourceColour, newColor)) {
          rec++;
          Rainbows.rotateToColorConnectedRecursive(world, newPos, originalSourceColour, newColor, rec);
        }
      }
    }
  }
  //world interactions
  //DyeColorless originalSourceColour can be null if previous block was non-mod
  //  public static void rotateColourByEvent(RightClickBlock event, Map<DyeColorless, Block> rainbow, DyeColorless originalSourceColour) {
  //    //    boolean doConnected = event.getEntity().isCrouching();
  //    final ItemStack itemInHand = event.getItemStack();
  //    final Level level = event.getLevel();
  //    if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
  //      rotateDye(rainbow, originalSourceColour, level, event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, false);
  //    }
  //    else if (itemInHand.is(Tags.Items.DYES)) {
  //      DyeColorless dye = DyeColorless.getDyeFromItem(itemInHand);
  //      if (dye != null) {
  //        rotateDye(rainbow, originalSourceColour, level, event.getPos(), event.getEntity(), itemInHand, dye, false);
  //      }
  //      else { //this never happens
  //        ModColourable.LOGGER.error(itemInHand);
  //        ModColourable.LOGGER.error("This is tagged as a dye item but its not a vanilla 16x dye  " + dye);
  //      }
  //    }
  //  }

  static void rotateDye(Map<DyeColorless, Block> rainbow,
      DyeColorless originalSourceColour,
      Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {}
}

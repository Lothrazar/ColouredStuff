package com.lothrazar.colouredstuff.color;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.lib.BlockFlibPillar;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.lothrazar.library.util.ItemStackUtil;
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
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

public class Rainbows {

  @Deprecated
  public static Map<Block, DyeColorless> KEYS = new HashMap<>();
  public static final int MAX_CONNECTED_UPDATE = 24;

  public static boolean rotateToColor(Map<DyeColorless, Block> rainbow, Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColour) {
    //
    BlockState oldState = world.getBlockState(pos);
    // 
    //
    DyeColorless oldColour = null;
    if (oldState.getBlock() instanceof IHasColor cblock) {
      oldColour = cblock.getColor();
    }
    if ((oldColour == null || newColour != oldColour)
        && (originalSourceColour == null || oldColour == originalSourceColour)) {
      //        var rainbow = cblock.getRainbow();
      BlockState newState = rainbow.get(newColour).defaultBlockState();
      //life hacks
      if (newState.hasProperty(BlockFlibPillar.AXIS) && oldState.hasProperty(BlockFlibPillar.AXIS))
        newState = newState.setValue(BlockFlibPillar.AXIS, oldState.getValue(BlockFlibPillar.AXIS));
      if (newState.hasProperty(SlabBlock.TYPE) && oldState.hasProperty(SlabBlock.TYPE))
        newState = newState.setValue(SlabBlock.TYPE, oldState.getValue(SlabBlock.TYPE));
      if (newState.hasProperty(BlockStateProperties.WATERLOGGED) && oldState.hasProperty(BlockStateProperties.WATERLOGGED))
        newState = newState.setValue(BlockStateProperties.WATERLOGGED, oldState.getValue(BlockStateProperties.WATERLOGGED));
      if (newState.hasProperty(FarmBlock.MOISTURE) && oldState.hasProperty(FarmBlock.MOISTURE))
        newState = newState.setValue(FarmBlock.MOISTURE, oldState.getValue(FarmBlock.MOISTURE));
      if (newState.hasProperty(HorizontalDirectionalBlock.FACING) && oldState.hasProperty(HorizontalDirectionalBlock.FACING))
        newState = newState.setValue(HorizontalDirectionalBlock.FACING, oldState.getValue(HorizontalDirectionalBlock.FACING));
      if (newState.hasProperty(StairBlock.HALF) && oldState.hasProperty(StairBlock.HALF))
        newState = newState.setValue(StairBlock.HALF, oldState.getValue(StairBlock.HALF));
      if (newState.hasProperty(StairBlock.SHAPE) && oldState.hasProperty(StairBlock.SHAPE))
        newState = newState.setValue(StairBlock.SHAPE, oldState.getValue(StairBlock.SHAPE));
      //
      //ok continue as normal
      ModColourable.LOGGER.info(pos + " set to  " + newColour);
      world.removeBlock(pos, false);
      return world.setBlock(pos, newState, 0);
    }
    //    }
    return false;
  }

  public static void setConnectedColour(Map<DyeColorless, Block> rainbow, Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColor, int rec) {
    if (rec > MAX_CONNECTED_UPDATE) {
      return;
    }
    for (Direction d : Direction.values()) {
      var newPos = pos.relative(d);
      if (rotateToColor(rainbow, world, newPos, originalSourceColour, newColor)) {
        rec++;
        Rainbows.setConnectedColour(rainbow, world, newPos, originalSourceColour, newColor, rec);
      }
    }
  }

  //world interactions
  //DyeColorless originalSourceColour can be null if previous block was non-mod
  public static void rotateColourByEvent(RightClickBlock event, Map<DyeColorless, Block> rainbow, DyeColorless originalSourceColour, boolean doConnected) {
    //    boolean doConnected = event.getEntity().isCrouching();
    final ItemStack itemInHand = event.getItemStack();
    final Level level = event.getLevel();
    if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      rotateDye(rainbow, originalSourceColour, level, event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      DyeColorless dye = DyeColorless.getDyeFromItem(itemInHand);
      if (dye != null) {
        rotateDye(rainbow, originalSourceColour, level, event.getPos(), event.getEntity(), itemInHand, dye, doConnected);
      }
      else {
        ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla 16x dye  " + dye);
      }
    }
  }

  private static void rotateDye(Map<DyeColorless, Block> rainbow,
      DyeColorless originalSourceColour,
      Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {
    boolean success = Rainbows.rotateToColor(rainbow, world, pos, originalSourceColour, newColour);
    //new color is different, NOW update
    if (success) {
      ItemStackUtil.shrink(player, heldStack);
      if (doConnected) {
        Rainbows.setConnectedColour(rainbow, world, pos, originalSourceColour, newColour, 0);
      }
    }
  }
}

package com.lothrazar.colouredstuff.color;

import java.util.Map;
import com.lothrazar.library.block.BlockAxisPillar;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;

public class Rainbows {

  public static final int MAX_CONNECTED_UPDATE = 24;

  public static boolean rotateToColor(Map<DyeColorless, Block> rainbow, Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColour) {
    boolean success = false;
    //
    BlockState stateFromPos = world.getBlockState(pos);
    DyeColorless oldColour = null;
    if (stateFromPos.getBlock() instanceof IHasColor cblock) {
      oldColour = cblock.getColor();
    }
    if ((oldColour == null || newColour != oldColour)
        && (originalSourceColour == null || oldColour == originalSourceColour)) {
      //do we want to go all the way back to a default block state her
      BlockState newState = rainbow.get(newColour).defaultBlockState();
      //life hacks
      newState = tryCloneProperty(stateFromPos, newState, ButtonBlock.FACE);
      newState = tryCloneProperty(stateFromPos, newState, BlockAxisPillar.AXIS);
      newState = tryCloneProperty(stateFromPos, newState, SlabBlock.TYPE);
      newState = tryCloneProperty(stateFromPos, newState, BlockStateProperties.WATERLOGGED);
      newState = tryCloneProperty(stateFromPos, newState, FarmBlock.MOISTURE);
      newState = tryCloneProperty(stateFromPos, newState, HorizontalDirectionalBlock.FACING);
      newState = tryCloneProperty(stateFromPos, newState, StairBlock.HALF);
      newState = tryCloneProperty(stateFromPos, newState, StairBlock.SHAPE);
      newState = tryCloneProperty(stateFromPos, newState, ButtonBlock.FACE);
      newState = tryCloneProperty(stateFromPos, newState, TrapDoorBlock.OPEN);
      newState = tryCloneProperty(stateFromPos, newState, TrapDoorBlock.HALF);
      newState = tryCloneProperty(stateFromPos, newState, WallBlock.EAST_WALL);
      newState = tryCloneProperty(stateFromPos, newState, WallBlock.NORTH_WALL);
      newState = tryCloneProperty(stateFromPos, newState, WallBlock.SOUTH_WALL);
      newState = tryCloneProperty(stateFromPos, newState, WallBlock.WEST_WALL);
      newState = tryCloneProperty(stateFromPos, newState, WallBlock.UP);
      //ok continue as normal
      //      world.removeBlock(pos, false); 
      success = world.setBlock(pos, newState, Block.UPDATE_ALL);
    }
    return success;
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  private static BlockState tryCloneProperty(BlockState stateFromPos, BlockState newState, Property face) {
    if (newState.hasProperty(face) && stateFromPos.hasProperty(face)) {
      newState = newState.setValue(face, stateFromPos.getValue(face));
    }
    return newState;
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
        if (block.getRainbow() != null
            && rotateToColor(block.getRainbow(), world, newPos, originalSourceColour, newColor)) {
          rec++;
          Rainbows.rotateToColorConnectedRecursive(world, newPos, originalSourceColour, newColor, rec);
        }
      }
    }
  }

  static void rotateDye(Map<DyeColorless, Block> rainbow,
      DyeColorless originalSourceColour,
      Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {}
}

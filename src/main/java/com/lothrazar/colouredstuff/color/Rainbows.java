package com.lothrazar.colouredstuff.color;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.colouredstuff.block.BlockColourPillar;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class Rainbows {

  public static Map<BlockColour, DyeColorless> KEYS = new HashMap<>();
  public static final int MAX_CONNECTED_UPDATE = 24;

  public static boolean rotateToColor(Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColour) {
    BlockState oldState = world.getBlockState(pos);
    if (oldState.getBlock() instanceof IHasColor cblock) {
      var oldColour = cblock.getColor();// Rainbows.KEYS.get(oldState.getBlock());
      if (newColour != oldColour && oldColour == originalSourceColour) { // AND oldColr == SourceColor
        var rainbow = cblock.getRainbow();
        BlockState newState = rainbow.get(newColour).defaultBlockState();
        if (newState.hasProperty(BlockColourPillar.AXIS)) {
          if (oldState.hasProperty(BlockColourPillar.AXIS)) {
            //copy it eh
            newState = newState.setValue(BlockColourPillar.AXIS, oldState.getValue(BlockColourPillar.AXIS));
          }
        }
        ModColourable.LOGGER.error(pos + " set to  " + newColour);
        world.removeBlock(pos, false);
        return world.setBlock(pos, newState, 0);
      }
    }
    return false;
  }

  public static void setConnectedColour(Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColor, int rec) {
    if (rec > MAX_CONNECTED_UPDATE) {
      return;
    }
    for (Direction d : Direction.values()) {
      var newPos = pos.relative(d);
      if (rotateToColor(world, newPos, originalSourceColour, newColor)) {
        rec++;
        Rainbows.setConnectedColour(world, newPos, originalSourceColour, newColor, rec);
      }
    }
  }
}

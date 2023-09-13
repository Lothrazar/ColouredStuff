package com.lothrazar.colouredstuff.color;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.lib.BlockFlibPillar;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class Rainbows {

  @Deprecated
  public static Map<Block, DyeColorless> KEYS = new HashMap<>();
  public static final int MAX_CONNECTED_UPDATE = 24;

  public static boolean rotateToColor(Level world, BlockPos pos, DyeColorless originalSourceColour, DyeColorless newColour) {
    BlockState oldState = world.getBlockState(pos);
    if (oldState.getBlock() instanceof IHasColor cblock) {
      var oldColour = cblock.getColor();
      if (newColour != oldColour && oldColour == originalSourceColour) {
        var rainbow = cblock.getRainbow();
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
        //ok continue as normal
        ModColourable.LOGGER.info(pos + " set to  " + newColour);
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

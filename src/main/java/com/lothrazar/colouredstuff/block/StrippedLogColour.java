package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.lib.BlockFlibPillar;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.state.BlockState;

public class StrippedLogColour extends BlockFlibPillar {

  public static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public StrippedLogColour(Properties p, DyeColorless s) {
    super(p);
    RAINBOW.put(s, this);
    this.color = s;
  }

  private final DyeColorless color;

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public Map<DyeColorless, Block> getRainbow() {
    return RAINBOW;
  }

  @Override
  public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    return ((FireBlock) Blocks.FIRE).getBurnOdds(Blocks.STRIPPED_OAK_LOG.defaultBlockState());
  }

  @Override
  public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
    return ((FireBlock) Blocks.FIRE).getIgniteOdds(Blocks.STRIPPED_OAK_LOG.defaultBlockState());
  }
}

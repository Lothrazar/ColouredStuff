package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PressurePlateColour extends PressurePlateBlock implements IHasColor {

  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public PressurePlateColour(Properties p, DyeColorless color) {
    super(PressurePlateBlock.Sensitivity.EVERYTHING, p.noCollission().strength(0.5F), BlockSetType.OAK); //oak so it has the sound effects of other wood pressure plates
    RAINBOW.put(color, this);
    this.color = color;
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
}

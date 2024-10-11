package com.lothrazar.colouredstuff.block;

import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DoorColour extends DoorBlock implements IHasColor {
  //  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public DoorColour(Properties p, DyeColorless color) {
    super(p.noOcclusion(), BlockSetType.OAK); //oak so it has the sound effects of other wood  
    //    RAINBOW.put(color, this);
    this.color = color;
  }

  private final DyeColorless color;

  @Override
  public DyeColorless getColor() {
    return color;
  }

  @Override
  public Map<DyeColorless, Block> getRainbow() {
    return null; // do not dye them in world. on purpose. buggy double blocks dont work
  }
}

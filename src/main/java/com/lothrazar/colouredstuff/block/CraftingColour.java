package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.color.IHasColor;
import com.lothrazar.colouredstuff.gui.CraftingMenuExt;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CraftingColour extends CraftingTableBlock implements IHasColor {

  private static Map<DyeColorless, Block> RAINBOW = new HashMap<>();

  public CraftingColour(Properties p, DyeColorless color) {
    super(p);
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

  @Override
  public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
    return new SimpleMenuProvider((id, inv, p) -> {
      return new CraftingMenuExt(id, inv, ContainerLevelAccess.create(level, pos), this);
    }, Component.translatable(this.getDescriptionId()));
  }
}

package com.lothrazar.colouredstuff.block;

import com.lothrazar.library.gui.CraftingMenuExt;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CraftingRainbow extends CraftingTableBlock {

  public CraftingRainbow(Properties p) {
    super(p);
  }

  @Override
  public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
    return new SimpleMenuProvider((id, inv, p) -> {
      return new CraftingMenuExt(id, inv, ContainerLevelAccess.create(level, pos), this);
    }, Component.translatable(this.getDescriptionId()));
  }
}

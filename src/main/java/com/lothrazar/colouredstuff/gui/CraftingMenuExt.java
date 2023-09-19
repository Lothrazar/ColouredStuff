package com.lothrazar.colouredstuff.gui;

import com.lothrazar.colouredstuff.block.CraftingColour;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;

public class CraftingMenuExt extends CraftingMenu {

  private ContainerLevelAccess cla; // mirrors this.access
  private CraftingColour block;

  public CraftingMenuExt(int id, Inventory inv, ContainerLevelAccess cla, CraftingColour block) {
    super(id, inv, cla);
    this.cla = cla;
    this.block = block;
  }

  public CraftingMenuExt(int id, Inventory inv, ContainerLevelAccess cla) {
    super(id, inv, cla);
    this.cla = cla;
  }

  @Override
  public boolean stillValid(Player p) {
    return block == null ? true : AbstractContainerMenu.stillValid(this.cla, p, block);
  }
}

package com.lothrazar.colouredstuff.library;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.CraftingTableBlock;

/**
 * Wrapper to extend the regular minecraft:crafting_table's gui container to allow custom blocks to re-use the GUI
 */
public class CraftingMenuExt extends CraftingMenu {

  private ContainerLevelAccess cla; // mirrors this.access
  private CraftingTableBlock block;

  public CraftingMenuExt(int id, Inventory inv, ContainerLevelAccess cla, CraftingTableBlock block) {
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

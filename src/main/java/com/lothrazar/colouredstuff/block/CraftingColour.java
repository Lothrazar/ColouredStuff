package com.lothrazar.colouredstuff.block;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.color.DyeColorless;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CraftingColour extends BlockColour {

  private static Map<DyeColorless, BlockColour> RAINBOW = new HashMap<>();

  public CraftingColour(Properties p, DyeColorless color) {
    super(p, color);
    RAINBOW.put(color, this);
  }

  @Override
  public Map<DyeColorless, BlockColour> getRainbow() {
    return RAINBOW;
  }

  @Override
  public InteractionResult use(BlockState p_52233_, Level p_52234_, BlockPos p_52235_, Player p_52236_, InteractionHand p_52237_, BlockHitResult p_52238_) {
    if (p_52234_.isClientSide) {
      return InteractionResult.SUCCESS;
    }
    else {
      p_52236_.openMenu(p_52233_.getMenuProvider(p_52234_, p_52235_));
      p_52236_.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
      return InteractionResult.CONSUME;
    }
  }

  @Override
  public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
    Block self = this;
    return new SimpleMenuProvider((p_52229_, p_52230_, p_52231_) -> {
      ContainerLevelAccess cla = ContainerLevelAccess.create(level, pos);
      return new CraftingMenu(p_52229_, p_52230_, cla) {

        @Override
        public boolean stillValid(Player p) {
          return AbstractContainerMenu.stillValid(cla, p, self);
        }
      };
    }, Component.translatable(this.getDescriptionId()));
  }
}

package com.lothrazar.colouredstuff.color;

import com.lothrazar.library.events.EventFlib;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerUseEvents extends EventFlib {

  @SubscribeEvent
  public void onRightClickBlock(RightClickBlock event) {
    if (event.getItemStack().isEmpty()) {
      return;
    }
    BlockState stateHit = event.getLevel().getBlockState(event.getPos());
    if (stateHit.getBlock() instanceof IHasColor block) {
      block.onRightClickBlock(event);
    }
  }
}

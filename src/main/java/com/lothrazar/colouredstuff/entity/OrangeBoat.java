package com.lothrazar.colouredstuff.entity;

import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class OrangeBoat extends Boat {

  public OrangeBoat(EntityType<? extends Boat> type, Level world) {
    super(type, world);
  }

  public OrangeBoat(Level level, double x, double y, double z) {
    super(ColourableItemRegistry.BOAT_ENTITY_ORANGE.get(), level);
    this.setPos(x, y, z);
    this.setDeltaMovement(Vec3.ZERO);
    this.xo = x;
    this.yo = y;
    this.zo = z;
  }

  @Override
  public Item getDropItem() {
    return ColourableItemRegistry.BOAT_ORANGE.get();
  }
}

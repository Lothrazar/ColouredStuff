package com.lothrazar.colouredstuff.entity;

import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class LightBlueBoat extends Boat {

  public LightBlueBoat(EntityType<? extends Boat> type, Level world) {
    super(type, world, ColourableItemRegistry.BOAT_LIGHT_BLUE);
  }

  public LightBlueBoat(Level level, double x, double y, double z) {
    super(ColourableItemRegistry.BOAT_ENTITY_LIGHT_BLUE.get(), level, ColourableItemRegistry.BOAT_LIGHT_BLUE);
    this.setPos(x, y, z);
    this.setDeltaMovement(Vec3.ZERO);
    this.xo = x;
    this.yo = y;
    this.zo = z;
  }

}

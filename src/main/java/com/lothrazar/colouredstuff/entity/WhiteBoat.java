package com.lothrazar.colouredstuff.entity;

import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages.SpawnEntity;

public class WhiteBoat extends Boat {

  public WhiteBoat(EntityType<? extends Boat> type, Level world) {
    super(type, world);
  }

  public WhiteBoat(Level level, double x, double y, double z) {
    super(ColourableItemRegistry.BOAT_ENTITY_WHITE.get(), level);
    this.setPos(x, y, z);
    this.setDeltaMovement(Vec3.ZERO);
    this.xo = x;
    this.yo = y;
    this.zo = z;
  }

  public WhiteBoat(SpawnEntity spawnEntity, Level level) {
    this(ColourableItemRegistry.BOAT_ENTITY_WHITE.get(), level);
  }

  @Override
  public Packet<ClientGamePacketListener> getAddEntityPacket() {
    return NetworkHooks.getEntitySpawningPacket(this);
  }

  @Override
  public Item getDropItem() {
    return ColourableItemRegistry.BOAT_WHITE.get();
  }
}

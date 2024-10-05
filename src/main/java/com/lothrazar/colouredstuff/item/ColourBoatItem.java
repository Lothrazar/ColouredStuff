package com.lothrazar.colouredstuff.item;

import java.util.List;
import java.util.function.Predicate;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.entity.BlackBoat;
import com.lothrazar.colouredstuff.entity.BlueBoat;
import com.lothrazar.colouredstuff.entity.RedBoat;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class ColourBoatItem extends Item {

  private static final Predicate<Entity> ENTITY_PREDICATE = EntitySelector.NO_SPECTATORS.and(Entity::isPickable);
  private DyeColorless color;

  public ColourBoatItem(Item.Properties properties, DyeColorless color) {
    super(properties.stacksTo(1));
    this.setColor(color);
  }

  @Override
  public InteractionResultHolder<ItemStack> use(Level level, Player playerIn, InteractionHand handIn) {
    ItemStack itemstack = playerIn.getItemInHand(handIn);
    HitResult hitResult = getPlayerPOVHitResult(level, playerIn, ClipContext.Fluid.ANY);
    if (hitResult.getType() == HitResult.Type.MISS) {
      return InteractionResultHolder.pass(itemstack);
    }
    else {
      Vec3 vec = playerIn.getViewVector(1.0F);
      List<Entity> list = level.getEntities(playerIn, playerIn.getBoundingBox().expandTowards(vec.scale(5.0D)).inflate(1.0D), ENTITY_PREDICATE);
      if (!list.isEmpty()) {
        Vec3 vector3d1 = playerIn.getEyePosition(1.0F);
        for (Entity entity : list) {
          AABB box = entity.getBoundingBox().inflate(entity.getPickRadius());
          if (box.contains(vector3d1)) {
            return InteractionResultHolder.pass(itemstack);
          }
        }
      }
      if (hitResult.getType() == HitResult.Type.BLOCK) {
        Boat eboat = new RedBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);;
        switch (color) {
          case BLACK:
            eboat = new BlackBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case BLUE:
            eboat = new BlueBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case BROWN:
          break;
          case CYAN:
          break;
          case GRAY:
          break;
          case GREEN:
          break;
          case LIGHT_BLUE:
          break;
          case LIGHT_GRAY:
          break;
          case LIME:
          break;
          case MAGENTA:
          break;
          case NONE:
          break;
          case ORANGE:
          break;
          case PINK:
          break;
          case PURPLE:
          break;
          case RED:
          break;
          case WHITE:
          break;
          case YELLOW:
          break;
          default:
          break;
        }
        eboat.setYRot(playerIn.getYRot());
        if (!level.noCollision(eboat, eboat.getBoundingBox().inflate(-0.1D))) {
          return InteractionResultHolder.fail(itemstack);
        }
        else {
          if (!level.isClientSide) {
            level.addFreshEntity(eboat);
            if (!playerIn.getAbilities().instabuild) {
              itemstack.shrink(1);
            }
          }
          playerIn.awardStat(Stats.ITEM_USED.get(this));
          return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
        }
      }
      else {
        return InteractionResultHolder.pass(itemstack);
      }
    }
  }

  public DyeColorless getColor() {
    return color;
  }

  public void setColor(DyeColorless color) {
    this.color = color;
  }
}
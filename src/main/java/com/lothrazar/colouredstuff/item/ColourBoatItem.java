package com.lothrazar.colouredstuff.item;

import java.util.List;
import java.util.function.Predicate;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.colouredstuff.entity.BlackBoat;
import com.lothrazar.colouredstuff.entity.BlueBoat;
import com.lothrazar.colouredstuff.entity.BrownBoat;
import com.lothrazar.colouredstuff.entity.CyanBoat;
import com.lothrazar.colouredstuff.entity.GrayBoat;
import com.lothrazar.colouredstuff.entity.GreenBoat;
import com.lothrazar.colouredstuff.entity.LightBlueBoat;
import com.lothrazar.colouredstuff.entity.LightGrayBoat;
import com.lothrazar.colouredstuff.entity.LimeBoat;
import com.lothrazar.colouredstuff.entity.MagentaBoat;
import com.lothrazar.colouredstuff.entity.NoneBoat;
import com.lothrazar.colouredstuff.entity.OrangeBoat;
import com.lothrazar.colouredstuff.entity.PinkBoat;
import com.lothrazar.colouredstuff.entity.PurpleBoat;
import com.lothrazar.colouredstuff.entity.RedBoat;
import com.lothrazar.colouredstuff.entity.WhiteBoat;
import com.lothrazar.colouredstuff.entity.YellowBoat;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.boat.Boat;
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
  public InteractionResult use(Level level, Player playerIn, InteractionHand handIn) {
    ItemStack itemstack = playerIn.getItemInHand(handIn);
    HitResult hitResult = getPlayerPOVHitResult(level, playerIn, ClipContext.Fluid.ANY);
    if (hitResult.getType() == HitResult.Type.MISS) {
      return InteractionResult.PASS;
    }
    else {
      Vec3 vec = playerIn.getViewVector(1.0F);
      List<Entity> list = level.getEntities(playerIn, playerIn.getBoundingBox().expandTowards(vec.scale(5.0D)).inflate(1.0D), ENTITY_PREDICATE);
      if (!list.isEmpty()) {
        Vec3 vector3d1 = playerIn.getEyePosition(1.0F);
        for (Entity entity : list) {
          AABB box = entity.getBoundingBox().inflate(entity.getPickRadius());
          if (box.contains(vector3d1)) {
            return InteractionResult.PASS;
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
            eboat = new BrownBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case CYAN:
            eboat = new CyanBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case GRAY:
            eboat = new GrayBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case GREEN:
            eboat = new GreenBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case LIGHT_BLUE:
            eboat = new LightBlueBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case LIGHT_GRAY:
            eboat = new LightGrayBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case LIME:
            eboat = new LimeBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case MAGENTA:
            eboat = new MagentaBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case NONE:
            eboat = new NoneBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case ORANGE:
            eboat = new OrangeBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case PINK:
            eboat = new PinkBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case PURPLE:
            eboat = new PurpleBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case RED:
            eboat = new RedBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case WHITE:
            eboat = new WhiteBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          case YELLOW:
            eboat = new YellowBoat(level, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z);
          break;
          default:
          break;
        }
        eboat.setYRot(playerIn.getYRot());
        if (!level.noCollision(eboat, eboat.getBoundingBox().inflate(-0.1D))) {
          return InteractionResult.FAIL;
        }
        else {
          if (!level.isClientSide()) {
            level.addFreshEntity(eboat);
            if (!playerIn.getAbilities().instabuild) {
              itemstack.shrink(1);
            }
          }
          playerIn.awardStat(Stats.ITEM_USED.get(this));
          return level.isClientSide() ? InteractionResult.SUCCESS : InteractionResult.SUCCESS_SERVER;
        }
      }
      else {
        return InteractionResult.PASS;
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
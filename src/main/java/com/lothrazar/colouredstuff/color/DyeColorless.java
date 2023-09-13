package com.lothrazar.colouredstuff.color;

import java.util.HashMap;
import java.util.Map;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.Tags;

public enum DyeColorless implements StringRepresentable {

  WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK, NONE;

  public boolean isColorless() {
    return this == NONE;
  }

  public static final Map<DyeColorless, DyeColor> TOCOLOR = new HashMap<>() {

    {
      put(DyeColorless.WHITE, DyeColor.WHITE);
      put(DyeColorless.ORANGE, DyeColor.ORANGE);
      put(DyeColorless.MAGENTA, DyeColor.MAGENTA);
      put(DyeColorless.LIGHT_BLUE, DyeColor.LIGHT_BLUE);
      put(DyeColorless.YELLOW, DyeColor.YELLOW);
      put(DyeColorless.LIME, DyeColor.LIME);
      put(DyeColorless.PINK, DyeColor.PINK);
      put(DyeColorless.GRAY, DyeColor.GRAY);
      put(DyeColorless.LIGHT_GRAY, DyeColor.LIGHT_GRAY);
      put(DyeColorless.CYAN, DyeColor.CYAN);
      put(DyeColorless.PURPLE, DyeColor.PURPLE);
      put(DyeColorless.BLUE, DyeColor.BLUE);
      put(DyeColorless.BROWN, DyeColor.BROWN);
      put(DyeColorless.GREEN, DyeColor.GREEN);
      put(DyeColorless.RED, DyeColor.RED);
      put(DyeColorless.BLACK, DyeColor.BLACK);
      put(DyeColorless.NONE, null);
    }
  };

  public static DyeColorless getDyeFromItem(ItemStack itemInHand) {
    //cheap hack
    //    if (itemInHand.getItem() instanceof DyeItem newColor) {
    //      return toColorless(newColor.getDyeColor());
    //    }
    //    else 
    if (itemInHand.is(Tags.Items.DYES_WHITE)) {
      return WHITE;
    }
    if (itemInHand.is(Tags.Items.DYES_BLUE)) {
      return BLUE;
    }
    if (itemInHand.is(Tags.Items.DYES_BROWN)) {
      return BROWN;
    }
    if (itemInHand.is(Tags.Items.DYES_CYAN)) {
      return CYAN;
    }
    if (itemInHand.is(Tags.Items.DYES_BLACK)) {
      return BLACK;
    }
    if (itemInHand.is(Tags.Items.DYES_GRAY)) {
      return GRAY;
    }
    if (itemInHand.is(Tags.Items.DYES_GREEN)) {
      return GREEN;
    }
    if (itemInHand.is(Tags.Items.DYES_LIGHT_BLUE)) {
      return LIGHT_BLUE;
    }
    if (itemInHand.is(Tags.Items.DYES_LIGHT_GRAY)) {
      return LIGHT_GRAY;
    }
    if (itemInHand.is(Tags.Items.DYES_LIME)) {
      return LIME;
    }
    if (itemInHand.is(Tags.Items.DYES_MAGENTA)) {
      return MAGENTA;
    }
    if (itemInHand.is(Tags.Items.DYES_ORANGE)) {
      return ORANGE;
    }
    if (itemInHand.is(Tags.Items.DYES_PINK)) {
      return PINK;
    }
    if (itemInHand.is(Tags.Items.DYES_PURPLE)) {
      return PURPLE;
    }
    if (itemInHand.is(Tags.Items.DYES_RED)) {
      return RED;
    }
    if (itemInHand.is(Tags.Items.DYES_WHITE)) {
      return WHITE;
    }
    if (itemInHand.is(Tags.Items.DYES_YELLOW)) {
      return YELLOW;
    }
    else if (itemInHand.is(ColourableItemRegistry.DYES_NONE)) {
      return NONE;
    }
    return null;
  }

  /**
   * Will be null for color NONE
   * 
   */
  //  @Nullable
  //  public DyeColor toDyeColor() {
  //    return TOCOLOR.get(this);
  //  }
  public static DyeColorless toColorless(DyeColor color) {
    for (Map.Entry<DyeColorless, DyeColor> entry : TOCOLOR.entrySet()) {
      if (entry.getValue() == color) {
        return entry.getKey();
      }
    }
    return DyeColorless.NONE;
  }

  @Override
  public String getSerializedName() {
    return this.name().toLowerCase();
  }

  @Override
  public String toString() {
    return this.getSerializedName();
  }
}

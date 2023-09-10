package com.lothrazar.colouredstuff.item;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.DyeColor;

public enum DyeColorless implements StringRepresentable {

  WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK, NONE;

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

  public DyeColor toDyeColor() {
    return TOCOLOR.get(this);
  }

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

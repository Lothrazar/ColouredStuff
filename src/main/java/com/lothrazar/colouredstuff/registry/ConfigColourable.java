package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.library.config.ConfigTemplate;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class ConfigColourable extends ConfigTemplate {

  public static BooleanValue INFINITE_WATER;
  public static BooleanValue IN_WORLD_DYE;
  public static BooleanValue MULTI_DYE;
  public static BooleanValue VANILLA_OVERRIDE;
  public static BooleanValue RGB_CRAFTING_TABLE;
  public static BooleanValue CONSUME;
  private static ForgeConfigSpec CONFIG;
  static {
    final ForgeConfigSpec.Builder BUILDER = builder();
    BUILDER.comment("Colourable Stuff config.  For modpack devs: also see the datapack for custom recipes and item tags. ").push(ModColourable.MODID);
    RGB_CRAFTING_TABLE = BUILDER.comment(" Add the RGB/rainbow crafting table item.  Setting to false will not register the item")
        .define("rgb.enabled", false);
    //   
    BUILDER.comment(" Items tagged with any 'forge/dyes:' colour including dyes/none will edit blocks in world when used and switch to that colour.  Even when enabled, valid dyes that are also tagged as stationery writing implements will be ignored from this feature, see forge:tools/stationery (for example the Chalk mod items are both dyes and stationery tools)").push("in_world_dye");
    //
    IN_WORLD_DYE = BUILDER.comment(" Use dye items on blocks in-world to change dye colour of target block")
        .define("enabled", true);
    MULTI_DYE = BUILDER.comment(" Also allows you to sneak and dye multiple blocks from the mod all at once for the same cost (only works if enabled=true also)")
        .define("multi_block", true);
    CONSUME = BUILDER.comment(" Will the dye get consumed when dye-ing blocks in world.  Changing to false will mean right clicking blocks with dye will not consume any items from your stack")
        .define("consume", true);
    VANILLA_OVERRIDE = BUILDER.comment(" If enabled, then vanilla blocks can also be dyed in world and converted to the modded block (only works if enabled=true also)")
        .define("vanilla_override", true);
    BUILDER.pop();
    //
    INFINITE_WATER = BUILDER.comment(" Is the dyed water an infinite source like regular water where new source blocks get generated")
        .define("water.infinite", true);
    //
    BUILDER.pop();
    CONFIG = BUILDER.build();
  }

  public static boolean infWater() {
    return INFINITE_WATER.get();
  }

  public ConfigColourable() {
    CONFIG.setConfig(setup(ModColourable.MODID));
  }
}

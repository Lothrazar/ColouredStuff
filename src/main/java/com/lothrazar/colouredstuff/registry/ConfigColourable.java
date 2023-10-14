package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.library.config.ConfigTemplate;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class ConfigColourable extends ConfigTemplate {

  public static BooleanValue IN_WORLD_DYE;
  public static BooleanValue MULTI_DYE;
  public static BooleanValue VANILLA_OVERRIDE;
  private static ForgeConfigSpec CONFIG;
  static {
    final ForgeConfigSpec.Builder BUILDER = builder();
    BUILDER.comment("Colourable Stuff config").push(ModColourable.MODID);
    //
    IN_WORLD_DYE = BUILDER.comment(" Use dye items on blocks in-world to change dye colour of target block")
        .define("in_world_dye.enabled", true);
    MULTI_DYE = BUILDER.comment(" Also allows you to sneak and dye multiple blocks from the mod all at once for the same cost (only works if enabled=true also)")
        .define("in_world_dye.multi_block", true);
    VANILLA_OVERRIDE = BUILDER.comment(" If enabled, then vanilla blocks can also be dyed in world and converted to the modded block (only works if enabled=true also)")
        .define("in_world_dye.vanilla_override", true);
    //
    BUILDER.pop();
    CONFIG = BUILDER.build();
  }

  public ConfigColourable() {
    CONFIG.setConfig(setup(ModColourable.MODID));
  }
}

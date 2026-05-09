package com.lothrazar.colouredstuff.registry;

import com.lothrazar.colouredstuff.ModColourable;
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
import com.lothrazar.colouredstuff.item.ColourBoatItem;
import com.lothrazar.colouredstuff.item.ItemColour;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;

@EventBusSubscriber(modid = ModColourable.MODID)
public class ColourableItemRegistry {

  public static class BurnTime {

    public static final int SAPLING = 100;
    public static final int WOOD = 300;
    public static final int WOODSLAB = 150;
  }

  public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(net.minecraft.core.registries.Registries.ENTITY_TYPE, ModColourable.MODID);

  public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
    return builder.build(id);
  }

  public static final DeferredHolder<EntityType<?>, EntityType<NoneBoat>> BOAT_ENTITY_NONE = ENTITIES.register("boat_none", () -> register("boat_none",
      EntityType.Builder.<NoneBoat> of(NoneBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F)));
  public static final DeferredHolder<EntityType<?>, EntityType<BlackBoat>> BOAT_ENTITY_BLACK = ENTITIES.register("boat_black", () -> register("boat_black", EntityType.Builder.<BlackBoat> of(BlackBoat::new, MobCategory.MISC)
      .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<BlueBoat>> BOAT_ENTITY_BLUE = ENTITIES.register("boat_blue", () -> register("boat_blue", EntityType.Builder.<BlueBoat> of(BlueBoat::new, MobCategory.MISC)
      .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<BrownBoat>> BOAT_ENTITY_BROWN = ENTITIES.register("boat_brown", () -> register("boat_brown",
      EntityType.Builder.<BrownBoat> of(BrownBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<CyanBoat>> BOAT_ENTITY_CYAN = ENTITIES.register("boat_cyan", () -> register("boat_cyan",
      EntityType.Builder.<CyanBoat> of(CyanBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<GrayBoat>> BOAT_ENTITY_GRAY = ENTITIES.register("boat_gray", () -> register("boat_gray",
      EntityType.Builder.<GrayBoat> of(GrayBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<GreenBoat>> BOAT_ENTITY_GREEN = ENTITIES.register("boat_green", () -> register("boat_green",
      EntityType.Builder.<GreenBoat> of(GreenBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<LightBlueBoat>> BOAT_ENTITY_LIGHT_BLUE = ENTITIES.register("boat_light_blue", () -> register("boat_light_blue",
      EntityType.Builder.<LightBlueBoat> of(LightBlueBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<LightGrayBoat>> BOAT_ENTITY_LIGHT_GRAY = ENTITIES.register("boat_light_gray", () -> register("boat_light_gray",
      EntityType.Builder.<LightGrayBoat> of(LightGrayBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<LimeBoat>> BOAT_ENTITY_LIME = ENTITIES.register("boat_lime", () -> register("boat_lime",
      EntityType.Builder.<LimeBoat> of(LimeBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<MagentaBoat>> BOAT_ENTITY_MAGENTA = ENTITIES.register("boat_magenta", () -> register("boat_magenta",
      EntityType.Builder.<MagentaBoat> of(MagentaBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<OrangeBoat>> BOAT_ENTITY_ORANGE = ENTITIES.register("boat_orange", () -> register("boat_orange",
      EntityType.Builder.<OrangeBoat> of(OrangeBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<PinkBoat>> BOAT_ENTITY_PINK = ENTITIES.register("boat_pink", () -> register("boat_pink",
      EntityType.Builder.<PinkBoat> of(PinkBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<PurpleBoat>> BOAT_ENTITY_PURPLE = ENTITIES.register("boat_purple", () -> register("boat_purple",
      EntityType.Builder.<PurpleBoat> of(PurpleBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<RedBoat>> BOAT_ENTITY_RED = ENTITIES.register("boat_red", () -> register("boat_red",
      EntityType.Builder.<RedBoat> of(RedBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<WhiteBoat>> BOAT_ENTITY_WHITE = ENTITIES.register("boat_white", () -> register("boat_white",
      EntityType.Builder.<WhiteBoat> of(WhiteBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  public static final DeferredHolder<EntityType<?>, EntityType<YellowBoat>> BOAT_ENTITY_YELLOW = ENTITIES.register("boat_yellow", () -> register("boat_yellow",
      EntityType.Builder.<YellowBoat> of(YellowBoat::new, MobCategory.MISC)
          .sized(1.375F, 0.5625F).clientTrackingRange(10)));
  //  
  //
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModColourable.MODID);
  // 
  public static final DeferredItem<Item> PLANKS_none = ITEMS.register("planks_none", () -> new ItemColour(ColourableBlockRegistry.PLANKS_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_black = ITEMS.register("planks_black", () -> new ItemColour(ColourableBlockRegistry.planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_blue = ITEMS.register("planks_blue", () -> new ItemColour(ColourableBlockRegistry.planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_brown = ITEMS.register("planks_brown", () -> new ItemColour(ColourableBlockRegistry.PLANKS_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_cyan = ITEMS.register("planks_cyan", () -> new ItemColour(ColourableBlockRegistry.PLANKS_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_gray = ITEMS.register("planks_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_green = ITEMS.register("planks_green", () -> new ItemColour(ColourableBlockRegistry.PLANKS_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_light_blue = ITEMS.register("planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_light_gray = ITEMS.register("planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.PLANKS_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_lime = ITEMS.register("planks_lime", () -> new ItemColour(ColourableBlockRegistry.PLANKS_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_magenta = ITEMS.register("planks_magenta", () -> new ItemColour(ColourableBlockRegistry.PLANKS_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_orange = ITEMS.register("planks_orange", () -> new ItemColour(ColourableBlockRegistry.PLANKS_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_pink = ITEMS.register("planks_pink", () -> new ItemColour(ColourableBlockRegistry.PLANKS_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_purple = ITEMS.register("planks_purple", () -> new ItemColour(ColourableBlockRegistry.PLANKS_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_red = ITEMS.register("planks_red", () -> new ItemColour(ColourableBlockRegistry.PLANKS_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_white = ITEMS.register("planks_white", () -> new ItemColour(ColourableBlockRegistry.PLANKS_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> PLANKS_yellow = ITEMS.register("planks_yellow", () -> new ItemColour(ColourableBlockRegistry.PLANKS_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> log_none = ITEMS.register("log_none", () -> new ItemColour(ColourableBlockRegistry.log_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_black = ITEMS.register("log_black", () -> new ItemColour(ColourableBlockRegistry.log_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_blue = ITEMS.register("log_blue", () -> new ItemColour(ColourableBlockRegistry.log_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_brown = ITEMS.register("log_brown", () -> new ItemColour(ColourableBlockRegistry.log_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_cyan = ITEMS.register("log_cyan", () -> new ItemColour(ColourableBlockRegistry.log_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_gray = ITEMS.register("log_gray", () -> new ItemColour(ColourableBlockRegistry.log_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_green = ITEMS.register("log_green", () -> new ItemColour(ColourableBlockRegistry.log_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_light_blue = ITEMS.register("log_light_blue", () -> new ItemColour(ColourableBlockRegistry.log_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_light_gray = ITEMS.register("log_light_gray", () -> new ItemColour(ColourableBlockRegistry.log_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_lime = ITEMS.register("log_lime", () -> new ItemColour(ColourableBlockRegistry.log_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_magenta = ITEMS.register("log_magenta", () -> new ItemColour(ColourableBlockRegistry.log_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_orange = ITEMS.register("log_orange", () -> new ItemColour(ColourableBlockRegistry.log_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_pink = ITEMS.register("log_pink", () -> new ItemColour(ColourableBlockRegistry.log_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_purple = ITEMS.register("log_purple", () -> new ItemColour(ColourableBlockRegistry.log_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_red = ITEMS.register("log_red", () -> new ItemColour(ColourableBlockRegistry.log_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_white = ITEMS.register("log_white", () -> new ItemColour(ColourableBlockRegistry.log_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_yellow = ITEMS.register("log_yellow", () -> new ItemColour(ColourableBlockRegistry.log_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> wood_none = ITEMS.register("wood_none", () -> new ItemColour(ColourableBlockRegistry.wood_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_black = ITEMS.register("wood_black", () -> new ItemColour(ColourableBlockRegistry.wood_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_blue = ITEMS.register("wood_blue", () -> new ItemColour(ColourableBlockRegistry.wood_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_brown = ITEMS.register("wood_brown", () -> new ItemColour(ColourableBlockRegistry.wood_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_cyan = ITEMS.register("wood_cyan", () -> new ItemColour(ColourableBlockRegistry.wood_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_gray = ITEMS.register("wood_gray", () -> new ItemColour(ColourableBlockRegistry.wood_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_green = ITEMS.register("wood_green", () -> new ItemColour(ColourableBlockRegistry.wood_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_light_blue = ITEMS.register("wood_light_blue", () -> new ItemColour(ColourableBlockRegistry.wood_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_light_gray = ITEMS.register("wood_light_gray", () -> new ItemColour(ColourableBlockRegistry.wood_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_lime = ITEMS.register("wood_lime", () -> new ItemColour(ColourableBlockRegistry.wood_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_magenta = ITEMS.register("wood_magenta", () -> new ItemColour(ColourableBlockRegistry.wood_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_orange = ITEMS.register("wood_orange", () -> new ItemColour(ColourableBlockRegistry.wood_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_pink = ITEMS.register("wood_pink", () -> new ItemColour(ColourableBlockRegistry.wood_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_purple = ITEMS.register("wood_purple", () -> new ItemColour(ColourableBlockRegistry.wood_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_red = ITEMS.register("wood_red", () -> new ItemColour(ColourableBlockRegistry.wood_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_white = ITEMS.register("wood_white", () -> new ItemColour(ColourableBlockRegistry.wood_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_yellow = ITEMS.register("wood_yellow", () -> new ItemColour(ColourableBlockRegistry.wood_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> log_stripped_none = ITEMS.register("log_stripped_none", () -> new ItemColour(ColourableBlockRegistry.log_stripped_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_black = ITEMS.register("log_stripped_black", () -> new ItemColour(ColourableBlockRegistry.log_stripped_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_blue = ITEMS.register("log_stripped_blue", () -> new ItemColour(ColourableBlockRegistry.log_stripped_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_brown = ITEMS.register("log_stripped_brown", () -> new ItemColour(ColourableBlockRegistry.log_stripped_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_cyan = ITEMS.register("log_stripped_cyan", () -> new ItemColour(ColourableBlockRegistry.log_stripped_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_gray = ITEMS.register("log_stripped_gray", () -> new ItemColour(ColourableBlockRegistry.log_stripped_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_green = ITEMS.register("log_stripped_green", () -> new ItemColour(ColourableBlockRegistry.log_stripped_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_light_blue = ITEMS.register("log_stripped_light_blue", () -> new ItemColour(ColourableBlockRegistry.log_stripped_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_light_gray = ITEMS.register("log_stripped_light_gray", () -> new ItemColour(ColourableBlockRegistry.log_stripped_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_lime = ITEMS.register("log_stripped_lime", () -> new ItemColour(ColourableBlockRegistry.log_stripped_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_magenta = ITEMS.register("log_stripped_magenta", () -> new ItemColour(ColourableBlockRegistry.log_stripped_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_orange = ITEMS.register("log_stripped_orange", () -> new ItemColour(ColourableBlockRegistry.log_stripped_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_pink = ITEMS.register("log_stripped_pink", () -> new ItemColour(ColourableBlockRegistry.log_stripped_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_purple = ITEMS.register("log_stripped_purple", () -> new ItemColour(ColourableBlockRegistry.log_stripped_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_red = ITEMS.register("log_stripped_red", () -> new ItemColour(ColourableBlockRegistry.log_stripped_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_white = ITEMS.register("log_stripped_white", () -> new ItemColour(ColourableBlockRegistry.log_stripped_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> log_stripped_yellow = ITEMS.register("log_stripped_yellow", () -> new ItemColour(ColourableBlockRegistry.log_stripped_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> wood_stripped_none = ITEMS.register("wood_stripped_none", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_black = ITEMS.register("wood_stripped_black", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_blue = ITEMS.register("wood_stripped_blue", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_brown = ITEMS.register("wood_stripped_brown", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_cyan = ITEMS.register("wood_stripped_cyan", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_gray = ITEMS.register("wood_stripped_gray", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_green = ITEMS.register("wood_stripped_green", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_light_blue = ITEMS.register("wood_stripped_light_blue", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_light_gray = ITEMS.register("wood_stripped_light_gray", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_lime = ITEMS.register("wood_stripped_lime", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_magenta = ITEMS.register("wood_stripped_magenta", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_orange = ITEMS.register("wood_stripped_orange", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_pink = ITEMS.register("wood_stripped_pink", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_purple = ITEMS.register("wood_stripped_purple", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_red = ITEMS.register("wood_stripped_red", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_white = ITEMS.register("wood_stripped_white", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wood_stripped_yellow = ITEMS.register("wood_stripped_yellow", () -> new ItemColour(ColourableBlockRegistry.wood_stripped_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> crafting_table_none = ITEMS.register("crafting_table_none", () -> new ItemColour(ColourableBlockRegistry.crafting_table_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_black = ITEMS.register("crafting_table_black", () -> new ItemColour(ColourableBlockRegistry.crafting_table_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_blue = ITEMS.register("crafting_table_blue", () -> new ItemColour(ColourableBlockRegistry.crafting_table_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_brown = ITEMS.register("crafting_table_brown", () -> new ItemColour(ColourableBlockRegistry.crafting_table_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_cyan = ITEMS.register("crafting_table_cyan", () -> new ItemColour(ColourableBlockRegistry.crafting_table_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_gray = ITEMS.register("crafting_table_gray", () -> new ItemColour(ColourableBlockRegistry.crafting_table_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_green = ITEMS.register("crafting_table_green", () -> new ItemColour(ColourableBlockRegistry.crafting_table_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_light_blue = ITEMS.register("crafting_table_light_blue", () -> new ItemColour(ColourableBlockRegistry.crafting_table_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_light_gray = ITEMS.register("crafting_table_light_gray", () -> new ItemColour(ColourableBlockRegistry.crafting_table_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_lime = ITEMS.register("crafting_table_lime", () -> new ItemColour(ColourableBlockRegistry.crafting_table_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_magenta = ITEMS.register("crafting_table_magenta", () -> new ItemColour(ColourableBlockRegistry.crafting_table_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_orange = ITEMS.register("crafting_table_orange", () -> new ItemColour(ColourableBlockRegistry.crafting_table_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_pink = ITEMS.register("crafting_table_pink", () -> new ItemColour(ColourableBlockRegistry.crafting_table_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_purple = ITEMS.register("crafting_table_purple", () -> new ItemColour(ColourableBlockRegistry.crafting_table_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_red = ITEMS.register("crafting_table_red", () -> new ItemColour(ColourableBlockRegistry.crafting_table_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_white = ITEMS.register("crafting_table_white", () -> new ItemColour(ColourableBlockRegistry.crafting_table_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> crafting_table_yellow = ITEMS.register("crafting_table_yellow", () -> new ItemColour(ColourableBlockRegistry.crafting_table_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> leaves_none = ITEMS.register("leaves_none", () -> new ItemColour(ColourableBlockRegistry.leaves_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_black = ITEMS.register("leaves_black", () -> new ItemColour(ColourableBlockRegistry.leaves_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_blue = ITEMS.register("leaves_blue", () -> new ItemColour(ColourableBlockRegistry.leaves_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_brown = ITEMS.register("leaves_brown", () -> new ItemColour(ColourableBlockRegistry.leaves_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_cyan = ITEMS.register("leaves_cyan", () -> new ItemColour(ColourableBlockRegistry.leaves_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_gray = ITEMS.register("leaves_gray", () -> new ItemColour(ColourableBlockRegistry.leaves_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_green = ITEMS.register("leaves_green", () -> new ItemColour(ColourableBlockRegistry.leaves_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_light_blue = ITEMS.register("leaves_light_blue", () -> new ItemColour(ColourableBlockRegistry.leaves_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_light_gray = ITEMS.register("leaves_light_gray", () -> new ItemColour(ColourableBlockRegistry.leaves_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_lime = ITEMS.register("leaves_lime", () -> new ItemColour(ColourableBlockRegistry.leaves_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_magenta = ITEMS.register("leaves_magenta", () -> new ItemColour(ColourableBlockRegistry.leaves_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_orange = ITEMS.register("leaves_orange", () -> new ItemColour(ColourableBlockRegistry.leaves_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_pink = ITEMS.register("leaves_pink", () -> new ItemColour(ColourableBlockRegistry.leaves_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_purple = ITEMS.register("leaves_purple", () -> new ItemColour(ColourableBlockRegistry.leaves_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_red = ITEMS.register("leaves_red", () -> new ItemColour(ColourableBlockRegistry.leaves_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_white = ITEMS.register("leaves_white", () -> new ItemColour(ColourableBlockRegistry.leaves_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> leaves_yellow = ITEMS.register("leaves_yellow", () -> new ItemColour(ColourableBlockRegistry.leaves_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> sapling_none = ITEMS.register("sapling_none", () -> new ItemColour(ColourableBlockRegistry.sapling_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_black = ITEMS.register("sapling_black", () -> new ItemColour(ColourableBlockRegistry.sapling_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_blue = ITEMS.register("sapling_blue", () -> new ItemColour(ColourableBlockRegistry.sapling_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_brown = ITEMS.register("sapling_brown", () -> new ItemColour(ColourableBlockRegistry.sapling_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_cyan = ITEMS.register("sapling_cyan", () -> new ItemColour(ColourableBlockRegistry.sapling_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_gray = ITEMS.register("sapling_gray", () -> new ItemColour(ColourableBlockRegistry.sapling_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_green = ITEMS.register("sapling_green", () -> new ItemColour(ColourableBlockRegistry.sapling_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_light_blue = ITEMS.register("sapling_light_blue", () -> new ItemColour(ColourableBlockRegistry.sapling_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_light_gray = ITEMS.register("sapling_light_gray", () -> new ItemColour(ColourableBlockRegistry.sapling_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_lime = ITEMS.register("sapling_lime", () -> new ItemColour(ColourableBlockRegistry.sapling_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_magenta = ITEMS.register("sapling_magenta", () -> new ItemColour(ColourableBlockRegistry.sapling_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_orange = ITEMS.register("sapling_orange", () -> new ItemColour(ColourableBlockRegistry.sapling_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_pink = ITEMS.register("sapling_pink", () -> new ItemColour(ColourableBlockRegistry.sapling_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_purple = ITEMS.register("sapling_purple", () -> new ItemColour(ColourableBlockRegistry.sapling_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_red = ITEMS.register("sapling_red", () -> new ItemColour(ColourableBlockRegistry.sapling_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_white = ITEMS.register("sapling_white", () -> new ItemColour(ColourableBlockRegistry.sapling_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  public static final DeferredItem<Item> sapling_yellow = ITEMS.register("sapling_yellow", () -> new ItemColour(ColourableBlockRegistry.sapling_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.SAPLING)));
  //
  public static final DeferredItem<Item> cobblestone_none = ITEMS.register("cobblestone_none", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_NONE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_black = ITEMS.register("cobblestone_black", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_BLACK.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_blue = ITEMS.register("cobblestone_blue", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_BLUE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_brown = ITEMS.register("cobblestone_brown", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_BROWN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_cyan = ITEMS.register("cobblestone_cyan", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_CYAN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_gray = ITEMS.register("cobblestone_gray", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_GRAY.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_green = ITEMS.register("cobblestone_green", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_GREEN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_light_blue = ITEMS.register("cobblestone_light_blue", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_LIGHT_BLUE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_light_gray = ITEMS.register("cobblestone_light_gray", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_LIGHT_GRAY.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_lime = ITEMS.register("cobblestone_lime", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_LIME.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_magenta = ITEMS.register("cobblestone_magenta", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_MAGENTA.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_orange = ITEMS.register("cobblestone_orange", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_ORANGE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_pink = ITEMS.register("cobblestone_pink", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_PINK.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_purple = ITEMS.register("cobblestone_purple", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_PURPLE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_red = ITEMS.register("cobblestone_red", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_RED.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_white = ITEMS.register("cobblestone_white", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_WHITE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cobblestone_yellow = ITEMS.register("cobblestone_yellow", () -> new ItemColour(ColourableBlockRegistry.COBBLESTONE_YELLOW.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> stone_none = ITEMS.register("stone_none", () -> new ItemColour(ColourableBlockRegistry.STONE_NONE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_black = ITEMS.register("stone_black", () -> new ItemColour(ColourableBlockRegistry.STONE_BLACK.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_blue = ITEMS.register("stone_blue", () -> new ItemColour(ColourableBlockRegistry.STONE_BLUE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_brown = ITEMS.register("stone_brown", () -> new ItemColour(ColourableBlockRegistry.STONE_BROWN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_cyan = ITEMS.register("stone_cyan", () -> new ItemColour(ColourableBlockRegistry.STONE_CYAN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_gray = ITEMS.register("stone_gray", () -> new ItemColour(ColourableBlockRegistry.STONE_GRAY.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_green = ITEMS.register("stone_green", () -> new ItemColour(ColourableBlockRegistry.STONE_GREEN.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_light_blue = ITEMS.register("stone_light_blue", () -> new ItemColour(ColourableBlockRegistry.STONE_LIGHT_BLUE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_light_gray = ITEMS.register("stone_light_gray", () -> new ItemColour(ColourableBlockRegistry.STONE_LIGHT_GRAY.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_lime = ITEMS.register("stone_lime", () -> new ItemColour(ColourableBlockRegistry.STONE_LIME.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_magenta = ITEMS.register("stone_magenta", () -> new ItemColour(ColourableBlockRegistry.STONE_MAGENTA.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_orange = ITEMS.register("stone_orange", () -> new ItemColour(ColourableBlockRegistry.STONE_ORANGE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_pink = ITEMS.register("stone_pink", () -> new ItemColour(ColourableBlockRegistry.STONE_PINK.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_purple = ITEMS.register("stone_purple", () -> new ItemColour(ColourableBlockRegistry.STONE_PURPLE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_red = ITEMS.register("stone_red", () -> new ItemColour(ColourableBlockRegistry.STONE_RED.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_white = ITEMS.register("stone_white", () -> new ItemColour(ColourableBlockRegistry.STONE_WHITE.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_yellow = ITEMS.register("stone_yellow", () -> new ItemColour(ColourableBlockRegistry.STONE_YELLOW.get(), new Item.Properties(), new ItemFlib.Settings()));
  //  
  public static final DeferredItem<Item> stone_bricks_none = ITEMS.register("stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_black = ITEMS.register("stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_blue = ITEMS.register("stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_brown = ITEMS.register("stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_cyan = ITEMS.register("stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_gray = ITEMS.register("stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_green = ITEMS.register("stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_light_blue = ITEMS.register("stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_light_gray = ITEMS.register("stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_lime = ITEMS.register("stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_magenta = ITEMS.register("stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_orange = ITEMS.register("stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_pink = ITEMS.register("stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_purple = ITEMS.register("stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_red = ITEMS.register("stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_white = ITEMS.register("stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stone_bricks_yellow = ITEMS.register("stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> chiseled_stone_bricks_none = ITEMS.register("chiseled_stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_black = ITEMS.register("chiseled_stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_blue = ITEMS.register("chiseled_stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_brown = ITEMS.register("chiseled_stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_cyan = ITEMS.register("chiseled_stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_gray = ITEMS.register("chiseled_stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_green = ITEMS.register("chiseled_stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_light_blue = ITEMS.register("chiseled_stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_light_gray = ITEMS.register("chiseled_stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_lime = ITEMS.register("chiseled_stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_magenta = ITEMS.register("chiseled_stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_orange = ITEMS.register("chiseled_stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_pink = ITEMS.register("chiseled_stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_purple = ITEMS.register("chiseled_stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_red = ITEMS.register("chiseled_stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_white = ITEMS.register("chiseled_stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_stone_bricks_yellow = ITEMS.register("chiseled_stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.chiseled_stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> dirt_none = ITEMS.register("dirt_none", () -> new ItemColour(ColourableBlockRegistry.dirt_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_black = ITEMS.register("dirt_black", () -> new ItemColour(ColourableBlockRegistry.dirt_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_blue = ITEMS.register("dirt_blue", () -> new ItemColour(ColourableBlockRegistry.dirt_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_brown = ITEMS.register("dirt_brown", () -> new ItemColour(ColourableBlockRegistry.dirt_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_cyan = ITEMS.register("dirt_cyan", () -> new ItemColour(ColourableBlockRegistry.dirt_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_gray = ITEMS.register("dirt_gray", () -> new ItemColour(ColourableBlockRegistry.dirt_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_green = ITEMS.register("dirt_green", () -> new ItemColour(ColourableBlockRegistry.dirt_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_light_blue = ITEMS.register("dirt_light_blue", () -> new ItemColour(ColourableBlockRegistry.dirt_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_light_gray = ITEMS.register("dirt_light_gray", () -> new ItemColour(ColourableBlockRegistry.dirt_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_lime = ITEMS.register("dirt_lime", () -> new ItemColour(ColourableBlockRegistry.dirt_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_magenta = ITEMS.register("dirt_magenta", () -> new ItemColour(ColourableBlockRegistry.dirt_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_orange = ITEMS.register("dirt_orange", () -> new ItemColour(ColourableBlockRegistry.dirt_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_pink = ITEMS.register("dirt_pink", () -> new ItemColour(ColourableBlockRegistry.dirt_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_purple = ITEMS.register("dirt_purple", () -> new ItemColour(ColourableBlockRegistry.dirt_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_red = ITEMS.register("dirt_red", () -> new ItemColour(ColourableBlockRegistry.dirt_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_white = ITEMS.register("dirt_white", () -> new ItemColour(ColourableBlockRegistry.dirt_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> dirt_yellow = ITEMS.register("dirt_yellow", () -> new ItemColour(ColourableBlockRegistry.dirt_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> path_none = ITEMS.register("path_none", () -> new ItemColour(ColourableBlockRegistry.path_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_black = ITEMS.register("path_black", () -> new ItemColour(ColourableBlockRegistry.path_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_blue = ITEMS.register("path_blue", () -> new ItemColour(ColourableBlockRegistry.path_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_brown = ITEMS.register("path_brown", () -> new ItemColour(ColourableBlockRegistry.path_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_cyan = ITEMS.register("path_cyan", () -> new ItemColour(ColourableBlockRegistry.path_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_gray = ITEMS.register("path_gray", () -> new ItemColour(ColourableBlockRegistry.path_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_green = ITEMS.register("path_green", () -> new ItemColour(ColourableBlockRegistry.path_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_light_blue = ITEMS.register("path_light_blue", () -> new ItemColour(ColourableBlockRegistry.path_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_light_gray = ITEMS.register("path_light_gray", () -> new ItemColour(ColourableBlockRegistry.path_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_lime = ITEMS.register("path_lime", () -> new ItemColour(ColourableBlockRegistry.path_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_magenta = ITEMS.register("path_magenta", () -> new ItemColour(ColourableBlockRegistry.path_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_orange = ITEMS.register("path_orange", () -> new ItemColour(ColourableBlockRegistry.path_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_pink = ITEMS.register("path_pink", () -> new ItemColour(ColourableBlockRegistry.path_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_purple = ITEMS.register("path_purple", () -> new ItemColour(ColourableBlockRegistry.path_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_red = ITEMS.register("path_red", () -> new ItemColour(ColourableBlockRegistry.path_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_white = ITEMS.register("path_white", () -> new ItemColour(ColourableBlockRegistry.path_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> path_yellow = ITEMS.register("path_yellow", () -> new ItemColour(ColourableBlockRegistry.path_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  // 
  public static final DeferredItem<Item> farmland_none = ITEMS.register("farmland_none", () -> new ItemColour(ColourableBlockRegistry.farmland_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_black = ITEMS.register("farmland_black", () -> new ItemColour(ColourableBlockRegistry.farmland_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_blue = ITEMS.register("farmland_blue", () -> new ItemColour(ColourableBlockRegistry.farmland_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_brown = ITEMS.register("farmland_brown", () -> new ItemColour(ColourableBlockRegistry.farmland_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_cyan = ITEMS.register("farmland_cyan", () -> new ItemColour(ColourableBlockRegistry.farmland_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_gray = ITEMS.register("farmland_gray", () -> new ItemColour(ColourableBlockRegistry.farmland_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_green = ITEMS.register("farmland_green", () -> new ItemColour(ColourableBlockRegistry.farmland_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_light_blue = ITEMS.register("farmland_light_blue", () -> new ItemColour(ColourableBlockRegistry.farmland_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_light_gray = ITEMS.register("farmland_light_gray", () -> new ItemColour(ColourableBlockRegistry.farmland_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_lime = ITEMS.register("farmland_lime", () -> new ItemColour(ColourableBlockRegistry.farmland_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_magenta = ITEMS.register("farmland_magenta", () -> new ItemColour(ColourableBlockRegistry.farmland_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_orange = ITEMS.register("farmland_orange", () -> new ItemColour(ColourableBlockRegistry.farmland_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_pink = ITEMS.register("farmland_pink", () -> new ItemColour(ColourableBlockRegistry.farmland_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_purple = ITEMS.register("farmland_purple", () -> new ItemColour(ColourableBlockRegistry.farmland_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_red = ITEMS.register("farmland_red", () -> new ItemColour(ColourableBlockRegistry.farmland_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_white = ITEMS.register("farmland_white", () -> new ItemColour(ColourableBlockRegistry.farmland_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> farmland_yellow = ITEMS.register("farmland_yellow", () -> new ItemColour(ColourableBlockRegistry.farmland_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> sandstone_none = ITEMS.register("sandstone_none", () -> new ItemColour(ColourableBlockRegistry.sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_black = ITEMS.register("sandstone_black", () -> new ItemColour(ColourableBlockRegistry.sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_blue = ITEMS.register("sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_brown = ITEMS.register("sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_cyan = ITEMS.register("sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_gray = ITEMS.register("sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_green = ITEMS.register("sandstone_green", () -> new ItemColour(ColourableBlockRegistry.sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_light_blue = ITEMS.register("sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_light_gray = ITEMS.register("sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_lime = ITEMS.register("sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_magenta = ITEMS.register("sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_orange = ITEMS.register("sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_pink = ITEMS.register("sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_purple = ITEMS.register("sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_red = ITEMS.register("sandstone_red", () -> new ItemColour(ColourableBlockRegistry.sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_white = ITEMS.register("sandstone_white", () -> new ItemColour(ColourableBlockRegistry.sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> sandstone_yellow = ITEMS.register("sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> cut_sandstone_none = ITEMS.register("cut_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_black = ITEMS.register("cut_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_blue = ITEMS.register("cut_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_brown = ITEMS.register("cut_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_cyan = ITEMS.register("cut_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_gray = ITEMS.register("cut_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_green = ITEMS.register("cut_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_light_blue = ITEMS.register("cut_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_light_gray = ITEMS.register("cut_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_lime = ITEMS.register("cut_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_magenta = ITEMS.register("cut_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_orange = ITEMS.register("cut_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_pink = ITEMS.register("cut_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_purple = ITEMS.register("cut_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_red = ITEMS.register("cut_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_white = ITEMS.register("cut_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> cut_sandstone_yellow = ITEMS.register("cut_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.cut_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> smooth_sandstone_none = ITEMS.register("smooth_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_black = ITEMS.register("smooth_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_blue = ITEMS.register("smooth_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_brown = ITEMS.register("smooth_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_cyan = ITEMS.register("smooth_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_gray = ITEMS.register("smooth_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_green = ITEMS.register("smooth_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_light_blue = ITEMS.register("smooth_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_light_gray = ITEMS.register("smooth_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_lime = ITEMS.register("smooth_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_magenta = ITEMS.register("smooth_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_orange = ITEMS.register("smooth_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_pink = ITEMS.register("smooth_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_purple = ITEMS.register("smooth_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_red = ITEMS.register("smooth_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_white = ITEMS.register("smooth_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> smooth_sandstone_yellow = ITEMS.register("smooth_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.smooth_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> chiseled_sandstone_none = ITEMS.register("chiseled_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_black = ITEMS.register("chiseled_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_blue = ITEMS.register("chiseled_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_brown = ITEMS.register("chiseled_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_cyan = ITEMS.register("chiseled_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_gray = ITEMS.register("chiseled_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_green = ITEMS.register("chiseled_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_light_blue = ITEMS.register("chiseled_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_light_gray = ITEMS.register("chiseled_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_lime = ITEMS.register("chiseled_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_magenta = ITEMS.register("chiseled_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_orange = ITEMS.register("chiseled_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_pink = ITEMS.register("chiseled_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_purple = ITEMS.register("chiseled_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_red = ITEMS.register("chiseled_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_white = ITEMS.register("chiseled_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> chiseled_sandstone_yellow = ITEMS.register("chiseled_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.chiseled_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> brick_none = ITEMS.register("brick_none", () -> new ItemColour(ColourableBlockRegistry.brick_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_black = ITEMS.register("brick_black", () -> new ItemColour(ColourableBlockRegistry.brick_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_blue = ITEMS.register("brick_blue", () -> new ItemColour(ColourableBlockRegistry.brick_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_brown = ITEMS.register("brick_brown", () -> new ItemColour(ColourableBlockRegistry.brick_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_cyan = ITEMS.register("brick_cyan", () -> new ItemColour(ColourableBlockRegistry.brick_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_gray = ITEMS.register("brick_gray", () -> new ItemColour(ColourableBlockRegistry.brick_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_green = ITEMS.register("brick_green", () -> new ItemColour(ColourableBlockRegistry.brick_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_light_blue = ITEMS.register("brick_light_blue", () -> new ItemColour(ColourableBlockRegistry.brick_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_light_gray = ITEMS.register("brick_light_gray", () -> new ItemColour(ColourableBlockRegistry.brick_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_lime = ITEMS.register("brick_lime", () -> new ItemColour(ColourableBlockRegistry.brick_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_magenta = ITEMS.register("brick_magenta", () -> new ItemColour(ColourableBlockRegistry.brick_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_orange = ITEMS.register("brick_orange", () -> new ItemColour(ColourableBlockRegistry.brick_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_pink = ITEMS.register("brick_pink", () -> new ItemColour(ColourableBlockRegistry.brick_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_purple = ITEMS.register("brick_purple", () -> new ItemColour(ColourableBlockRegistry.brick_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_red = ITEMS.register("brick_red", () -> new ItemColour(ColourableBlockRegistry.brick_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_white = ITEMS.register("brick_white", () -> new ItemColour(ColourableBlockRegistry.brick_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> brick_yellow = ITEMS.register("brick_yellow", () -> new ItemColour(ColourableBlockRegistry.brick_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> slab_planks_none = ITEMS.register("slab_planks_none", () -> new ItemColour(ColourableBlockRegistry.slab_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_black = ITEMS.register("slab_planks_black", () -> new ItemColour(ColourableBlockRegistry.slab_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_blue = ITEMS.register("slab_planks_blue", () -> new ItemColour(ColourableBlockRegistry.slab_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_brown = ITEMS.register("slab_planks_brown", () -> new ItemColour(ColourableBlockRegistry.slab_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_cyan = ITEMS.register("slab_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_gray = ITEMS.register("slab_planks_gray", () -> new ItemColour(ColourableBlockRegistry.slab_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_green = ITEMS.register("slab_planks_green", () -> new ItemColour(ColourableBlockRegistry.slab_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_light_blue = ITEMS.register("slab_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_light_gray = ITEMS.register("slab_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_lime = ITEMS.register("slab_planks_lime", () -> new ItemColour(ColourableBlockRegistry.slab_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_magenta = ITEMS.register("slab_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_orange = ITEMS.register("slab_planks_orange", () -> new ItemColour(ColourableBlockRegistry.slab_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_pink = ITEMS.register("slab_planks_pink", () -> new ItemColour(ColourableBlockRegistry.slab_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_purple = ITEMS.register("slab_planks_purple", () -> new ItemColour(ColourableBlockRegistry.slab_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_red = ITEMS.register("slab_planks_red", () -> new ItemColour(ColourableBlockRegistry.slab_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_white = ITEMS.register("slab_planks_white", () -> new ItemColour(ColourableBlockRegistry.slab_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  public static final DeferredItem<Item> slab_planks_yellow = ITEMS.register("slab_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOODSLAB)));
  //
  public static final DeferredItem<Item> slab_cobblestone_none = ITEMS.register("slab_cobblestone_none", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_black = ITEMS.register("slab_cobblestone_black", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_blue = ITEMS.register("slab_cobblestone_blue", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_brown = ITEMS.register("slab_cobblestone_brown", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_cyan = ITEMS.register("slab_cobblestone_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_gray = ITEMS.register("slab_cobblestone_gray", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_green = ITEMS.register("slab_cobblestone_green", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_light_blue = ITEMS.register("slab_cobblestone_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_light_gray = ITEMS.register("slab_cobblestone_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_lime = ITEMS.register("slab_cobblestone_lime", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_magenta = ITEMS.register("slab_cobblestone_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_orange = ITEMS.register("slab_cobblestone_orange", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_pink = ITEMS.register("slab_cobblestone_pink", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_purple = ITEMS.register("slab_cobblestone_purple", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_red = ITEMS.register("slab_cobblestone_red", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_white = ITEMS.register("slab_cobblestone_white", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_cobblestone_yellow = ITEMS.register("slab_cobblestone_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_cobblestone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> slab_stone_none = ITEMS.register("slab_stone_none", () -> new ItemColour(ColourableBlockRegistry.slab_stone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_black = ITEMS.register("slab_stone_black", () -> new ItemColour(ColourableBlockRegistry.slab_stone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_blue = ITEMS.register("slab_stone_blue", () -> new ItemColour(ColourableBlockRegistry.slab_stone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_brown = ITEMS.register("slab_stone_brown", () -> new ItemColour(ColourableBlockRegistry.slab_stone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_cyan = ITEMS.register("slab_stone_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_stone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_gray = ITEMS.register("slab_stone_gray", () -> new ItemColour(ColourableBlockRegistry.slab_stone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_green = ITEMS.register("slab_stone_green", () -> new ItemColour(ColourableBlockRegistry.slab_stone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_light_blue = ITEMS.register("slab_stone_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_stone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_light_gray = ITEMS.register("slab_stone_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_stone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_lime = ITEMS.register("slab_stone_lime", () -> new ItemColour(ColourableBlockRegistry.slab_stone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_magenta = ITEMS.register("slab_stone_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_stone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_orange = ITEMS.register("slab_stone_orange", () -> new ItemColour(ColourableBlockRegistry.slab_stone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_pink = ITEMS.register("slab_stone_pink", () -> new ItemColour(ColourableBlockRegistry.slab_stone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_purple = ITEMS.register("slab_stone_purple", () -> new ItemColour(ColourableBlockRegistry.slab_stone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_red = ITEMS.register("slab_stone_red", () -> new ItemColour(ColourableBlockRegistry.slab_stone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_white = ITEMS.register("slab_stone_white", () -> new ItemColour(ColourableBlockRegistry.slab_stone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_yellow = ITEMS.register("slab_stone_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_stone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> slab_stone_bricks_none = ITEMS.register("slab_stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_black = ITEMS.register("slab_stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_blue = ITEMS.register("slab_stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_brown = ITEMS.register("slab_stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_cyan = ITEMS.register("slab_stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_gray = ITEMS.register("slab_stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_green = ITEMS.register("slab_stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_light_blue = ITEMS.register("slab_stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_light_gray = ITEMS.register("slab_stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_lime = ITEMS.register("slab_stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_magenta = ITEMS.register("slab_stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_orange = ITEMS.register("slab_stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_pink = ITEMS.register("slab_stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_purple = ITEMS.register("slab_stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_red = ITEMS.register("slab_stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_white = ITEMS.register("slab_stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_stone_bricks_yellow = ITEMS.register("slab_stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> slab_sandstone_none = ITEMS.register("slab_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_black = ITEMS.register("slab_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_blue = ITEMS.register("slab_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_brown = ITEMS.register("slab_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_cyan = ITEMS.register("slab_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_gray = ITEMS.register("slab_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_green = ITEMS.register("slab_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_light_blue = ITEMS.register("slab_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_light_gray = ITEMS.register("slab_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_lime = ITEMS.register("slab_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_magenta = ITEMS.register("slab_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_orange = ITEMS.register("slab_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_pink = ITEMS.register("slab_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_purple = ITEMS.register("slab_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_red = ITEMS.register("slab_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_white = ITEMS.register("slab_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_sandstone_yellow = ITEMS.register("slab_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> slab_brick_none = ITEMS.register("slab_brick_none", () -> new ItemColour(ColourableBlockRegistry.slab_brick_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_black = ITEMS.register("slab_brick_black", () -> new ItemColour(ColourableBlockRegistry.slab_brick_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_blue = ITEMS.register("slab_brick_blue", () -> new ItemColour(ColourableBlockRegistry.slab_brick_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_brown = ITEMS.register("slab_brick_brown", () -> new ItemColour(ColourableBlockRegistry.slab_brick_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_cyan = ITEMS.register("slab_brick_cyan", () -> new ItemColour(ColourableBlockRegistry.slab_brick_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_gray = ITEMS.register("slab_brick_gray", () -> new ItemColour(ColourableBlockRegistry.slab_brick_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_green = ITEMS.register("slab_brick_green", () -> new ItemColour(ColourableBlockRegistry.slab_brick_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_light_blue = ITEMS.register("slab_brick_light_blue", () -> new ItemColour(ColourableBlockRegistry.slab_brick_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_light_gray = ITEMS.register("slab_brick_light_gray", () -> new ItemColour(ColourableBlockRegistry.slab_brick_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_lime = ITEMS.register("slab_brick_lime", () -> new ItemColour(ColourableBlockRegistry.slab_brick_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_magenta = ITEMS.register("slab_brick_magenta", () -> new ItemColour(ColourableBlockRegistry.slab_brick_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_orange = ITEMS.register("slab_brick_orange", () -> new ItemColour(ColourableBlockRegistry.slab_brick_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_pink = ITEMS.register("slab_brick_pink", () -> new ItemColour(ColourableBlockRegistry.slab_brick_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_purple = ITEMS.register("slab_brick_purple", () -> new ItemColour(ColourableBlockRegistry.slab_brick_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_red = ITEMS.register("slab_brick_red", () -> new ItemColour(ColourableBlockRegistry.slab_brick_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_white = ITEMS.register("slab_brick_white", () -> new ItemColour(ColourableBlockRegistry.slab_brick_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> slab_brick_yellow = ITEMS.register("slab_brick_yellow", () -> new ItemColour(ColourableBlockRegistry.slab_brick_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> stairs_brick_none = ITEMS.register("stairs_brick_none", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_black = ITEMS.register("stairs_brick_black", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_blue = ITEMS.register("stairs_brick_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_brown = ITEMS.register("stairs_brick_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_cyan = ITEMS.register("stairs_brick_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_gray = ITEMS.register("stairs_brick_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_green = ITEMS.register("stairs_brick_green", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_light_blue = ITEMS.register("stairs_brick_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_light_gray = ITEMS.register("stairs_brick_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_lime = ITEMS.register("stairs_brick_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_magenta = ITEMS.register("stairs_brick_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_orange = ITEMS.register("stairs_brick_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_pink = ITEMS.register("stairs_brick_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_purple = ITEMS.register("stairs_brick_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_red = ITEMS.register("stairs_brick_red", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_white = ITEMS.register("stairs_brick_white", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_brick_yellow = ITEMS.register("stairs_brick_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_brick_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_planks_none = ITEMS.register("stairs_planks_none", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_black = ITEMS.register("stairs_planks_black", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_blue = ITEMS.register("stairs_planks_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_brown = ITEMS.register("stairs_planks_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_cyan = ITEMS.register("stairs_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_gray = ITEMS.register("stairs_planks_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_green = ITEMS.register("stairs_planks_green", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_light_blue = ITEMS.register("stairs_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_light_gray = ITEMS.register("stairs_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_lime = ITEMS.register("stairs_planks_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_magenta = ITEMS.register("stairs_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_orange = ITEMS.register("stairs_planks_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_pink = ITEMS.register("stairs_planks_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_purple = ITEMS.register("stairs_planks_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_red = ITEMS.register("stairs_planks_red", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_white = ITEMS.register("stairs_planks_white", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> stairs_planks_yellow = ITEMS.register("stairs_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> stairs_stone_none = ITEMS.register("stairs_stone_none", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_black = ITEMS.register("stairs_stone_black", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_blue = ITEMS.register("stairs_stone_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_brown = ITEMS.register("stairs_stone_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_cyan = ITEMS.register("stairs_stone_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_gray = ITEMS.register("stairs_stone_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_green = ITEMS.register("stairs_stone_green", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_light_blue = ITEMS.register("stairs_stone_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_light_gray = ITEMS.register("stairs_stone_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_lime = ITEMS.register("stairs_stone_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_magenta = ITEMS.register("stairs_stone_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_orange = ITEMS.register("stairs_stone_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_pink = ITEMS.register("stairs_stone_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_purple = ITEMS.register("stairs_stone_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_red = ITEMS.register("stairs_stone_red", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_white = ITEMS.register("stairs_stone_white", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_yellow = ITEMS.register("stairs_stone_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> stairs_cobblestone_none = ITEMS.register("stairs_cobblestone_none", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_black = ITEMS.register("stairs_cobblestone_black", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_blue = ITEMS.register("stairs_cobblestone_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_brown = ITEMS.register("stairs_cobblestone_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_cyan = ITEMS.register("stairs_cobblestone_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_gray = ITEMS.register("stairs_cobblestone_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_green = ITEMS.register("stairs_cobblestone_green", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_light_blue = ITEMS.register("stairs_cobblestone_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_light_gray = ITEMS.register("stairs_cobblestone_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_lime = ITEMS.register("stairs_cobblestone_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_magenta = ITEMS.register("stairs_cobblestone_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_orange = ITEMS.register("stairs_cobblestone_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_pink = ITEMS.register("stairs_cobblestone_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_purple = ITEMS.register("stairs_cobblestone_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_red = ITEMS.register("stairs_cobblestone_red", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_white = ITEMS.register("stairs_cobblestone_white", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_cobblestone_yellow = ITEMS.register("stairs_cobblestone_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_cobblestone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> stairs_sandstone_none = ITEMS.register("stairs_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_black = ITEMS.register("stairs_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_blue = ITEMS.register("stairs_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_brown = ITEMS.register("stairs_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_cyan = ITEMS.register("stairs_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_gray = ITEMS.register("stairs_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_green = ITEMS.register("stairs_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_light_blue = ITEMS.register("stairs_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_light_gray = ITEMS.register("stairs_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_lime = ITEMS.register("stairs_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_magenta = ITEMS.register("stairs_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_orange = ITEMS.register("stairs_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_pink = ITEMS.register("stairs_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_purple = ITEMS.register("stairs_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_red = ITEMS.register("stairs_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_white = ITEMS.register("stairs_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_sandstone_yellow = ITEMS.register("stairs_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> stairs_stone_bricks_none = ITEMS.register("stairs_stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_black = ITEMS.register("stairs_stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_blue = ITEMS.register("stairs_stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_brown = ITEMS.register("stairs_stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_cyan = ITEMS.register("stairs_stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_gray = ITEMS.register("stairs_stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_green = ITEMS.register("stairs_stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_light_blue = ITEMS.register("stairs_stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_light_gray = ITEMS.register("stairs_stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_lime = ITEMS.register("stairs_stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_magenta = ITEMS.register("stairs_stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_orange = ITEMS.register("stairs_stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_pink = ITEMS.register("stairs_stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_purple = ITEMS.register("stairs_stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_red = ITEMS.register("stairs_stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_white = ITEMS.register("stairs_stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> stairs_stone_bricks_yellow = ITEMS.register("stairs_stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.stairs_stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> wall_stone_none = ITEMS.register("wall_stone_none", () -> new ItemColour(ColourableBlockRegistry.wall_stone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_black = ITEMS.register("wall_stone_black", () -> new ItemColour(ColourableBlockRegistry.wall_stone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_blue = ITEMS.register("wall_stone_blue", () -> new ItemColour(ColourableBlockRegistry.wall_stone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_brown = ITEMS.register("wall_stone_brown", () -> new ItemColour(ColourableBlockRegistry.wall_stone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_cyan = ITEMS.register("wall_stone_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_stone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_gray = ITEMS.register("wall_stone_gray", () -> new ItemColour(ColourableBlockRegistry.wall_stone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_green = ITEMS.register("wall_stone_green", () -> new ItemColour(ColourableBlockRegistry.wall_stone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_light_blue = ITEMS.register("wall_stone_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_stone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_light_gray = ITEMS.register("wall_stone_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_stone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_lime = ITEMS.register("wall_stone_lime", () -> new ItemColour(ColourableBlockRegistry.wall_stone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_magenta = ITEMS.register("wall_stone_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_stone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_orange = ITEMS.register("wall_stone_orange", () -> new ItemColour(ColourableBlockRegistry.wall_stone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_pink = ITEMS.register("wall_stone_pink", () -> new ItemColour(ColourableBlockRegistry.wall_stone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_purple = ITEMS.register("wall_stone_purple", () -> new ItemColour(ColourableBlockRegistry.wall_stone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_red = ITEMS.register("wall_stone_red", () -> new ItemColour(ColourableBlockRegistry.wall_stone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_white = ITEMS.register("wall_stone_white", () -> new ItemColour(ColourableBlockRegistry.wall_stone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_yellow = ITEMS.register("wall_stone_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_stone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> wall_sandstone_none = ITEMS.register("wall_sandstone_none", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_black = ITEMS.register("wall_sandstone_black", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_blue = ITEMS.register("wall_sandstone_blue", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_brown = ITEMS.register("wall_sandstone_brown", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_cyan = ITEMS.register("wall_sandstone_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_gray = ITEMS.register("wall_sandstone_gray", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_green = ITEMS.register("wall_sandstone_green", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_light_blue = ITEMS.register("wall_sandstone_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_light_gray = ITEMS.register("wall_sandstone_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_lime = ITEMS.register("wall_sandstone_lime", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_magenta = ITEMS.register("wall_sandstone_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_orange = ITEMS.register("wall_sandstone_orange", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_pink = ITEMS.register("wall_sandstone_pink", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_purple = ITEMS.register("wall_sandstone_purple", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_red = ITEMS.register("wall_sandstone_red", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_white = ITEMS.register("wall_sandstone_white", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_sandstone_yellow = ITEMS.register("wall_sandstone_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_sandstone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> wall_planks_none = ITEMS.register("wall_planks_none", () -> new ItemColour(ColourableBlockRegistry.wall_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_black = ITEMS.register("wall_planks_black", () -> new ItemColour(ColourableBlockRegistry.wall_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_blue = ITEMS.register("wall_planks_blue", () -> new ItemColour(ColourableBlockRegistry.wall_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_brown = ITEMS.register("wall_planks_brown", () -> new ItemColour(ColourableBlockRegistry.wall_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_cyan = ITEMS.register("wall_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_gray = ITEMS.register("wall_planks_gray", () -> new ItemColour(ColourableBlockRegistry.wall_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_green = ITEMS.register("wall_planks_green", () -> new ItemColour(ColourableBlockRegistry.wall_planks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_planks_light_blue = ITEMS.register("wall_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_light_gray = ITEMS.register("wall_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_lime = ITEMS.register("wall_planks_lime", () -> new ItemColour(ColourableBlockRegistry.wall_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_magenta = ITEMS.register("wall_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_orange = ITEMS.register("wall_planks_orange", () -> new ItemColour(ColourableBlockRegistry.wall_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_pink = ITEMS.register("wall_planks_pink", () -> new ItemColour(ColourableBlockRegistry.wall_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_purple = ITEMS.register("wall_planks_purple", () -> new ItemColour(ColourableBlockRegistry.wall_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_red = ITEMS.register("wall_planks_red", () -> new ItemColour(ColourableBlockRegistry.wall_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_white = ITEMS.register("wall_planks_white", () -> new ItemColour(ColourableBlockRegistry.wall_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> wall_planks_yellow = ITEMS.register("wall_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> wall_cobblestone_none = ITEMS.register("wall_cobblestone_none", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_black = ITEMS.register("wall_cobblestone_black", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_blue = ITEMS.register("wall_cobblestone_blue", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_brown = ITEMS.register("wall_cobblestone_brown", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_cyan = ITEMS.register("wall_cobblestone_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_gray = ITEMS.register("wall_cobblestone_gray", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_green = ITEMS.register("wall_cobblestone_green", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_light_blue = ITEMS.register("wall_cobblestone_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_light_gray = ITEMS.register("wall_cobblestone_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_lime = ITEMS.register("wall_cobblestone_lime", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_magenta = ITEMS.register("wall_cobblestone_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_orange = ITEMS.register("wall_cobblestone_orange", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_pink = ITEMS.register("wall_cobblestone_pink", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_purple = ITEMS.register("wall_cobblestone_purple", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_red = ITEMS.register("wall_cobblestone_red", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_white = ITEMS.register("wall_cobblestone_white", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_cobblestone_yellow = ITEMS.register("wall_cobblestone_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_cobblestone_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> wall_stone_bricks_none = ITEMS.register("wall_stone_bricks_none", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_black = ITEMS.register("wall_stone_bricks_black", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_blue = ITEMS.register("wall_stone_bricks_blue", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_brown = ITEMS.register("wall_stone_bricks_brown", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_cyan = ITEMS.register("wall_stone_bricks_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_gray = ITEMS.register("wall_stone_bricks_gray", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_green = ITEMS.register("wall_stone_bricks_green", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_light_blue = ITEMS.register("wall_stone_bricks_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_light_gray = ITEMS.register("wall_stone_bricks_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_lime = ITEMS.register("wall_stone_bricks_lime", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_magenta = ITEMS.register("wall_stone_bricks_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_orange = ITEMS.register("wall_stone_bricks_orange", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_pink = ITEMS.register("wall_stone_bricks_pink", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_purple = ITEMS.register("wall_stone_bricks_purple", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_red = ITEMS.register("wall_stone_bricks_red", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_white = ITEMS.register("wall_stone_bricks_white", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_stone_bricks_yellow = ITEMS.register("wall_stone_bricks_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_stone_bricks_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  //
  public static final DeferredItem<Item> wall_brick_none = ITEMS.register("wall_brick_none", () -> new ItemColour(ColourableBlockRegistry.wall_brick_none.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_black = ITEMS.register("wall_brick_black", () -> new ItemColour(ColourableBlockRegistry.wall_brick_black.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_blue = ITEMS.register("wall_brick_blue", () -> new ItemColour(ColourableBlockRegistry.wall_brick_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_brown = ITEMS.register("wall_brick_brown", () -> new ItemColour(ColourableBlockRegistry.wall_brick_brown.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_cyan = ITEMS.register("wall_brick_cyan", () -> new ItemColour(ColourableBlockRegistry.wall_brick_cyan.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_gray = ITEMS.register("wall_brick_gray", () -> new ItemColour(ColourableBlockRegistry.wall_brick_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_green = ITEMS.register("wall_brick_green", () -> new ItemColour(ColourableBlockRegistry.wall_brick_green.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_light_blue = ITEMS.register("wall_brick_light_blue", () -> new ItemColour(ColourableBlockRegistry.wall_brick_light_blue.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_light_gray = ITEMS.register("wall_brick_light_gray", () -> new ItemColour(ColourableBlockRegistry.wall_brick_light_gray.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_lime = ITEMS.register("wall_brick_lime", () -> new ItemColour(ColourableBlockRegistry.wall_brick_lime.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_magenta = ITEMS.register("wall_brick_magenta", () -> new ItemColour(ColourableBlockRegistry.wall_brick_magenta.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_orange = ITEMS.register("wall_brick_orange", () -> new ItemColour(ColourableBlockRegistry.wall_brick_orange.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_pink = ITEMS.register("wall_brick_pink", () -> new ItemColour(ColourableBlockRegistry.wall_brick_pink.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_purple = ITEMS.register("wall_brick_purple", () -> new ItemColour(ColourableBlockRegistry.wall_brick_purple.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_red = ITEMS.register("wall_brick_red", () -> new ItemColour(ColourableBlockRegistry.wall_brick_red.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_white = ITEMS.register("wall_brick_white", () -> new ItemColour(ColourableBlockRegistry.wall_brick_white.get(), new Item.Properties(), new ItemFlib.Settings()));
  public static final DeferredItem<Item> wall_brick_yellow = ITEMS.register("wall_brick_yellow", () -> new ItemColour(ColourableBlockRegistry.wall_brick_yellow.get(), new Item.Properties(), new ItemFlib.Settings()));
  // 
  public static final DeferredItem<Item> fence_planks_none = ITEMS.register("fence_planks_none", () -> new ItemColour(ColourableBlockRegistry.fence_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_black = ITEMS.register("fence_planks_black", () -> new ItemColour(ColourableBlockRegistry.fence_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_blue = ITEMS.register("fence_planks_blue", () -> new ItemColour(ColourableBlockRegistry.fence_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_brown = ITEMS.register("fence_planks_brown", () -> new ItemColour(ColourableBlockRegistry.fence_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_cyan = ITEMS.register("fence_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.fence_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_gray = ITEMS.register("fence_planks_gray", () -> new ItemColour(ColourableBlockRegistry.fence_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_green = ITEMS.register("fence_planks_green", () -> new ItemColour(ColourableBlockRegistry.fence_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_light_blue = ITEMS.register("fence_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.fence_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_light_gray = ITEMS.register("fence_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.fence_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_lime = ITEMS.register("fence_planks_lime", () -> new ItemColour(ColourableBlockRegistry.fence_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_magenta = ITEMS.register("fence_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.fence_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_orange = ITEMS.register("fence_planks_orange", () -> new ItemColour(ColourableBlockRegistry.fence_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_pink = ITEMS.register("fence_planks_pink", () -> new ItemColour(ColourableBlockRegistry.fence_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_purple = ITEMS.register("fence_planks_purple", () -> new ItemColour(ColourableBlockRegistry.fence_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_red = ITEMS.register("fence_planks_red", () -> new ItemColour(ColourableBlockRegistry.fence_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_white = ITEMS.register("fence_planks_white", () -> new ItemColour(ColourableBlockRegistry.fence_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> fence_planks_yellow = ITEMS.register("fence_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.fence_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> gate_planks_none = ITEMS.register("gate_planks_none", () -> new ItemColour(ColourableBlockRegistry.gate_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_black = ITEMS.register("gate_planks_black", () -> new ItemColour(ColourableBlockRegistry.gate_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_blue = ITEMS.register("gate_planks_blue", () -> new ItemColour(ColourableBlockRegistry.gate_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_brown = ITEMS.register("gate_planks_brown", () -> new ItemColour(ColourableBlockRegistry.gate_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_cyan = ITEMS.register("gate_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.gate_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_gray = ITEMS.register("gate_planks_gray", () -> new ItemColour(ColourableBlockRegistry.gate_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_green = ITEMS.register("gate_planks_green", () -> new ItemColour(ColourableBlockRegistry.gate_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_light_blue = ITEMS.register("gate_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.gate_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_light_gray = ITEMS.register("gate_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.gate_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_lime = ITEMS.register("gate_planks_lime", () -> new ItemColour(ColourableBlockRegistry.gate_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_magenta = ITEMS.register("gate_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.gate_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_orange = ITEMS.register("gate_planks_orange", () -> new ItemColour(ColourableBlockRegistry.gate_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_pink = ITEMS.register("gate_planks_pink", () -> new ItemColour(ColourableBlockRegistry.gate_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_purple = ITEMS.register("gate_planks_purple", () -> new ItemColour(ColourableBlockRegistry.gate_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_red = ITEMS.register("gate_planks_red", () -> new ItemColour(ColourableBlockRegistry.gate_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_white = ITEMS.register("gate_planks_white", () -> new ItemColour(ColourableBlockRegistry.gate_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> gate_planks_yellow = ITEMS.register("gate_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.gate_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> button_planks_none = ITEMS.register("button_planks_none", () -> new ItemColour(ColourableBlockRegistry.button_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_black = ITEMS.register("button_planks_black", () -> new ItemColour(ColourableBlockRegistry.button_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_blue = ITEMS.register("button_planks_blue", () -> new ItemColour(ColourableBlockRegistry.button_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_brown = ITEMS.register("button_planks_brown", () -> new ItemColour(ColourableBlockRegistry.button_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_cyan = ITEMS.register("button_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.button_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_gray = ITEMS.register("button_planks_gray", () -> new ItemColour(ColourableBlockRegistry.button_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_green = ITEMS.register("button_planks_green", () -> new ItemColour(ColourableBlockRegistry.button_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_light_blue = ITEMS.register("button_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.button_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_light_gray = ITEMS.register("button_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.button_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_lime = ITEMS.register("button_planks_lime", () -> new ItemColour(ColourableBlockRegistry.button_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_magenta = ITEMS.register("button_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.button_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_orange = ITEMS.register("button_planks_orange", () -> new ItemColour(ColourableBlockRegistry.button_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_pink = ITEMS.register("button_planks_pink", () -> new ItemColour(ColourableBlockRegistry.button_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_purple = ITEMS.register("button_planks_purple", () -> new ItemColour(ColourableBlockRegistry.button_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_red = ITEMS.register("button_planks_red", () -> new ItemColour(ColourableBlockRegistry.button_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_white = ITEMS.register("button_planks_white", () -> new ItemColour(ColourableBlockRegistry.button_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> button_planks_yellow = ITEMS.register("button_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.button_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> pressure_plate_planks_none = ITEMS.register("pressure_plate_planks_none", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_black = ITEMS.register("pressure_plate_planks_black", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_blue = ITEMS.register("pressure_plate_planks_blue", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_brown = ITEMS.register("pressure_plate_planks_brown", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_cyan = ITEMS.register("pressure_plate_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_gray = ITEMS.register("pressure_plate_planks_gray", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_green = ITEMS.register("pressure_plate_planks_green", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_light_blue = ITEMS.register("pressure_plate_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_light_gray = ITEMS.register("pressure_plate_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_lime = ITEMS.register("pressure_plate_planks_lime", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_magenta = ITEMS.register("pressure_plate_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_orange = ITEMS.register("pressure_plate_planks_orange", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_pink = ITEMS.register("pressure_plate_planks_pink", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_purple = ITEMS.register("pressure_plate_planks_purple", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_red = ITEMS.register("pressure_plate_planks_red", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_white = ITEMS.register("pressure_plate_planks_white", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> pressure_plate_planks_yellow = ITEMS.register("pressure_plate_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.pressure_plate_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> trapdoor_planks_none = ITEMS.register("trapdoor_planks_none", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_black = ITEMS.register("trapdoor_planks_black", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_blue = ITEMS.register("trapdoor_planks_blue", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_brown = ITEMS.register("trapdoor_planks_brown", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_cyan = ITEMS.register("trapdoor_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_gray = ITEMS.register("trapdoor_planks_gray", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_green = ITEMS.register("trapdoor_planks_green", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_light_blue = ITEMS.register("trapdoor_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_light_gray = ITEMS.register("trapdoor_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_lime = ITEMS.register("trapdoor_planks_lime", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_magenta = ITEMS.register("trapdoor_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_orange = ITEMS.register("trapdoor_planks_orange", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_pink = ITEMS.register("trapdoor_planks_pink", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_purple = ITEMS.register("trapdoor_planks_purple", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_red = ITEMS.register("trapdoor_planks_red", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_white = ITEMS.register("trapdoor_planks_white", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> trapdoor_planks_yellow = ITEMS.register("trapdoor_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.trapdoor_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  // 
  public static final DeferredItem<Item> door_planks_none = ITEMS.register("door_planks_none", () -> new ItemColour(ColourableBlockRegistry.door_planks_none.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_black = ITEMS.register("door_planks_black", () -> new ItemColour(ColourableBlockRegistry.door_planks_black.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_blue = ITEMS.register("door_planks_blue", () -> new ItemColour(ColourableBlockRegistry.door_planks_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_brown = ITEMS.register("door_planks_brown", () -> new ItemColour(ColourableBlockRegistry.door_planks_brown.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_cyan = ITEMS.register("door_planks_cyan", () -> new ItemColour(ColourableBlockRegistry.door_planks_cyan.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_gray = ITEMS.register("door_planks_gray", () -> new ItemColour(ColourableBlockRegistry.door_planks_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_green = ITEMS.register("door_planks_green", () -> new ItemColour(ColourableBlockRegistry.door_planks_green.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_light_blue = ITEMS.register("door_planks_light_blue", () -> new ItemColour(ColourableBlockRegistry.door_planks_light_blue.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_light_gray = ITEMS.register("door_planks_light_gray", () -> new ItemColour(ColourableBlockRegistry.door_planks_light_gray.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_lime = ITEMS.register("door_planks_lime", () -> new ItemColour(ColourableBlockRegistry.door_planks_lime.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_magenta = ITEMS.register("door_planks_magenta", () -> new ItemColour(ColourableBlockRegistry.door_planks_magenta.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_orange = ITEMS.register("door_planks_orange", () -> new ItemColour(ColourableBlockRegistry.door_planks_orange.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_pink = ITEMS.register("door_planks_pink", () -> new ItemColour(ColourableBlockRegistry.door_planks_pink.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_purple = ITEMS.register("door_planks_purple", () -> new ItemColour(ColourableBlockRegistry.door_planks_purple.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_red = ITEMS.register("door_planks_red", () -> new ItemColour(ColourableBlockRegistry.door_planks_red.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_white = ITEMS.register("door_planks_white", () -> new ItemColour(ColourableBlockRegistry.door_planks_white.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  public static final DeferredItem<Item> door_planks_yellow = ITEMS.register("door_planks_yellow", () -> new ItemColour(ColourableBlockRegistry.door_planks_yellow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
  //
  public static final DeferredItem<Item> BOAT_NONE = ITEMS.register("boat_none", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.NONE));
  public static final DeferredItem<Item> BOAT_BLACK = ITEMS.register("boat_black", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.BLACK));
  public static final DeferredItem<Item> BOAT_BLUE = ITEMS.register("boat_blue", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.BLUE));
  public static final DeferredItem<Item> BOAT_BROWN = ITEMS.register("boat_brown", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.BROWN));
  public static final DeferredItem<Item> BOAT_CYAN = ITEMS.register("boat_cyan", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.CYAN));
  public static final DeferredItem<Item> BOAT_GRAY = ITEMS.register("boat_gray", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.GRAY));
  public static final DeferredItem<Item> BOAT_GREEN = ITEMS.register("boat_green", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.GREEN));
  public static final DeferredItem<Item> BOAT_LIGHT_BLUE = ITEMS.register("boat_light_blue", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.LIGHT_BLUE));
  public static final DeferredItem<Item> BOAT_LIGHT_GRAY = ITEMS.register("boat_light_gray", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.LIGHT_GRAY));
  public static final DeferredItem<Item> BOAT_LIME = ITEMS.register("boat_lime", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.LIME));
  public static final DeferredItem<Item> BOAT_MAGENTA = ITEMS.register("boat_magenta", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.MAGENTA));
  public static final DeferredItem<Item> BOAT_ORANGE = ITEMS.register("boat_orange", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.ORANGE));
  public static final DeferredItem<Item> BOAT_PINK = ITEMS.register("boat_pink", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.PINK));
  public static final DeferredItem<Item> BOAT_PURPLE = ITEMS.register("boat_purple", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.PURPLE));
  public static final DeferredItem<Item> BOAT_RED = ITEMS.register("boat_red", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.RED));
  public static final DeferredItem<Item> BOAT_WHITE = ITEMS.register("boat_white", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.WHITE));
  public static final DeferredItem<Item> BOAT_YELLOW = ITEMS.register("boat_yellow", () -> new ColourBoatItem(new Item.Properties(), DyeColorless.YELLOW));
  //

  public static final DeferredItem<Item> RGB =  ITEMS.register("crafting_table_rainbow", () ->
      new ItemColour(ColourableBlockRegistry.crafting_table_rainbow.get(), new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));

  //          new Item.Properties(), new ItemFlib.Settings().burnTime(BurnTime.WOOD)));
   //
  public static final TagKey<Item> DYES_NONE_ITEMTAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", "dyes/none"));
  public static final TagKey<Item> STATIONERY_ITEMTAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("neoforge", "tools/stationery"));
  private static final ResourceKey<CreativeModeTab> TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(ModColourable.MODID, "tab"));

  @SubscribeEvent
  public static void onCreativeModeTabRegister(RegisterEvent event) {
    event.register(Registries.CREATIVE_MODE_TAB, helper -> {
      helper.register(TAB, CreativeModeTab.builder().icon(() -> new ItemStack(PLANKS_none.get()))
          .title(Component.translatable("itemGroup." + ModColourable.MODID))
          .displayItems((enabledFlags, populator) -> {
            for (DeferredHolder<Item, ? extends Item> entry : ITEMS.getEntries()) {
              populator.accept(entry.get());
            }
          }).build());
    });
  }
}

package com.lothrazar.colouredstuff.registry;

import java.util.Arrays;
import com.lothrazar.colouredstuff.ModColourable;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class PluginJEI implements IModPlugin {

  private static final ResourceLocation ID = new ResourceLocation(ModColourable.MODID, "jei");

  @Override
  public ResourceLocation getPluginUid() {
    return ID;
  }

  @Override
  public void registerRecipes(IRecipeRegistration registration) {
    registration.getIngredientManager().removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK,
        Arrays.asList(
            new ItemStack(ColourableItemRegistry.farmland_none.get()),
            new ItemStack(ColourableItemRegistry.farmland_black.get()),
            new ItemStack(ColourableItemRegistry.farmland_blue.get()),
            new ItemStack(ColourableItemRegistry.farmland_brown.get()),
            new ItemStack(ColourableItemRegistry.farmland_cyan.get()),
            new ItemStack(ColourableItemRegistry.farmland_gray.get()),
            new ItemStack(ColourableItemRegistry.farmland_green.get()),
            new ItemStack(ColourableItemRegistry.farmland_light_blue.get()),
            new ItemStack(ColourableItemRegistry.farmland_light_gray.get()),
            new ItemStack(ColourableItemRegistry.farmland_lime.get()),
            new ItemStack(ColourableItemRegistry.farmland_magenta.get()),
            new ItemStack(ColourableItemRegistry.farmland_orange.get()),
            new ItemStack(ColourableItemRegistry.farmland_pink.get()),
            new ItemStack(ColourableItemRegistry.farmland_purple.get()),
            new ItemStack(ColourableItemRegistry.farmland_red.get()),
            new ItemStack(ColourableItemRegistry.farmland_white.get()),
            new ItemStack(ColourableItemRegistry.farmland_yellow.get())));
  }
}
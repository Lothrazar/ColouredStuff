package com.lothrazar.colouredstuff.item;

import com.lothrazar.library.item.BlockItemFlib;
import com.lothrazar.library.item.ItemFlib;
import net.minecraft.world.level.block.Block;

public class ItemColour extends BlockItemFlib {

  public ItemColour(Block b, Properties prop, ItemFlib.Settings s) {
    super(b, prop, s);
  }
  //  @Override
  //  @OnlyIn(Dist.CLIENT)
  //  public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
  //    if (stack.hasTag() && stack.getTag().contains("BlockStateTag")) {
  //      String color = getColorStringFromNbt(stack);
  //      tooltip.add(ChatUtil.ilang("item.minecraft." + color + "_dye"));
  //      return;
  //    }
  //    super.appendHoverText(stack, worldIn, tooltip, flagIn);
  //  }
  //
  //  public static void writeColorStringNbt(ItemStack stack, String color) {
  //    //TODO: validate color
  //    CompoundTag state = new CompoundTag();
  //    state.putString("color", color);
  //    stack.getOrCreateTag().put("BlockStateTag", state);
  //  }
}

package com.lothrazar.colouredstuff;

import java.util.List;
import com.lothrazar.library.item.BlockItemFlib;
import com.lothrazar.library.item.ItemFlib;
import com.lothrazar.library.util.ChatUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemColour extends BlockItemFlib {

  public ItemColour(Block b, Properties prop, ItemFlib.Settings s) {
    super(b, prop, s);
  }

  @Override
  @OnlyIn(Dist.CLIENT)
  public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
    if (stack.hasTag() && stack.getTag().contains("BlockStateTag")) {
      String color = stack.getTag().getCompound("BlockStateTag").getString("color");
      tooltip.add(ChatUtil.ilang("item.minecraft." + color + "_dye"));
      return;
    }
    super.appendHoverText(stack, worldIn, tooltip, flagIn);
  }
}

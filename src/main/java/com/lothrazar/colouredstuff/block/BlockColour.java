package com.lothrazar.colouredstuff.block;

import com.lothrazar.colouredstuff.item.DyeColorless;
import com.lothrazar.library.block.BlockFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;

public class BlockColour extends BlockFlib {

  public static final EnumProperty<DyeColorless> COLOR = EnumProperty.create("color", DyeColorless.class);

  public BlockColour(Properties p, BlockFlib.Settings s) {
    super(p, s);
    this.registerDefaultState(this.stateDefinition.any().setValue(COLOR, DyeColorless.NONE));
    super.createBlockStateDefinition(null);
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    super.createBlockStateDefinition(builder.add(BlockColour.COLOR));
  }

  @Override
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    BlockState state = this.defaultBlockState();
    if (ctx.getHand() == InteractionHand.MAIN_HAND && ctx.getPlayer() != null && ctx.getPlayer().getItemInHand(InteractionHand.OFF_HAND).getItem() instanceof DyeItem dye) {
      //if we already have a colour, dont worry about -none
      //TODO: unless we want to check for a tagged 'soap' item?
      state = state.setValue(BlockColour.COLOR, DyeColorless.toColorless(dye.getDyeColor()));
    }
    return state;
  }

  @SuppressWarnings("deprecation")
  @Override
  public boolean skipRendering(BlockState state, BlockState otherState, Direction face) {
    return otherState.is(this) ? true : super.skipRendering(state, otherState, face);
  }

  @Override // TODO port
  public void onRightClickBlock(RightClickBlock event, BlockState state) {
    if ( // me.rotateColour &&
    event.getItemStack().getItem() instanceof DyeItem newColor) {
      boolean doConnected = event.getEntity().isCrouching();
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), event.getItemStack(), DyeColorless.toColorless(newColor.getDyeColor()), doConnected);
    }
    else if (event.getItemStack().getItem() == Items.SNOWBALL) { // TODO: tagit
      //
    }
  }

  //  @Override // TODO port
  public void rotateDye(BlockState state, Level world, BlockPos pos, Player player, ItemStack heldStack, DyeColorless newColour, boolean doConnected) {
    DyeColorless oldColour = state.getValue(COLOR);
    if (newColour != oldColour) {
      //new color is different, NOW update
      world.setBlockAndUpdate(pos, state.setValue(COLOR, newColour));
      //      if (me.rotateColourConsume) {
      ItemStackUtil.shrink(player, heldStack);
      //      }
      if (doConnected) {
        this.setConnectedColour(world, pos, oldColour, newColour, 0);
      }
    }
  }

  private static final int MAX_CONNECTED_UPDATE = 18;

  //  @Override // TODO port
  public void setConnectedColour(Level world, BlockPos pos, DyeColorless oldColour, DyeColorless newColor, int rec) {
    if (rec > MAX_CONNECTED_UPDATE) {
      return;
    }
    for (Direction d : Direction.values()) {
      BlockPos offset = pos.relative(d);
      BlockState here = world.getBlockState(offset);
      if (here.getBlock() == this && oldColour == here.getValue(COLOR)) {
        world.setBlockAndUpdate(offset, here.setValue(COLOR, newColor));
        rec++;
        this.setConnectedColour(world, offset, oldColour, newColor, rec);
      }
    }
  }
}

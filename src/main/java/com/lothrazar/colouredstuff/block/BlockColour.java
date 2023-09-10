package com.lothrazar.colouredstuff.block;

import com.lothrazar.colouredstuff.ColourableRegistry;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.color.DyeColorless;
import com.lothrazar.library.block.BlockFlib;
import com.lothrazar.library.util.ItemStackUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraftforge.common.Tags;
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
    if (ctx.getHand() == InteractionHand.MAIN_HAND && ctx.getPlayer() != null) {
      //now attempt
      ItemStack itemInHand = ctx.getPlayer().getItemInHand(InteractionHand.OFF_HAND);
      if (itemInHand.getItem() instanceof DyeItem dye) {
        //if we already have a colour, dont worry about -none
        //TODO: unless we want to check for a tagged 'soap' item?
        state = state.setValue(BlockColour.COLOR, DyeColorless.toColorless(dye.getDyeColor()));
      }
      else if (itemInHand.is(ColourableRegistry.DYES_NONE)) {
        //is dyes none 
        state = state.setValue(BlockColour.COLOR, DyeColorless.NONE);
      }
      else if (itemInHand.is(Tags.Items.DYES)) {
        ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla dye , we should fix this");
      }
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
    final ItemStack itemInHand = event.getItemStack();
    boolean doConnected = event.getEntity().isCrouching();
    ModColourable.LOGGER.error("itemInHand " + itemInHand);
    if ( // me.rotateColour &&
    itemInHand.getItem() instanceof DyeItem newColor) {
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.toColorless(newColor.getDyeColor()), doConnected);
    }
    else if (itemInHand.is(ColourableRegistry.DYES_NONE)) {
      //is dyes none 
      ModColourable.LOGGER.error("DYES_NONEDYES_NONEis");
      rotateDye(state, event.getLevel(), event.getPos(), event.getEntity(), itemInHand, DyeColorless.NONE, doConnected);
    }
    else if (itemInHand.is(Tags.Items.DYES)) {
      ModColourable.LOGGER.error("TODO: this is tagged as a dye item but its not a vanilla dye , we should fix this");
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

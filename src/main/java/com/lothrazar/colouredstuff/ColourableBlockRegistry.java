package com.lothrazar.colouredstuff;

import com.lothrazar.colouredstuff.block.BlockColour;
import com.lothrazar.library.block.BlockFlib;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColourableBlockRegistry {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModColourable.MODID);
  public static final RegistryObject<BlockColour> PLANKS_BLACK = BLOCKS.register("planks_black", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
  public static final RegistryObject<BlockColour> PLANKS_BLUE = BLOCKS.register("planks_blue", () -> new BlockColour(Block.Properties.copy(Blocks.ACACIA_PLANKS), new BlockFlib.Settings())); // .strength(2.0F, 3.0F)
}

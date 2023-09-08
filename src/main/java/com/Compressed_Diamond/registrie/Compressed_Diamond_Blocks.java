package com.Compressed_Diamond.registrie;

import com.Compressed_Diamond.Block.Compressed_Diamond_Block;
import com.Compressed_Diamond.main.Compressed_Diamond;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Compressed_Diamond_Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Compressed_Diamond.MOD_ID);

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = BLOCKS.register("compressed_diamond_block", Compressed_Diamond_Block::new);
}

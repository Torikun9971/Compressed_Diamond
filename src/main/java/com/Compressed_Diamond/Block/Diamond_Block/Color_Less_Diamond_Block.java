package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;

public class Color_Less_Diamond_Block extends GlassBlock {
    public Color_Less_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(8.0F, 9.0F)
                .requiresCorrectToolForDrops()
                .noOcclusion()
        );
    }
}

package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Violet_Diamond_Block extends Block {
    public Violet_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(12.0F, 13.0F)
                .mapColor(MapColor.COLOR_PURPLE)
                .requiresCorrectToolForDrops()
        );
    }
}

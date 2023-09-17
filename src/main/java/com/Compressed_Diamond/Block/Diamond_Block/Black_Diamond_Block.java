package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Black_Diamond_Block extends Block {
    public Black_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(6.0F, 7.0F)
                .mapColor(MapColor.COLOR_GRAY)
                .requiresCorrectToolForDrops()
        );
    }
}

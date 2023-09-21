package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Purple_Diamond_Block extends Block {
    public Purple_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(13.0F, 14.0F)
                .mapColor(MapColor.COLOR_MAGENTA)
                .requiresCorrectToolForDrops()
        );
    }
}

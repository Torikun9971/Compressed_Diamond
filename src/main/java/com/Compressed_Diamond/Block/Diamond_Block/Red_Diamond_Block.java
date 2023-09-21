package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Red_Diamond_Block extends Block {
    public Red_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(18.0F, 19.0F)
                .mapColor(MapColor.COLOR_RED)
                .requiresCorrectToolForDrops()
        );
    }
}

package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Brown_Diamond_Block extends Block {
    public Brown_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(9.0F, 10.0F)
                .mapColor(MapColor.COLOR_BROWN)
                .requiresCorrectToolForDrops()
        );
    }
}

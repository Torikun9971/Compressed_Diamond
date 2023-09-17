package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Yellow_Diamond_Block extends Block {
    public Yellow_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(10.0F, 11.0F)
                .mapColor(MapColor.COLOR_YELLOW)
                .requiresCorrectToolForDrops()
        );
    }
}

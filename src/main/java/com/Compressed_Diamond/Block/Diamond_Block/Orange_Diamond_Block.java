package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Orange_Diamond_Block extends Block {
    public Orange_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(11.0F, 12.0F)
                .mapColor(MapColor.COLOR_ORANGE)
                .requiresCorrectToolForDrops()
        );
    }
}

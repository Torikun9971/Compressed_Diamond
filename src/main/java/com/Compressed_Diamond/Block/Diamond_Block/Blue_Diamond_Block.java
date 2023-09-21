package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Blue_Diamond_Block extends Block {
    public Blue_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(17.0F, 18.0F)
                .mapColor(MapColor.COLOR_BLUE)
                .requiresCorrectToolForDrops()
        );
    }
}

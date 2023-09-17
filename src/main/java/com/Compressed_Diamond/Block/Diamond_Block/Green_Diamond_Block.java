package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Green_Diamond_Block extends Block {
    public Green_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(16.0F, 17.0F)
                .mapColor(MapColor.COLOR_LIGHT_GREEN)
                .requiresCorrectToolForDrops()
        );
    }
}

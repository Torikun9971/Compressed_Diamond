package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Gray_Diamond_Block extends Block {
    public Gray_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(7.0F, 8.0F)
                .mapColor(MapColor.COLOR_LIGHT_GRAY)
                .requiresCorrectToolForDrops()
        );
    }
}

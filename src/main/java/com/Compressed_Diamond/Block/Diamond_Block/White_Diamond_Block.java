package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class White_Diamond_Block extends Block {
    public White_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(14.0F, 15.0F)
                .mapColor(DyeColor.WHITE)
                .requiresCorrectToolForDrops()
        );
    }
}

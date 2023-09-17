package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Pink_Diamond_Block extends Block {
    public Pink_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(15.0F, 16.0F)
                .mapColor(MapColor.COLOR_PINK)
                .requiresCorrectToolForDrops()
        );
    }
}

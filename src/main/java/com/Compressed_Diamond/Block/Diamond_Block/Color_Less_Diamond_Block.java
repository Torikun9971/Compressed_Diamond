package com.Compressed_Diamond.Block.Diamond_Block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;

public class Color_Less_Diamond_Block extends GlassBlock {

    public Color_Less_Diamond_Block() {
        super(Properties.of()
                .sound(SoundType.METAL)
                .strength(8.0F, 9.0F)
                .requiresCorrectToolForDrops()
                .noOcclusion()
        );
    }
}

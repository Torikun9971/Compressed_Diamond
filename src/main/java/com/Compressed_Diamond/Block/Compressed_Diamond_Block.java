package com.Compressed_Diamond.Block;

import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.Collections;
import java.util.List;


public class Compressed_Diamond_Block extends Block {
    public Compressed_Diamond_Block() {
        super(BlockBehaviour.Properties.of()
                .sound(SoundType.METAL)
                .strength(5.5F, 6.5F)
                .requiresCorrectToolForDrops()
                .mapColor(MapColor.DIAMOND)
        );
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}

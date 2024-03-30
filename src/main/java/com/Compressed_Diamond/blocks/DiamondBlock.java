package com.compressed_diamond.blocks;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;

public class DiamondBlock extends Block {
    private final String diamonds;

    public DiamondBlock(Properties properties, String diamonds) {
        super(properties);
        this.diamonds = diamonds;
    }

    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("info.compressed_diamond.diamonds", new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount()))));
        }
    }
}

package com.compressed_diamond.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;

public class Diamond extends Item {
    private final String diamonds;

    public Diamond(Properties properties, String diamonds) {
        super(properties);
        this.diamonds = diamonds;
    }

    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> components, ITooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslationTextComponent("info.compressed_diamond.diamonds", new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount()))));
        }
    }
}

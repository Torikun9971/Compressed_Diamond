package com.compressed_diamond.items;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;

public class Diamond extends Item {
    private final String diamonds;

    public Diamond(Properties properties, String diamonds) {
        super(properties);
        this.diamonds = diamonds;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount())))));
        }
    }
}

package com.compressed_diamond.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;

public class DiamondBlock extends Block {
    private final String diamonds;

    public DiamondBlock(Properties properties, String diamonds) {
        super(properties.harvestTool(ToolType.PICKAXE).harvestLevel(2));
        this.diamonds = diamonds;
    }

    public void appendHoverText(ItemStack stack, @Nullable IBlockReader reader, List<ITextComponent> components, ITooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslationTextComponent("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount())))));
        }
    }
}

package com.compressed_diamond.blocks;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.GlassBlock;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;

public class DiamondBlockTranslucent extends GlassBlock {
    private final String diamonds;

    public DiamondBlockTranslucent(Properties properties, String diamonds) {
        super(properties.noOcclusion().isValidSpawn((blockState, blockGetter, blockPos, entityType) -> false).isSuffocating((blockState, blockGetter, blockPos) -> false).isViewBlocking((blockState, blockGetter, blockPos) -> false));
        this.diamonds = diamonds;
        ItemBlockRenderTypes.setRenderLayer(this, RenderType.translucent());
    }

    public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslatableComponent("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount())))));
        }
    }
}

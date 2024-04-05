package com.compressed_diamond;

import com.compressed_diamond.init.ModBlocks;
import com.compressed_diamond.init.ModCreativeTabs;
import com.compressed_diamond.init.ModItems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.math.BigInteger;
import java.text.DecimalFormat;

@Mod(CompressedDiamond.MOD_ID)
public class CompressedDiamond {
    public static final String MOD_ID = "compressed_diamond";

    public CompressedDiamond() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        modEventBus.register(ModCreativeTabs.CREATIVE_MODE_TABS);

        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> SetTooltips::setup);
    }

    private static class SetTooltips {
        private static void setup() {
            IEventBus modEventBus = MinecraftForge.EVENT_BUS;
            modEventBus.addListener(EventPriority.LOW, false, ItemTooltipEvent.class, SetTooltips::setTooltips);
        }

        private static void setTooltips(ItemTooltipEvent event) {
            if (event.getItemStack().is(Items.DIAMOND_BLOCK) && Screen.hasShiftDown()) {
                event.getToolTip().add(Component.translatable("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(BigInteger.valueOf(9).multiply(BigInteger.valueOf(event.getItemStack().getCount())))));
            }
        }
    }
}

package com.compressed_diamond;

import com.compressed_diamond.init.ModBlocks;
import com.compressed_diamond.init.ModCreativeTabs;
import com.compressed_diamond.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Items;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

@Mod(CompressedDiamond.MOD_ID)
public class CompressedDiamond {
    public static final String MOD_ID = "compressed_diamond";
    public static final ArrayList<Block> TRANSLUCENT_BLOCKS = new ArrayList<>();

    public CompressedDiamond() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        modEventBus.register(ModCreativeTabs.CREATIVE_MODE_TABS);

        DistExecutor.runWhenOn(Dist.CLIENT, () -> ClientSetup::setup);
    }

    private static class ClientSetup {
        private static void setup() {
            IEventBus modEventBusEvent = MinecraftForge.EVENT_BUS;
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            modEventBusEvent.addListener(EventPriority.LOW, false, ItemTooltipEvent.class, ClientSetup::setTooltips);
            modEventBus.addListener(EventPriority.LOW, false, FMLClientSetupEvent.class, ClientSetup::setRenderType);
        }

        private static void setTooltips(ItemTooltipEvent event) {
            if (event.getItemStack().getItem() == Items.DIAMOND_BLOCK && Screen.hasShiftDown()) {
                event.getToolTip().add(new TranslationTextComponent("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(BigInteger.valueOf(9).multiply(BigInteger.valueOf(event.getItemStack().getCount())))));
            }
        }

        private static void setRenderType(final FMLClientSetupEvent event) {
            for (Block block : TRANSLUCENT_BLOCKS) {
                RenderTypeLookup.setRenderLayer(block, RenderType.translucent());
            }
        }
    }
}

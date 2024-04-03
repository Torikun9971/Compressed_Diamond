package com.compressed_diamond;

import com.compressed_diamond.init.ModBlocks;
import com.compressed_diamond.init.ModCreativeTabs;
import com.compressed_diamond.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setRenderType);
    }

    private void setRenderType(final FMLCommonSetupEvent event) {
        for (Block block : TRANSLUCENT_BLOCKS) {
            RenderTypeLookup.setRenderLayer(block, RenderType.translucent());
        }
    }
}

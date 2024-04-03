package com.compressed_diamond;

import com.compressed_diamond.init.ModBlocks;
import com.compressed_diamond.init.ModCreativeTabs;
import com.compressed_diamond.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CompressedDiamond.MOD_ID)
public class CompressedDiamond {
    public static final String MOD_ID = "compressed_diamond";

    public CompressedDiamond() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }
}

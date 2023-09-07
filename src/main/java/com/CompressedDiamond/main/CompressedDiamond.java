package com.CompressedDiamond.main;

import com.CompressedDiamond.CreativeTab.Tab_Control;
import com.google.common.io.Closer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("compressed_diamond")
public class CompressedDiamond {

    public static final String MOD_ID = "compressed_diamond";


    public CompressedDiamond(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Tab_Control.MOD_TABS.register(bus);
    }
}

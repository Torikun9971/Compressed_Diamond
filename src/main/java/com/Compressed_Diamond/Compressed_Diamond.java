package com.Compressed_Diamond;

import com.Compressed_Diamond.registrie.Compressed_Diamond_Blocks;
import com.Compressed_Diamond.registrie.Compressed_Diamond_CreativeTabs;
import com.Compressed_Diamond.registrie.Compressed_Diamond_Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("compressed_diamond")
public class Compressed_Diamond {

    public static final String MOD_ID = "compressed_diamond";


    public Compressed_Diamond(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Compressed_Diamond_Blocks.BLOCKS.register(bus);
        Compressed_Diamond_Items.ITEMS.register(bus);
        Compressed_Diamond_CreativeTabs.MOD_TABS.register(bus);
    }
}

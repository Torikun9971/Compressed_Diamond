package com.CompressedDiamond.CreativeTab;

import com.CompressedDiamond.CreativeTab.Tabs.CompressedDiamond;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tab_Control {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, com.CompressedDiamond.main.CompressedDiamond.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Compressed_Diamond = MOD_TABS.register("compressed_diamond",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Blocks.OAK_LOG))
                    .title(Component.translatable("itemGroup.compressed_diamond"))
                    .displayItems((param,output)->{
                        for(Item item: CompressedDiamond.items){
                            output.accept(item);
                        }
                    })
                    .build();

    });
}

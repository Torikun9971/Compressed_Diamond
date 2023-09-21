package com.Compressed_Diamond.registrie;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Compressed_Diamond_CreativeTabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, com.Compressed_Diamond.Compressed_Diamond.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Compressed_Diamond = MOD_TABS.register("compressed_diamond",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("itemGroup.Diamond"))
                    .displayItems((param,output)->{
                        for(Item item: com.Compressed_Diamond.CreativeTab.Compressed_Diamond.items){
                            output.accept(item);
                        }
                    })
                    .build();

    });
}

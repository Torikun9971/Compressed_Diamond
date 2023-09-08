package com.Compressed_Diamond.Item.Diamond;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Item_Compressed_Diamond_Block extends Item {
    public Item_Compressed_Diamond_Block() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)

        );
    }
}

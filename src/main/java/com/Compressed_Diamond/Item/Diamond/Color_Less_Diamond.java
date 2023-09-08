package com.Compressed_Diamond.Item.Diamond;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Color_Less_Diamond extends Item {
    public Color_Less_Diamond() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)
        );
    }
}

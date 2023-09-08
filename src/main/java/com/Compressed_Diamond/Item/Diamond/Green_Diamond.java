package com.Compressed_Diamond.Item.Diamond;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Green_Diamond extends Item {
    public Green_Diamond() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)

        );
    }
}

package com.Compressed_Diamond.registrie;

import com.Compressed_Diamond.Item.Diamond.*;
import com.Compressed_Diamond.Compressed_Diamond;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Compressed_Diamond_Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Compressed_Diamond.MOD_ID);

    public static final RegistryObject<Item> BLACK_DIAMOND = ITEMS.register("black_diamond", Black_Diamond::new);
    public static final RegistryObject<Item> GRAY_DIAMOND = ITEMS.register("gray_diamond", Gray_Diamond::new);
    public static final RegistryObject<Item> COLOR_LESS_DIAMOND = ITEMS.register("color_less_diamond", Color_Less_Diamond::new);
    public static final RegistryObject<Item> BROWN_DIAMOND = ITEMS.register("brown_diamond", Brown_Diamond::new);
    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond", Yellow_Diamond::new);
    public static final RegistryObject<Item> ORANGE_DIAMOND = ITEMS.register("orange_diamond", Orange_Diamond::new);
    public static final RegistryObject<Item> VIOLET_DIAMOND = ITEMS.register("violet_diamond", Violet_Diamond::new);
    public static final RegistryObject<Item> PURPLE_DIAMOND = ITEMS.register("purple_diamond", Purple_Diamond::new);
    public static final RegistryObject<Item> WHITE_DIAMOND = ITEMS.register("white_diamond", White_Diamond::new);
    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond", Pink_Diamond::new);
    public static final RegistryObject<Item> GREEN_DIAMOND = ITEMS.register("green_diamond", Green_Diamond::new);
    public static final RegistryObject<Item> BLUE_DIAMOND = ITEMS.register("blue_diamond", Blue_Diamond::new);
    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond", Red_Diamond::new);
    public static final RegistryObject<Item> ITEM_COMPRESSED_DIAMOND_BLOCK = ITEMS.register("item_compressed_diamond_block", Item_Compressed_Diamond_Block::new);
}

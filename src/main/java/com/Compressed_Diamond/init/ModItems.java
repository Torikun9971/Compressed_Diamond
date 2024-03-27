package com.compressed_diamond.init;

import com.compressed_diamond.CompressedDiamond;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedDiamond.MOD_ID);

    public static final RegistryObject<Item> BLACK_DIAMOND = ITEMS.register("black_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_DIAMOND = ITEMS.register("gray_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLOR_LESS_DIAMOND = ITEMS.register("color_less_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_DIAMOND = ITEMS.register("brown_diamond", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ORANGE_DIAMOND = ITEMS.register("orange_diamond", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> VIOLET_DIAMOND = ITEMS.register("violet_diamond", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> PURPLE_DIAMOND = ITEMS.register("purple_diamond", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> WHITE_DIAMOND = ITEMS.register("white_diamond", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GREEN_DIAMOND = ITEMS.register("green_diamond", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BLUE_DIAMOND = ITEMS.register("blue_diamond", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
}

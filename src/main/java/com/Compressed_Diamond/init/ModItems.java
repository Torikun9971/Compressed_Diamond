package com.compressed_diamond.init;

import com.compressed_diamond.CompressedDiamond;
import com.compressed_diamond.items.Diamond;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedDiamond.MOD_ID);

    public static final RegistryObject<Item> BLACK_DIAMOND = ITEMS.register("black_diamond", () -> new Diamond(new Item.Properties(), "729"));
    public static final RegistryObject<Item> GRAY_DIAMOND = ITEMS.register("gray_diamond", () -> new Diamond(new Item.Properties(), "531441"));
    public static final RegistryObject<Item> COLOR_LESS_DIAMOND = ITEMS.register("color_less_diamond", () -> new Diamond(new Item.Properties(), "387420489"));
    public static final RegistryObject<Item> BROWN_DIAMOND = ITEMS.register("brown_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.UNCOMMON), "282429536481"));
    public static final RegistryObject<Item> YELLOW_DIAMOND = ITEMS.register("yellow_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.UNCOMMON), "205891132094649"));
    public static final RegistryObject<Item> ORANGE_DIAMOND = ITEMS.register("orange_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.UNCOMMON), "150094635296999121"));
    public static final RegistryObject<Item> VIOLET_DIAMOND = ITEMS.register("violet_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.UNCOMMON), "109418989131512359209"));
    public static final RegistryObject<Item> PURPLE_DIAMOND = ITEMS.register("purple_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.RARE), "79766443076872509863361"));
    public static final RegistryObject<Item> WHITE_DIAMOND = ITEMS.register("white_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.RARE), "58149737003040059690390169"));
    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register("pink_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.RARE), "42391158275216203514294433201"));
    public static final RegistryObject<Item> GREEN_DIAMOND = ITEMS.register("green_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.RARE), "30903154382632612361920641803529"));
    public static final RegistryObject<Item> BLUE_DIAMOND = ITEMS.register("blue_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.EPIC), "22528399544939174411840147874772641"));
    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond", () -> new Diamond(new Item.Properties().rarity(Rarity.EPIC), "16423203268260658146231467800709255289"));
}

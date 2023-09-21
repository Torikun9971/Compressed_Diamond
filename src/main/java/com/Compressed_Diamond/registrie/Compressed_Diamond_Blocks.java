package com.Compressed_Diamond.registrie;

import com.Compressed_Diamond.Block.Diamond_Block.*;
import com.Compressed_Diamond.Compressed_Diamond;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Compressed_Diamond_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Compressed_Diamond.MOD_ID);

    public static final RegistryObject<Block> BLACK_DIAMOND_BLOCK = registerBlock("black_diamond_block", Black_Diamond_Block::new);
    public static final RegistryObject<Block> GRAY_DIAMOND_BLOCK = registerBlock("gray_diamond_block", Gray_Diamond_Block::new);
    public static final RegistryObject<Block> COLOR_LESS_DIAMOND_BLOCK = registerBlock("color_less_diamond_block", Color_Less_Diamond_Block::new);
    public static final RegistryObject<Block> BROWN_DIAMOND_BLOCK = registerBlock("brown_diamond_block", Brown_Diamond_Block::new);
    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = registerBlock("yellow_diamond_block", Yellow_Diamond_Block::new);
    public static final RegistryObject<Block> ORANGE_DIAMOND_BLOCK = registerBlock("orange_diamond_block", Orange_Diamond_Block::new);
    public static final RegistryObject<Block> VIOLET_DIAMOND_BLOCK = registerBlock("violet_diamond_block", Violet_Diamond_Block::new);
    public static final RegistryObject<Block> PURPLE_DIAMOND_BLOCK = registerBlock("purple_diamond_block", Purple_Diamond_Block::new);
    public static final RegistryObject<Block> WHITE_DIAMOND_BLOCK = registerBlock("white_diamond_block", White_Diamond_Block::new);
    public static final RegistryObject<Block> PINK_DIAMOND_BLOCK = registerBlock("pink_diamond_block", Pink_Diamond_Block::new);
    public static final RegistryObject<Block> GREEN_DIAMOND_BLOCK = registerBlock("green_diamond_block", Green_Diamond_Block::new);
    public static final RegistryObject<Block> BLUE_DIAMOND_BLOCK = registerBlock("blue_diamond_block", Blue_Diamond_Block::new);
    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = registerBlock("red_diamond_block", Red_Diamond_Block::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Compressed_Diamond_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

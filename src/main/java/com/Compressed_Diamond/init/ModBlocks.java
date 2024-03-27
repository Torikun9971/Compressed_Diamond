package com.compressed_diamond.init;

import com.compressed_diamond.CompressedDiamond;
import com.compressed_diamond.blocks.CompressedDiamondBlock;
import com.compressed_diamond.blocks.CompressedDiamondBlockTranslucent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedDiamond.MOD_ID);

    public static final RegistryObject<Block> BLACK_DIAMOND_BLOCK = registerBlockItem("black_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6.0F, 7.0F).mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_DIAMOND_BLOCK = registerBlockItem("gray_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(7.0F, 8.0F).mapColor(MapColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COLOR_LESS_DIAMOND_BLOCK = registerBlockItem("color_less_diamond_block", () -> new GlassBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(8.0F, 9.0F).requiresCorrectToolForDrops().noOcclusion().isValidSpawn((blockState, blockGetter, blockPos, entityType) -> false).isSuffocating((blockState, blockGetter, blockPos) -> false).isViewBlocking((blockState, blockGetter, blockPos) -> false)));
    public static final RegistryObject<Block> BROWN_DIAMOND_BLOCK = registerBlockItem("brown_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(9.0F, 10.0F).mapColor(MapColor.COLOR_BROWN).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = registerBlockItem("yellow_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(10.0F, 11.0F).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> ORANGE_DIAMOND_BLOCK = registerBlockItem("orange_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(11.0F, 12.0F).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> VIOLET_DIAMOND_BLOCK = registerBlockItem("violet_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(12.0F, 13.0F).mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> PURPLE_DIAMOND_BLOCK = registerBlockItem("purple_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(13.0F, 14.0F).mapColor(MapColor.COLOR_MAGENTA).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> WHITE_DIAMOND_BLOCK = registerBlockItem("white_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(14.0F, 15.0F).mapColor(DyeColor.WHITE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> PINK_DIAMOND_BLOCK = registerBlockItem("pink_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(15.0F, 16.0F).mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> GREEN_DIAMOND_BLOCK = registerBlockItem("green_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(16.0F, 17.0F).mapColor(MapColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> BLUE_DIAMOND_BLOCK = registerBlockItem("blue_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(17.0F, 18.0F).mapColor(MapColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.EPIC));
    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = registerBlockItem("red_diamond_block", () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(18.0F, 19.0F).mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.EPIC));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = registerBlockItem("compressed_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5.5F, 6.5F).mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPRESSED_BLACK_DIAMOND_BLOCK = registerBlockItem("compressed_black_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6.5F, 7.5F).mapColor(MapColor.COLOR_GRAY).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPRESSED_GRAY_DIAMOND_BLOCK = registerBlockItem("compressed_gray_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(7.5F, 8.5F).mapColor(MapColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPRESSED_COLOR_LESS_DIAMOND_BLOCK = registerBlockItem("compressed_color_less_diamond_block", () -> new CompressedDiamondBlockTranslucent(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(8.5F, 9.5F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPRESSED_BROWN_DIAMOND_BLOCK = registerBlockItem("compressed_brown_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(9.5F, 10.5F).mapColor(MapColor.COLOR_BROWN).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_DIAMOND_BLOCK = registerBlockItem("compressed_yellow_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(10.5F, 11.5F).mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_DIAMOND_BLOCK = registerBlockItem("compressed_orange_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(11.5F, 12.5F).mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_VIOLET_DIAMOND_BLOCK = registerBlockItem("compressed_violet_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(12.5F, 13.5F).mapColor(MapColor.COLOR_PURPLE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_DIAMOND_BLOCK = registerBlockItem("compressed_purple_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(13.5F, 14.5F).mapColor(MapColor.COLOR_MAGENTA).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_WHITE_DIAMOND_BLOCK = registerBlockItem("compressed_white_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(14.5F, 15.5F).mapColor(DyeColor.WHITE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_PINK_DIAMOND_BLOCK = registerBlockItem("compressed_pink_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(15.5F, 16.5F).mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_GREEN_DIAMOND_BLOCK = registerBlockItem("compressed_green_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(16.5F, 17.5F).mapColor(MapColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_BLUE_DIAMOND_BLOCK = registerBlockItem("compressed_blue_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(17.5F, 18.5F).mapColor(MapColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.EPIC));
    public static final RegistryObject<Block> COMPRESSED_RED_DIAMOND_BLOCK = registerBlockItem("compressed_red_diamond_block", () -> new CompressedDiamondBlock(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(18.5F, 19.5F).mapColor(MapColor.COLOR_RED).requiresCorrectToolForDrops()), new Item.Properties().rarity(Rarity.EPIC));

    private static <T extends Block> RegistryObject<T> registerBlockItem(String id, Supplier<T> block) {
        RegistryObject<T> blockObject = BLOCKS.register(id, block);
        ModItems.ITEMS.register(id, () -> new BlockItem(blockObject.get(), new Item.Properties()));

        return blockObject;
    }

    private static <T extends Block> RegistryObject<T> registerBlockItem(String id, Supplier<T> block, Item.Properties properties) {
        RegistryObject<T> blockObject = BLOCKS.register(id, block);
        ModItems.ITEMS.register(id, () -> new BlockItem(blockObject.get(), properties));

        return blockObject;
    }
}

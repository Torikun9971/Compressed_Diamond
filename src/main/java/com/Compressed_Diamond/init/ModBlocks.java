package com.compressed_diamond.init;

import com.compressed_diamond.CompressedDiamond;
import com.compressed_diamond.blocks.CompressedDiamondBlock;
import com.compressed_diamond.blocks.CompressedDiamondBlockTranslucent;
import com.compressed_diamond.blocks.DiamondBlock;
import com.compressed_diamond.blocks.DiamondBlockTranslucent;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedDiamond.MOD_ID);

    public static final RegistryObject<Block> BLACK_DIAMOND_BLOCK = registerBlockItem("black_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).sound(SoundType.METAL).strength(6.0F, 7.0F).requiresCorrectToolForDrops(), "6561"));
    public static final RegistryObject<Block> GRAY_DIAMOND_BLOCK = registerBlockItem("gray_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).sound(SoundType.METAL).strength(7.0F, 8.0F).requiresCorrectToolForDrops(), "4782969"));
    public static final RegistryObject<Block> COLORLESS_DIAMOND_BLOCK = registerBlockItem("colorless_diamond_block", () -> new DiamondBlockTranslucent(AbstractBlock.Properties.of(Material.METAL, MaterialColor.NONE).sound(SoundType.METAL).strength(8.0F, 9.0F).requiresCorrectToolForDrops(), "3486784401"));
    public static final RegistryObject<Block> BROWN_DIAMOND_BLOCK = registerBlockItem("brown_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).sound(SoundType.METAL).strength(9.0F, 10.0F).requiresCorrectToolForDrops(), "2541865828329"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> YELLOW_DIAMOND_BLOCK = registerBlockItem("yellow_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).sound(SoundType.METAL).strength(10.0F, 11.0F).requiresCorrectToolForDrops(), "1853020188851841"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> ORANGE_DIAMOND_BLOCK = registerBlockItem("orange_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).sound(SoundType.METAL).strength(11.0F, 12.0F).requiresCorrectToolForDrops(), "1350851717672992089"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> VIOLET_DIAMOND_BLOCK = registerBlockItem("violet_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).sound(SoundType.METAL).strength(12.0F, 13.0F).requiresCorrectToolForDrops(), "984770902183611232881"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> PURPLE_DIAMOND_BLOCK = registerBlockItem("purple_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_MAGENTA).sound(SoundType.METAL).strength(13.0F, 14.0F).requiresCorrectToolForDrops(), "717897987691852588770249"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> WHITE_DIAMOND_BLOCK = registerBlockItem("white_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, DyeColor.WHITE.getMaterialColor()).sound(SoundType.METAL).strength(14.0F, 15.0F).requiresCorrectToolForDrops(), "523347633027360537213511521"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> PINK_DIAMOND_BLOCK = registerBlockItem("pink_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).sound(SoundType.METAL).strength(15.0F, 16.0F).requiresCorrectToolForDrops(), "381520424476945831628649898809"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> GREEN_DIAMOND_BLOCK = registerBlockItem("green_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.METAL).strength(16.0F, 17.0F).requiresCorrectToolForDrops(), "278128389443693511257285776231761"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> BLUE_DIAMOND_BLOCK = registerBlockItem("blue_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).sound(SoundType.METAL).strength(17.0F, 18.0F).requiresCorrectToolForDrops(), "202755595904452569706561330872953769"), new Item.Properties().rarity(Rarity.EPIC));
    public static final RegistryObject<Block> RED_DIAMOND_BLOCK = registerBlockItem("red_diamond_block", () -> new DiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).sound(SoundType.METAL).strength(18.0F, 19.0F).requiresCorrectToolForDrops(), "147808829414345923316083210206383297601"), new Item.Properties().rarity(Rarity.EPIC));

    public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = registerBlockItem("compressed_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.DIAMOND).sound(SoundType.METAL).strength(5.5F, 6.5F).requiresCorrectToolForDrops(), "81"));
    public static final RegistryObject<Block> COMPRESSED_BLACK_DIAMOND_BLOCK = registerBlockItem("compressed_black_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).sound(SoundType.METAL).strength(6.5F, 7.5F).requiresCorrectToolForDrops(), "59049"));
    public static final RegistryObject<Block> COMPRESSED_GRAY_DIAMOND_BLOCK = registerBlockItem("compressed_gray_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GRAY).sound(SoundType.METAL).strength(7.5F, 8.5F).requiresCorrectToolForDrops(), "43046721"));
    public static final RegistryObject<Block> COMPRESSED_COLORLESS_DIAMOND_BLOCK = registerBlockItem("compressed_colorless_diamond_block", () -> new CompressedDiamondBlockTranslucent(AbstractBlock.Properties.of(Material.METAL, MaterialColor.NONE).sound(SoundType.METAL).strength(8.5F, 9.5F).requiresCorrectToolForDrops(), "31381059609"));
    public static final RegistryObject<Block> COMPRESSED_BROWN_DIAMOND_BLOCK = registerBlockItem("compressed_brown_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).sound(SoundType.METAL).strength(9.5F, 10.5F).requiresCorrectToolForDrops(), "22876792454961"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_YELLOW_DIAMOND_BLOCK = registerBlockItem("compressed_yellow_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_YELLOW).sound(SoundType.METAL).strength(10.5F, 11.5F).requiresCorrectToolForDrops(), "16677181699666569"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_ORANGE_DIAMOND_BLOCK = registerBlockItem("compressed_orange_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).sound(SoundType.METAL).strength(11.5F, 12.5F).requiresCorrectToolForDrops(), "12157665459056928801"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_VIOLET_DIAMOND_BLOCK = registerBlockItem("compressed_violet_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).sound(SoundType.METAL).strength(12.5F, 13.5F).requiresCorrectToolForDrops(), "8862938119652501095929"), new Item.Properties().rarity(Rarity.UNCOMMON));
    public static final RegistryObject<Block> COMPRESSED_PURPLE_DIAMOND_BLOCK = registerBlockItem("compressed_purple_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_MAGENTA).sound(SoundType.METAL).strength(13.5F, 14.5F).requiresCorrectToolForDrops(), "6461081889226673298932241"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_WHITE_DIAMOND_BLOCK = registerBlockItem("compressed_white_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, DyeColor.WHITE.getMaterialColor()).sound(SoundType.METAL).strength(14.5F, 15.5F).requiresCorrectToolForDrops(), "4710128697246244834921603689"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_PINK_DIAMOND_BLOCK = registerBlockItem("compressed_pink_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK).sound(SoundType.METAL).strength(15.5F, 16.5F).requiresCorrectToolForDrops(), "3433683820292512484657849089281"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_GREEN_DIAMOND_BLOCK = registerBlockItem("compressed_green_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.METAL).strength(16.5F, 17.5F).requiresCorrectToolForDrops(), "2503155504993241601315571986085849"), new Item.Properties().rarity(Rarity.RARE));
    public static final RegistryObject<Block> COMPRESSED_BLUE_DIAMOND_BLOCK = registerBlockItem("compressed_blue_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).sound(SoundType.METAL).strength(17.5F, 18.5F).requiresCorrectToolForDrops(), "1824800363140073127359051977856583921"), new Item.Properties().rarity(Rarity.EPIC));
    public static final RegistryObject<Block> COMPRESSED_RED_DIAMOND_BLOCK = registerBlockItem("compressed_red_diamond_block", () -> new CompressedDiamondBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).sound(SoundType.METAL).strength(18.5F, 19.5F).requiresCorrectToolForDrops(), "1330279464729113309844748891857449678409"), new Item.Properties().rarity(Rarity.EPIC));

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

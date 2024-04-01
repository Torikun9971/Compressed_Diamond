package com.compressed_diamond.init;

import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;

public class ModCreativeTabs {
    public static final ArrayList<CreativeModeTab> CREATIVE_MODE_TABS = new ArrayList<>();

    public static final CreativeModeTab DIAMONDS = new CreativeModeTab("compressed_diamond.diamonds") {

        public ItemStack makeIcon() {
            CREATIVE_MODE_TABS.add(this);
            return new ItemStack(Items.DIAMOND);
        }

        public Component getDisplayName() {
            return new TranslatableComponent("itemGroup.compressed_diamond.diamonds");
        }

        public void fillItemList(NonNullList<ItemStack> list) {
            list.add(Items.DIAMOND.getDefaultInstance());
            list.add(Items.DIAMOND_BLOCK.getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.BLACK_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.BLACK_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_BLACK_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.GRAY_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.GRAY_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_GRAY_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.COLORLESS_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.COLORLESS_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_COLORLESS_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.BROWN_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.BROWN_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_BROWN_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.YELLOW_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.YELLOW_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_YELLOW_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.ORANGE_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.ORANGE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_ORANGE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.VIOLET_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.VIOLET_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_VIOLET_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.PURPLE_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.PURPLE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_PURPLE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.WHITE_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.WHITE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_WHITE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.PINK_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.PINK_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_PINK_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.GREEN_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.GREEN_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_GREEN_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.BLUE_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.BLUE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_BLUE_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModItems.RED_DIAMOND.get().getDefaultInstance());
            list.add(ModBlocks.RED_DIAMOND_BLOCK.get().asItem().getDefaultInstance());
            list.add(ModBlocks.COMPRESSED_RED_DIAMOND_BLOCK.get().asItem().getDefaultInstance());

            super.fillItemList(list);
        }
    };
}

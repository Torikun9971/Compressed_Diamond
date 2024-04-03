package com.compressed_diamond.init;

import com.compressed_diamond.CompressedDiamond;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompressedDiamond.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIAMONDS = CREATIVE_MODE_TABS.register("diamonds",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("itemGroup.compressed_diamond.diamonds"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.DIAMOND);
                        output.accept(Items.DIAMOND_BLOCK);
                        output.accept(ModBlocks.COMPRESSED_DIAMOND_BLOCK.get());
                        output.accept(ModItems.BLACK_DIAMOND.get());
                        output.accept(ModBlocks.BLACK_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_BLACK_DIAMOND_BLOCK.get());
                        output.accept(ModItems.GRAY_DIAMOND.get());
                        output.accept(ModBlocks.GRAY_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_GRAY_DIAMOND_BLOCK.get());
                        output.accept(ModItems.COLORLESS_DIAMOND.get());
                        output.accept(ModBlocks.COLORLESS_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_COLORLESS_DIAMOND_BLOCK.get());
                        output.accept(ModItems.BROWN_DIAMOND.get());
                        output.accept(ModBlocks.BROWN_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_BROWN_DIAMOND_BLOCK.get());
                        output.accept(ModItems.YELLOW_DIAMOND.get());
                        output.accept(ModBlocks.YELLOW_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_YELLOW_DIAMOND_BLOCK.get());
                        output.accept(ModItems.ORANGE_DIAMOND.get());
                        output.accept(ModBlocks.ORANGE_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_ORANGE_DIAMOND_BLOCK.get());
                        output.accept(ModItems.VIOLET_DIAMOND.get());
                        output.accept(ModBlocks.VIOLET_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_VIOLET_DIAMOND_BLOCK.get());
                        output.accept(ModItems.PURPLE_DIAMOND.get());
                        output.accept(ModBlocks.PURPLE_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_PURPLE_DIAMOND_BLOCK.get());
                        output.accept(ModItems.WHITE_DIAMOND.get());
                        output.accept(ModBlocks.WHITE_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_WHITE_DIAMOND_BLOCK.get());
                        output.accept(ModItems.PINK_DIAMOND.get());
                        output.accept(ModBlocks.PINK_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_PINK_DIAMOND_BLOCK.get());
                        output.accept(ModItems.GREEN_DIAMOND.get());
                        output.accept(ModBlocks.GREEN_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_GREEN_DIAMOND_BLOCK.get());
                        output.accept(ModItems.BLUE_DIAMOND.get());
                        output.accept(ModBlocks.BLUE_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_BLUE_DIAMOND_BLOCK.get());
                        output.accept(ModItems.RED_DIAMOND.get());
                        output.accept(ModBlocks.RED_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.COMPRESSED_RED_DIAMOND_BLOCK.get());
                    }).build());
}

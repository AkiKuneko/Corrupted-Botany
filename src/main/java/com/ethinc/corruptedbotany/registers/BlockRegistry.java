package com.ethinc.corruptedbotany.registers;

import com.ethinc.corruptedbotany.CorruptedBotany;
import com.ethinc.corruptedbotany.api.CBCreativeTab;
import com.ethinc.corruptedbotany.blocks.plants.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {




    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CorruptedBotany.MOD_ID);


    public static final RegistryObject<Block> LESSER_SOIL = registerBlock("lesser_soil",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(.5f).sound(SoundType.GRAVEL)), CBCreativeTab.CB_MODE_TAB);

    public static final RegistryObject<Block> CORRUPTED_SOIL = registerBlock("corrupted_soil",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(.5f).sound(SoundType.GRAVEL)), CBCreativeTab.CB_MODE_TAB);

    //plant blocks lesser

    public static final RegistryObject<LesserZombiePlantBlock> LESSER_ZOMBIE_PLANT = registerBlockWithoutBlockItem("lesser_zombie_plant",
            () -> new LesserZombiePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<LesserSkeletonPlantBlock> LESSER_SKELETON_PLANT = registerBlockWithoutBlockItem("lesser_skeleton_plant",
            () -> new LesserSkeletonPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<CorruptedZombiePlantBlock> CORRUPTED_ZOMBIE_PLANT = registerBlockWithoutBlockItem("corrupted_zombie_plant",
            () -> new CorruptedZombiePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<CorruptedSkeletonPlantBlock> CORRUPTED_SKELETON_PLANT = registerBlockWithoutBlockItem("corrupted_skeleton_plant",
            () -> new CorruptedSkeletonPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<CorruptedCreeperPlantBlock> CORRUPTED_CREEPER_PLANT = registerBlockWithoutBlockItem("corrupted_creeper_plant",
            () -> new CorruptedCreeperPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<CorruptedSpiderPlantBlock> CORRUPTED_SPIDER_PLANT = registerBlockWithoutBlockItem("corrupted_spider_plant",
            () -> new CorruptedSpiderPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<LesserCorruptedPlantBlock> LESSER_CORRUPTED_PLANT = registerBlockWithoutBlockItem("lesser_corrupted_plant",
            () -> new LesserCorruptedPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));











    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

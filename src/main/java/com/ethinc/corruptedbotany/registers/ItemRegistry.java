package com.ethinc.corruptedbotany.registers;

import com.ethinc.corruptedbotany.CorruptedBotany;
import com.ethinc.corruptedbotany.api.CBCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CorruptedBotany.MOD_ID);

    //lesser seeds

    public static final RegistryObject<Item> LESSER_ZOMBIE_SEEDS = ITEMS.register("lesser_zombie_seed",
            () -> new ItemNameBlockItem(BlockRegistry.LESSER_ZOMBIE_PLANT.get(),
                    new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> LESSER_SKELETON_SEEDS = ITEMS.register("lesser_skeleton_seed",
            () -> new ItemNameBlockItem(BlockRegistry.LESSER_SKELETON_PLANT.get(),
                    new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    //corrupted seeds

    // greater_corrupted_seeds

    //corrupt_concentrated seeds

    //evil_concentrated seeds


    //essence

    public static final RegistryObject<Item> MINESSENCE = ITEMS.register("minuscule_essence",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> LESSERSSENCE = ITEMS.register("lesser_essence",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> CORRUPTESSENCE = ITEMS.register("corrupted_essence",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> GREATCORRUPTESSENCE = ITEMS.register("greater_corrupted_essence",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> CORRUPTCONCENTRATE = ITEMS.register("corrupt_concentrate",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    public static final RegistryObject<Item> EVILCONCENTRATE = ITEMS.register("evil_concentrate",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));

    // boss seeds/summons

    public static final RegistryObject<Item> CORRUPTED_SEED = ITEMS.register("corrupted_seed",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB).rarity(Rarity.UNCOMMON).stacksTo(1)));


    //other
    public static final RegistryObject<Item> CORRUPTED_BONE_MEAL = ITEMS.register("corrupted_bone_meal",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

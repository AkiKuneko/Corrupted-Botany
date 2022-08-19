package com.ethinc.corruptedbotany.registers;

import com.ethinc.corruptedbotany.CorruptedBotany;
import com.ethinc.corruptedbotany.api.CBCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CorruptedBotany.MOD_ID);

    public static final RegistryObject<Item> MINESSENCE = ITEMS.register("minuscule_essence",
            () -> new Item(new Item.Properties().tab(CBCreativeTab.CB_MODE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

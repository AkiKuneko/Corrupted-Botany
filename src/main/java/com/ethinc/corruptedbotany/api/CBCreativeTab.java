package com.ethinc.corruptedbotany.api;

import com.ethinc.corruptedbotany.registers.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CBCreativeTab {
    public static final CreativeModeTab CB_MODE_TAB = new CreativeModeTab("Corrupted Botany") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.CORRUPTED_SEED.get());
        }
    };
}

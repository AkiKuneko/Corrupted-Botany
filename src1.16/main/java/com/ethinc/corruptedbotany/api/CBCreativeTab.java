package com.ethinc.corruptedbotany.api;

import com.ethinc.corruptedbotany.registers.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CBCreativeTab {
    public static final CreativeModeTab CB_MODE_TAB = new CreativeModeTab("cbmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.LESSER_CORRUPTED_SEED.get());
        }
    };
}

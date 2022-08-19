package com.ethinc.corruptedbotany.api;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CBCreativeTab {
    public static final CreativeModeTab CB_MODE_TAB = new CreativeModeTab("Corrupted Botany") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
}

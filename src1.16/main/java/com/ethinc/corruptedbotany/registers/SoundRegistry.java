package com.ethinc.corruptedbotany.registers;

import com.ethinc.corruptedbotany.CorruptedBotany;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDEVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CorruptedBotany.MOD_ID);

    public static RegistryObject<SoundEvent> MIASMA = registerSoundEvent("miasma_disc_sound");

    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUNDEVENTS.register(name, () -> new SoundEvent(new ResourceLocation(CorruptedBotany.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUNDEVENTS.register(eventBus);
    }
}

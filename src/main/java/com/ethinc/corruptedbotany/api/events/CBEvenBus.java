package com.ethinc.corruptedbotany.api.events;

import com.ethinc.corruptedbotany.CorruptedBotany;
import com.ethinc.corruptedbotany.api.events.lootinjection.MinEssenceInject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CorruptedBotany.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBEvenBus {
    @SubscribeEvent
    public static void registerInjectsSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
    {
        event.getRegistry().registerAll(
                new MinEssenceInject.Serializer().setRegistryName(new ResourceLocation(CorruptedBotany.MOD_ID, "min_ess_inj"))
        );
    }
}

package com.ethinc.corruptedbotany.registers;

import com.ethinc.corruptedbotany.CorruptedBotany;
import com.ethinc.corruptedbotany.entities.LesserSkeletonPlantEntity;
import com.ethinc.corruptedbotany.entities.LesserZombiePlantEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityRegistry {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, CorruptedBotany.MOD_ID);

    public static final RegistryObject<EntityType<LesserZombiePlantEntity>> LESSERZOMBIE = ENTITIES.register("lesser_zombie",
            () -> EntityType.Builder.of(LesserZombiePlantEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.95F)
                    .build(new ResourceLocation(CorruptedBotany.MOD_ID, "lesser_zombie").toString()));

    public static final RegistryObject<EntityType<LesserSkeletonPlantEntity>> LESSERSKELETON = ENTITIES.register("lesser_skeleton",
            () -> EntityType.Builder.of(LesserSkeletonPlantEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.95F)
                    .build(new ResourceLocation(CorruptedBotany.MOD_ID, "lesser_skeleton").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}

package com.eternalive.corruptedbotany.entities.client.renders;

import com.eternalive.corruptedbotany.CorruptedBotany;
import com.eternalive.corruptedbotany.entities.client.model.LesserSkeletonPlantEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class LesserSkeletonPlantEntityRender extends MobRenderer {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(CorruptedBotany.MOD_ID, "textures/entities/lesser_skeleton.png");

    public LesserSkeletonPlantEntityRender(EntityRendererProvider.Context context) {
        super(context, new LesserSkeletonPlantEntityModel<>(context.bakeLayer(LesserSkeletonPlantEntityModel.LAYER_LOCATION)), 0.5F);
    }


    @Override
    public ResourceLocation getTextureLocation(Entity p_114482_) {
        return TEXTURE;
    }
}

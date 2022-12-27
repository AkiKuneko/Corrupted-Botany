package com.eternalive.corruptedbotany.blocks.plants;

import com.ethinc.corruptedbotany.registers.BlockRegistry;
import com.ethinc.corruptedbotany.registers.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;


public class LesserCorruptedPlantBlock extends CropBlock {
        public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

        public LesserCorruptedPlantBlock(Properties properties) {
            super(properties);
        }

        @Override
        public int getMaxAge() {
            return 5;
        }

        @Override
        protected ItemLike getBaseSeedId() {
            return ItemRegistry.LESSER_CORRUPTED_SEED.get();
        }

        @Override
        protected boolean mayPlaceOn(BlockState p_52302_, BlockGetter p_52303_, BlockPos p_52304_) {
            return p_52302_.is(BlockRegistry.LESSER_SOIL.get());
        }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        Skeleton skeleton = new Skeleton(EntityType.SKELETON, level);
            skeleton.setPos(Vec3.atCenterOf(pos));
            //spawns on break if plant is maxed only works in survival
            if(willHarvest){
                level.addFreshEntity(skeleton);

            }


            return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter p_52258_, BlockPos p_52259_, BlockState p_52260_, boolean p_52261_) {
        return false;
    }


}


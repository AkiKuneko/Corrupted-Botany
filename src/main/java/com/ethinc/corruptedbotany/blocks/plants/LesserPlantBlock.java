package com.ethinc.corruptedbotany.blocks.plants;

import com.ethinc.corruptedbotany.registers.BlockRegistry;
import com.ethinc.corruptedbotany.registers.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;


public class LesserPlantBlock extends CropBlock {
        public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

        public LesserPlantBlock(Properties properties) {
            super(properties);
        }

        @Override
        public int getMaxAge() {
            return 5;
        }

        @Override
        protected ItemLike getBaseSeedId() {
            return ItemRegistry.LESSER_ZOMBIE_SEEDS.get();
        }

        @Override
        protected boolean mayPlaceOn(BlockState p_52302_, BlockGetter p_52303_, BlockPos p_52304_) {
            return p_52302_.is(BlockRegistry.LESSER_SOIL.get());
        }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
            Zombie zombie = new Zombie(EntityType.ZOMBIE, level);
            zombie.setPos(Vec3.atCenterOf(pos));
            //spawns on break if plant is maxed only works in survival
            if(willHarvest){
                level.addFreshEntity(zombie);
            }


            return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }
}


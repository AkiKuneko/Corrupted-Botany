package com.ethinc.corruptedbotany.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class CorruptedSeed extends Item {
    public CorruptedSeed(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {

        Level level = p_41427_.getLevel();
        BlockPos blockpos = p_41427_.getClickedPos();
        BlockState blockstate = level.getBlockState(blockpos);



        //why not summoning zombie????
        Zombie zombie = EntityType.ZOMBIE.create(level);
        if(blockstate.is(Blocks.GRASS_BLOCK)){
            System.out.println("grass");
            level.addFreshEntity(zombie);
            return InteractionResult.CONSUME;
        } else {
            System.out.println("nope");
            return InteractionResult.PASS;
        }
    }
}

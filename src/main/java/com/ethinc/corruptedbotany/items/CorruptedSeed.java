package com.ethinc.corruptedbotany.items;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class CorruptedSeed extends Item {
    public CorruptedSeed(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {

        Level level = p_41427_.getLevel();
        BlockPos blockpos = p_41427_.getClickedPos().above();
        BlockState blockstate = level.getBlockState(blockpos);



        //why not summoning zombie????
        Zombie zombie = new Zombie(EntityType.ZOMBIE, level);
        zombie.setPos(Vec3.atCenterOf(blockpos));
        if(blockstate.is(Blocks.GRASS_BLOCK)){
            level.addFreshEntity(zombie);
            level.playSound(blockpos.getX(),blockpos.getY(),blockpos.getY(),SoundEvents.STONE_BREAK, GameRules.Category.MOBS,1,1,1);
            ItemStack itemstack = p_41427_.getItemInHand();
            itemstack.shrink(1);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }
    }
}

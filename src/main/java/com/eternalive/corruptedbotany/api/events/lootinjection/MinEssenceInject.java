package com.eternalive.corruptedbotany.api.events.lootinjection;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

public class MinEssenceInject extends LootModifier {
    private final Item addition;

    protected MinEssenceInject(LootItemCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    /*
    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {

        if(context.getRandom().nextFloat() > 0.0F)
        {
            generatedLoot.add(new ItemStack(addition, context.getRandom().nextInt(2)+1));
        }


        return generatedLoot;
    }
     */

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        return null;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return null;
    }

    /*
    public static class Serializer extends GlobalLootModifierSerializer<MinEssenceInject> {

        @Override
        public MinEssenceInject read(ResourceLocation name, JsonObject object,
                                     LootItemCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(GsonHelper.getAsString(object, "addition")));
            return new MinEssenceInject(conditionsIn, addition);
        }


        @Override
        public JsonObject write(MinEssenceInject instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
     */
}

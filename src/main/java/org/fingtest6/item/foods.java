package org.fingtest6.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class foods {
    public static final FoodProperties SHUILI = new FoodProperties.Builder().nutrition(1).saturationModifier(1.0f).alwaysEdible()
            .effect (() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,600),1.0f).build();
    public static final FoodProperties COOKED_SHUILI = new FoodProperties.Builder().nutrition(3).saturationModifier(4.0f).alwaysEdible()
            .effect (() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,2400),1.0f).build();
}

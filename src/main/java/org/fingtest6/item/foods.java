package org.fingtest6.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.*;
import net.minecraft.world.food.FoodProperties;

public class foods {
    public static final FoodProperties SHUILI = new FoodProperties.Builder().nutrition(1).saturationModifier(1.0f).alwaysEdible().build();
    public static final FoodProperties COOKED_SHUILI = new FoodProperties.Builder().nutrition(3).saturationModifier(4.0f).alwaysEdible().build();
}

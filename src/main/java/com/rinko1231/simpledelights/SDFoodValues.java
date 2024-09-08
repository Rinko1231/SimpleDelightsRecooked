package com.rinko1231.simpledelights;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import vectorwing.farmersdelight.common.registry.ModEffects;



public class SDFoodValues {

    public static final FoodProperties SQUASH_NOODLES = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.6f)
            .build();
    public static final FoodProperties DINO_OATMEAL = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 4800, 0), 1.0F)
            .build();
    public static final FoodProperties JAM_BAR = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 0), 1.0F)
            .build();
    public static final FoodProperties GRANOLA = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(1.2f)
            .build();
    public static final FoodProperties GLAZED_YAM = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 4800, 0), 1.0F)
            .build();
    public static final FoodProperties LETTUCE_WRAP = (new FoodProperties.Builder())
            .nutrition(11).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3000, 0), 1.0F)
            .build();
    public static final FoodProperties STRAWBERRY_SHORTCAKE = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240, 0), 1.0F)
            .build();
    public static final FoodProperties CHOCOLATE_STRAWBERRIES = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.6f)
            .build();
    public static final FoodProperties PLUM_PUDDING = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 0), 1.0F)
            .build();
    public static final FoodProperties PLUM_PORK = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 240, 0), 1.0F)
            .build();
    public static final FoodProperties FRUIT_TART = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F)
            .build();
    public static final FoodProperties CREAMCICLE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0F)
            .build();
    public static final FoodProperties MANGO_HABANERO_WINGS = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1.0F)
            .build();
    public static final FoodProperties SWEET_POTATO_CASSEROLE = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 9600, 0), 1.0F)
            .build();
    public static final FoodProperties STIR_FRY = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 9600, 0), 1.0F)
            .build();
    public static final FoodProperties DUBU_JJIGAE = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 4800, 0), 1.0F)
            .build();
    public static final FoodProperties MAPO_TOFU = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 9600, 0), 1.0F)
            .build();
    public static final FoodProperties CHOLENT = (new FoodProperties.Builder())
            .nutrition(12).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 4800, 0), 1.0F)
            .build();
    public static final FoodProperties BERRY_KOMPOT = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0F)
            .build();
    public static final FoodProperties PEAR_BISQUE = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 4800, 0), 1.0F)
            .build();
    public static final FoodProperties ORANGE_CHICKEN = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 9600, 0), 1.0F)
            .build();
    public static final FoodProperties ORANGE_SORBET = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0),  1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
            .build();
    public static final FoodProperties MANGO_SORBET = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 0),  1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
            .build();
    public static final FoodProperties SUMMER_SALAD = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0),  1.0F)
            .build();

}
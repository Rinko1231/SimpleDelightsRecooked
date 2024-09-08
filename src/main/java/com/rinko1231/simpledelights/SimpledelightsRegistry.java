package com.rinko1231.simpledelights;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Items;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModEffects;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static com.rinko1231.simpledelights.Simpledelights.MODID;

import com.rinko1231.simpledelights.SDFoodValues;

public class SimpledelightsRegistry
{



    //Normal
    public static final DeferredRegister<Item> ITEMS_VANILLA = DeferredRegister.create(ForgeRegistries.ITEMS, Simpledelights.MODID);

    public static final RegistryObject<Item> SQUASH_NOODLES = ITEMS_VANILLA.register("squash_noodles", () -> new Item(new Item.Properties().food(SDFoodValues.SQUASH_NOODLES)));

    public static final RegistryObject<Item> JAM_BAR = ITEMS_VANILLA.register("jam_bar", () -> new Item(new Item.Properties().food(SDFoodValues.JAM_BAR)));
    public static final RegistryObject<Item> GRANOLA = ITEMS_VANILLA.register("granola", () -> new Item(new Item.Properties().food(SDFoodValues.GRANOLA)));
    public static final RegistryObject<Item> GLAZED_YAM = ITEMS_VANILLA.register("glazed_yam", () -> new Item(new Item.Properties().food(SDFoodValues.GLAZED_YAM)));
    public static final RegistryObject<Item> LETTUCE_WRAP = ITEMS_VANILLA.register("lettuce_wrap", () -> new Item(new Item.Properties().food(SDFoodValues.LETTUCE_WRAP)));
    public static final RegistryObject<Item> STRAWBERRY_SHORTCAKE = ITEMS_VANILLA.register("strawberry_shortcake", () -> new Item(new Item.Properties().food(SDFoodValues.STRAWBERRY_SHORTCAKE)));
    public static final RegistryObject<Item> CHOCOLATE_STRAWBERRIES = ITEMS_VANILLA.register("chocolate_strawberries", () -> new Item(new Item.Properties().food(SDFoodValues.CHOCOLATE_STRAWBERRIES)));
    public static final RegistryObject<Item> PLUM_PUDDING = ITEMS_VANILLA.register("plum_pudding", () -> new Item(new Item.Properties().food(SDFoodValues.PLUM_PUDDING)));
    public static final RegistryObject<Item> PLUM_PORK = ITEMS_VANILLA.register("plum_pork", () -> new Item(new Item.Properties().food(SDFoodValues.PLUM_PORK)));
    public static final RegistryObject<Item> FRUIT_TART = ITEMS_VANILLA.register("fruit_tart", () -> new Item(new Item.Properties().food(SDFoodValues.FRUIT_TART)));
    public static final RegistryObject<Item> MANGO_HABANERO_WINGS = ITEMS_VANILLA.register("mango_habanero_wings", () -> new Item(new Item.Properties().food(SDFoodValues.MANGO_HABANERO_WINGS)));
    public static final RegistryObject<Item> CREAMCICLE = ITEMS_VANILLA.register("creamcicle", () -> new StickItem(new Item.Properties().craftRemainder(Items.STICK).food(SDFoodValues.CREAMCICLE)));
    public static final RegistryObject<Item> BERRY_KOMPOT = ITEMS_VANILLA.register("berry_kompot", () -> new EatBottleItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(SDFoodValues.BERRY_KOMPOT)));

    public static final RegistryObject<Item> DINO_OATMEAL = ITEMS_VANILLA.register("dino_oatmeal", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.DINO_OATMEAL)));
    public static final RegistryObject<Item> SWEET_POTATO_CASSEROLE = ITEMS_VANILLA.register("sweet_potato_casserole", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.SWEET_POTATO_CASSEROLE)));
    public static final RegistryObject<Item> STIR_FRY = ITEMS_VANILLA.register("stir_fry", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.STIR_FRY)));
    public static final RegistryObject<Item> DUBU_JJIGAE = ITEMS_VANILLA.register("dubu_jjigae", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.DUBU_JJIGAE)));
    public static final RegistryObject<Item> MAPO_TOFU = ITEMS_VANILLA.register("mapo_tofu", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.MAPO_TOFU)));
    public static final RegistryObject<Item> CHOLENT = ITEMS_VANILLA.register("cholent", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.CHOLENT)));
    public static final RegistryObject<Item> PEAR_BISQUE = ITEMS_VANILLA.register("pear_bisque", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.PEAR_BISQUE)));
    public static final RegistryObject<Item> ORANGE_CHICKEN = ITEMS_VANILLA.register("orange_chicken", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.ORANGE_CHICKEN)));
    public static final RegistryObject<Item> ORANGE_SORBET = ITEMS_VANILLA.register("orange_sorbet", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.ORANGE_SORBET)));
    public static final RegistryObject<Item> MANGO_SORBET = ITEMS_VANILLA.register("mango_sorbet", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.MANGO_SORBET)));
    public static final RegistryObject<Item> SUMMER_SALAD = ITEMS_VANILLA.register("summer_salad", () -> new BowlFoodItem(new Item.Properties().stacksTo(16).craftRemainder(Items.BOWL).food(SDFoodValues.SUMMER_SALAD)));
}
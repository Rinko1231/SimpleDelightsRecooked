package com.rinko1231.simpledelights;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.rinko1231.simpledelights.SimpledelightsRegistry;

@Mod("simpledelights")
public class Simpledelights
{
    public static final String MODID = "simpledelights";


    public Simpledelights()
    {
        final var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SimpledelightsRegistry.ITEMS_VANILLA.register(eventBus);
        TabInit.TABS.register(eventBus);
    }
}
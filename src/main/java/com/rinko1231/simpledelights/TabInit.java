package com.rinko1231.simpledelights;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Simpledelights.MODID);

    public static final RegistryObject<CreativeModeTab> SIMPLEDELIGHTS_TAB = TABS.register(Simpledelights.MODID, () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("item_group." + Simpledelights.MODID))
            // Set icon of creative tab
            .icon(() -> new ItemStack(SimpledelightsRegistry.CREAMCICLE.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                SimpledelightsRegistry.ITEMS_VANILLA.getEntries().forEach(it -> output.accept(it.get()));
            })
            .build()
    );
}
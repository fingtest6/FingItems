package org.fingtest6;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.fingtest6.item.items;

import java.util.function.Supplier;

public class STCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, fingstzritems.MODID);
    public static final Supplier<CreativeModeTab> ST_TAB =
            CREATIVE_MODE_TABS.register("shenting_tab",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(items.SHUILI.get()))
                    .title(Component.translatable("itemGroup.shenting_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(items.SHUILI.get());
                        output.accept(items.COOKED_SHUILI.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

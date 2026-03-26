package org.fingtest6.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.fingtest6.fingstzritems;

public class items  {
    public static final String MODID = fingstzritems.MODID;
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> SHUILI = ITEMS.registerSimpleItem("shuili", () -> new Item.Properties().food(foods.SHUILI,FingConsumables.SHUILI));
    public static final DeferredItem<Item> COOKED_SHUILI = ITEMS.registerSimpleItem("cooked_shuili", () -> new Item.Properties().food(foods.COOKED_SHUILI,FingConsumables.COOKED_SHUILI));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
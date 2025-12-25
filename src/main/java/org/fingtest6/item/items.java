package org.fingtest6.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.fingtest6.fingstzritems;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class items  {
    public static final String MODID = fingstzritems.MODID;
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item>SHUILI = ITEMS.register("shuili", () -> new CurioItem(new Item.Properties().food(foods.SHUILI)));
    public static final DeferredItem<Item>COOKED_SHUILI = ITEMS.register("cooked_shuili", () -> new Item(new Item.Properties().food(foods.COOKED_SHUILI)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
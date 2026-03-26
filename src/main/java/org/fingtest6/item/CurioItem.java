package org.fingtest6.item;
/*
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import top.theillusivec4.curios.api.SlotContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class CurioItem extends Item implements ICurioItem {
    public CurioItem(Properties properties) {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        // 当饰品被装备时，每一游戏刻（tick）都会调用此方法
        // 可在此执行逻辑，例如恢复生命、施加效果等
        if (slotContext.entity().level().isClientSide()) {
            return;
        }

        if (slotContext.entity() instanceof Player player) {
            RandomSource random = player.getRandom();
            // 每 tick 有 1/20 概率（即平均每 10 秒一次）触发效果
            if (random.nextInt(20) == 0) {
                player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0)); // 持续 10 秒
            }
        }
    }
}
*/
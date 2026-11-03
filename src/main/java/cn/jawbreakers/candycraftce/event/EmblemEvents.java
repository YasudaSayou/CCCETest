package cn.jawbreakers.candycraftce.event;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.init.CItems;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingFallEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

@EventBusSubscriber(modid = CandyCraftCE.MOD_ID)
public class EmblemEvents {

	@SubscribeEvent
	public static void reduceFallDamage(LivingFallEvent event) {
		if (event.getEntity() instanceof Player player && player.getInventory().contains(stack -> stack.is(CItems.JELLY_EMBLEM.get()))) {
			event.setDamageMultiplier(event.getDamageMultiplier() * 0.7F);
		}
	}

	@SubscribeEvent
	public static void reduceProjectileDamage(LivingIncomingDamageEvent event) {
		if (event.getEntity() instanceof Player player && event.getSource().is(DamageTypeTags.IS_PROJECTILE) && player.getInventory().contains(stack -> stack.is(CItems.SUGUARD_EMBLEM.get()))) {
			event.setAmount(event.getAmount() * 0.8F);
		}
	}
}
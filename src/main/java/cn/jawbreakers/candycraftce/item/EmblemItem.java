package cn.jawbreakers.candycraftce.item;

import cn.jawbreakers.candycraftce.init.CItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class EmblemItem extends Item {
	private final String name;

	public EmblemItem(String name, Properties properties) {
		super(properties);
		this.name=name;
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean held) {
		if (!level.isClientSide && entity instanceof LivingEntity living) {
			if ((stack.is(CItems.CRANBERRY_EMBLEM.get()) && level.isDay()) || (stack.is(CItems.NESSIE_EMBLEM.get()) && living.isInWater())) {
				living.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 5, 0, false, false, false));
			}
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flags) {
		tooltip.add(Component.translatable("tooltip.candycraftce." + name).withStyle(ChatFormatting.AQUA));
		tooltip.add(Component.translatable("tooltip.candycraftce.emblem").withStyle(ChatFormatting.GREEN));
	}
}
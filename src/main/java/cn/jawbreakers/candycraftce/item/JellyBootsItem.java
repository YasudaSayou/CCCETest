package cn.jawbreakers.candycraftce.item;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class JellyBootsItem extends ArmorItem {
	public JellyBootsItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
		super(material, type, properties);
	}

	@Override
	public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean held) {
		if (!level.isClientSide && entity instanceof LivingEntity living && slot == 36) {
			living.resetFallDistance();
		}
	}

	@Override
	public boolean isValidRepairItem(ItemStack stack, ItemStack repairCandidate) {
		return repairCandidate.is(CBlocks.JELLY_SHOCK_ABSORBER.get().asItem());
	}
}
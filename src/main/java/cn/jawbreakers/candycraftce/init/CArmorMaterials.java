package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;

public class CArmorMaterials {

	public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LICORICE = ARMOR_MATERIALS.register("licorice", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 1);
		map.put(ArmorItem.Type.LEGGINGS, 4);
		map.put(ArmorItem.Type.CHESTPLATE, 5);
		map.put(ArmorItem.Type.HELMET, 2);
		map.put(ArmorItem.Type.BODY, 4);
	}), 12, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(CItems.LICORICE), List.of(new ArmorMaterial.Layer(CandyCraftCE.prefix("licorice"))), 0.0F, 0.0F));

	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HONEYCOMB = ARMOR_MATERIALS.register("honeycomb", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 2);
		map.put(ArmorItem.Type.LEGGINGS, 5);
		map.put(ArmorItem.Type.CHESTPLATE, 6);
		map.put(ArmorItem.Type.HELMET, 2);
		map.put(ArmorItem.Type.BODY, 5);
	}), 9, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(CItems.HONEYCOMB), List.of(new ArmorMaterial.Layer(CandyCraftCE.prefix("honeycomb"))), 0.0F, 0.0F));

	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PEZ = ARMOR_MATERIALS.register("pez", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 3);
		map.put(ArmorItem.Type.LEGGINGS, 6);
		map.put(ArmorItem.Type.CHESTPLATE, 8);
		map.put(ArmorItem.Type.HELMET, 3);
		map.put(ArmorItem.Type.BODY, 11);
	}), 10, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(CItems.PEZ), List.of(new ArmorMaterial.Layer(CandyCraftCE.prefix("pez"))), 2.0F, 0.0F));

	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> JELLY = ARMOR_MATERIALS.register("jelly", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 4);
		map.put(ArmorItem.Type.LEGGINGS, 7);
		map.put(ArmorItem.Type.CHESTPLATE, 9);
		map.put(ArmorItem.Type.HELMET, 4);
		map.put(ArmorItem.Type.BODY, 13);
	}), 10, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.EMPTY, List.of(new ArmorMaterial.Layer(CandyCraftCE.prefix("jelly"))), 1.5F, 0.0F));

	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> WATER_MASK = ARMOR_MATERIALS.register("water_mask", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
		map.put(ArmorItem.Type.BOOTS, 2);
		map.put(ArmorItem.Type.LEGGINGS, 5);
		map.put(ArmorItem.Type.CHESTPLATE, 6);
		map.put(ArmorItem.Type.HELMET, 2);
		map.put(ArmorItem.Type.BODY, 5);
	}), 9, SoundEvents.ARMOR_EQUIP_TURTLE, () -> Ingredient.of(CItems.CRANFISH_SCALE), List.of(new ArmorMaterial.Layer(CandyCraftCE.prefix("water_mask"))), 0.0F, 0.0F));
}
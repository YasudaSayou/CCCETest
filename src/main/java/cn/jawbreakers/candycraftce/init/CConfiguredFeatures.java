package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class CConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> CHOCOLATE_TREE = registerKey("chocolate_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CHOCOLATE_FANCY_TREE = registerKey("chocolate_fancy_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHOCOLATE_TREE = registerKey("white_chocolate_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHOCOLATE_FANCY_TREE = registerKey("white_chocolate_fancy_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CARAMEL_TREE = registerKey("caramel_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CARAMEL_FANCY_TREE = registerKey("caramel_fancy_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MAGICAL_TREE = registerKey("magical_tree");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CANDIED_CHERRY_TREE = registerKey("candied_cherry_tree");

	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, CandyCraftCE.prefix(name));
	}
}
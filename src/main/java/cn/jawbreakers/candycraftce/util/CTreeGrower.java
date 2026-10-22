package cn.jawbreakers.candycraftce.util;

import cn.jawbreakers.candycraftce.init.CConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class CTreeGrower {
	public static final TreeGrower CHOCOLATE = new TreeGrower("chocolate", 0.1F, Optional.empty(), Optional.empty(), Optional.of(CConfiguredFeatures.CHOCOLATE_TREE), Optional.of(CConfiguredFeatures.CHOCOLATE_FANCY_TREE), Optional.empty(), Optional.empty());
	public static final TreeGrower WHITE_CHOCOLATE = new TreeGrower("white_chocolate", Optional.empty(), Optional.of(CConfiguredFeatures.WHITE_CHOCOLATE_TREE), Optional.empty());
	public static final TreeGrower CARAMEL = new TreeGrower("caramel", Optional.empty(), Optional.of(CConfiguredFeatures.CARAMEL_TREE), Optional.empty());
	public static final TreeGrower CANDIED_CHERRY = new TreeGrower("candied_cherry", Optional.empty(), Optional.of(CConfiguredFeatures.CANDIED_CHERRY_TREE), Optional.empty());
}
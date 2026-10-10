package cn.breadnicecat.candycraftce.init;

import cn.breadnicecat.candycraftce.CandyCraftCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CSounds {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<SoundEvent, SoundEvent> CD_O = register("cd-o");
	public static final DeferredHolder<SoundEvent, SoundEvent> CD_1 = register("cd-1");
	public static final DeferredHolder<SoundEvent, SoundEvent> CD_2 = register("cd-2");
	public static final DeferredHolder<SoundEvent, SoundEvent> CD_3 = register("cd-3");
	public static final DeferredHolder<SoundEvent, SoundEvent> CD_4 = register("cd-4");

	public static final DeferredHolder<SoundEvent, SoundEvent> JELLY_BREAK = register("jelly_break");
	public static final DeferredHolder<SoundEvent, SoundEvent> JELLY_STEP = register("jelly_step");
	public static final DeferredHolder<SoundEvent, SoundEvent> JELLY_PLACE = register("jelly_place");
	public static final DeferredHolder<SoundEvent, SoundEvent> JELLY_HIT = register("jelly_hit");
	public static final DeferredHolder<SoundEvent, SoundEvent> JELLY_FALL = register("jelly_fall");

	private static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
		return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(CandyCraftCE.prefix(name)));
	}
}
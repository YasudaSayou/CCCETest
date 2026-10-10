package cn.breadnicecat.candycraftce.init;

import cn.breadnicecat.candycraftce.CandyCraftCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.JukeboxSong;

public class CJukeboxSongs {
	public static final ResourceKey<JukeboxSong> CD_o = registerKey("cd_o");
	public static final ResourceKey<JukeboxSong> CD_1 = registerKey("cd_1");
	public static final ResourceKey<JukeboxSong> CD_2 = registerKey("cd_2");
	public static final ResourceKey<JukeboxSong> CD_3 = registerKey("cd_3");
	public static final ResourceKey<JukeboxSong> CD_4 = registerKey("cd_4");

	private static ResourceKey<JukeboxSong> registerKey(String name) {
		return ResourceKey.create(Registries.JUKEBOX_SONG, CandyCraftCE.prefix(name));
	}
}
package cn.jawbreakers.candycraftce.init;

import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class CFluidType extends FluidType {
	private final ResourceLocation stillTexture;
	private final ResourceLocation flowingTexture;
	private final ResourceLocation overlayTexture;
	private final Vector3f fogColor;

	public CFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, ResourceLocation overlayTexture, Vector3f fogColor) {
		super(properties);
		this.stillTexture = stillTexture;
		this.flowingTexture = flowingTexture;
		this.overlayTexture = overlayTexture;
		this.fogColor = fogColor;
	}

	public IClientFluidTypeExtensions getClientExtensions() {
		return new IClientFluidTypeExtensions() {
			@Override
			public ResourceLocation getStillTexture() {
				return stillTexture;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return flowingTexture;
			}

			@Override
			public @Nullable ResourceLocation getOverlayTexture() {
				return overlayTexture;
			}

			@Override
			public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
				return fogColor;
			}
		};
	}
}
package io.rudyon.crystalcore.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.quiltmc.loader.api.ModContainer;

public class CrystalCoreWorldGen {
	public static final RegistryKey<PlacedFeature> FLUXIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("crystalcore","fluxium_ore"));

	public static void register(ModContainer mod) {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, FLUXIUM_ORE_PLACED_KEY);
	}
}

package io.rudyon.crystalcore;

import io.rudyon.crystalcore.blocks.CrystalCoreBlockEntityTypes;
import io.rudyon.crystalcore.blocks.CrystalCoreBlocks;
import io.rudyon.crystalcore.items.CrystalCoreItems;
import io.rudyon.crystalcore.worldgen.CrystalCoreWorldGen;
import net.fabricmc.api.ModInitializer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.ModMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalCore implements ModInitializer {
	public static final String MOD_ID = "crystalcore";
	public static final Logger LOGGER = LoggerFactory.getLogger("CrystalCore");

	@Override
	public void onInitialize() {
		// Get the mod container and metadata using QuiltLoader
		ModContainer mod = QuiltLoader.getModContainer("crystalcore").orElseThrow();
		ModMetadata metadata = mod.metadata();

		LOGGER.info("Hello Quilt world from {}!", metadata.name());
		CrystalCoreItems.register(mod);
		CrystalCoreBlocks.register(mod);
		CrystalCoreBlockEntityTypes.register(mod);
		CrystalCoreWorldGen.register(mod);
	}
}

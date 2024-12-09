package io.rudyon.crystalcore;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class CrystalCoreBlocks {
	public static final Block FLUXIUM_ORE = new Block(FabricBlockSettings.create()
		.sounds(BlockSoundGroup.AMETHYST_BLOCK)
		.strength(4f)
		.requiresTool());

	public static void register(ModContainer mod) {
		Registry.register(
			Registries.BLOCK,
			new Identifier(mod.metadata().id(), "fluxium_ore"), // Use two arguments
			FLUXIUM_ORE
		);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "fluxium_ore"), new BlockItem(FLUXIUM_ORE, new Item.Settings()));

		ItemGroupEvents.modifyEntriesEvent(CrystalCoreItems.CRYSTAL_CORE_TAB).register(entries -> {
			entries.addItem(FLUXIUM_ORE.asItem());
		});

	}
}

package io.rudyon.crystalcore.blocks;

import io.rudyon.crystalcore.items.CrystalCoreItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class CrystalCoreBlocks {
	public static final Block FLUXIUM_ORE = new Block(FabricBlockSettings.create()
		.sounds(BlockSoundGroup.AMETHYST_BLOCK)
		.strength(5f, 6f)
		.toolRequired()
	);

	public static final Block BASIC_CHEMISTRY_LAB = new Block(FabricBlockSettings.create()
		.sounds(BlockSoundGroup.METAL)
	);

	public static void register(ModContainer mod) {
		Registry.register(
			Registries.BLOCK,
			new Identifier(mod.metadata().id(), "fluxium_ore"), // Use two arguments
			FLUXIUM_ORE
		);

		Registry.register(
			Registries.BLOCK,
			new Identifier(mod.metadata().id(), "basic_chemistry_lab"), // Use two arguments
			BASIC_CHEMISTRY_LAB
		);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "fluxium_ore"), new BlockItem(FLUXIUM_ORE, new Item.Settings()));
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "basic_chemistry_lab"), new BlockItem(BASIC_CHEMISTRY_LAB, new Item.Settings()));


		ItemGroupEvents.modifyEntriesEvent(CrystalCoreItems.CRYSTAL_CORE_TAB).register(entries -> {
			entries.addItem(FLUXIUM_ORE.asItem());
			entries.addItem(BASIC_CHEMISTRY_LAB.asItem());
		});
	}
}

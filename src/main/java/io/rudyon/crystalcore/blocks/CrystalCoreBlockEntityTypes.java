package io.rudyon.crystalcore.blocks;

import io.rudyon.crystalcore.items.CrystalCoreItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class CrystalCoreBlockEntityTypes {
	public static <T extends BlockEntityType<?>> T register(String path, T blockEntityType) {
		return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier("crystalcore", path), blockEntityType);
	}

	public static final BlockEntityType<BasicChemistryLabBlockEntity> BASIC_CHEMISTRY_LAB_BLOCK_ENTITY = register(
		"basic_chemistry_lab",
		FabricBlockEntityTypeBuilder.create(BasicChemistryLabBlockEntity::new, CrystalCoreBlocks.BASIC_CHEMISTRY_LAB).build()
	);

	public static void register(ModContainer mod) {
	}
}

package io.rudyon.crystalcore.items;

import io.rudyon.crystalcore.CrystalCore;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

public class CrystalCoreItems {
	public static final RegistryKey<ItemGroup> CRYSTAL_CORE_TAB = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(CrystalCore.MOD_ID, "item_group"));

	public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(CrystalCoreItems.FLUXIUM))  // Set the icon for the tab
		.name(Text.translatable("itemGroup." + CrystalCore.MOD_ID + ".crystal_core_tab"))  // Set the display name for the item group
		.build();

	public static final Item FLUXIUM = new Item(new Item.Settings());
	public static final Item BIOPOLYMER = new Item(new Item.Settings());
	public static final Item STEEL = new Item(new Item.Settings());


	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM_GROUP, CRYSTAL_CORE_TAB, CUSTOM_ITEM_GROUP);

		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "fluxium"), FLUXIUM);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "biopolymer"), BIOPOLYMER);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "steel"), STEEL);

		ItemGroupEvents.modifyEntriesEvent(CRYSTAL_CORE_TAB).register(entries -> {
			entries.addItem(FLUXIUM);
			entries.addItem(BIOPOLYMER);
			entries.addItem(STEEL);
		});
	}
}

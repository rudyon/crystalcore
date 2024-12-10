package io.rudyon.crystalcore.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BasicChemistryLabBlockEntity extends BlockEntity {
	public BasicChemistryLabBlockEntity(BlockPos pos, BlockState state) {
		super(CrystalCoreBlockEntityTypes.BASIC_CHEMISTRY_LAB_BLOCK_ENTITY, pos, state);
	}
}

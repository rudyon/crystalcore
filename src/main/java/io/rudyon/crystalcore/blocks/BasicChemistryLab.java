package io.rudyon.crystalcore.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class BasicChemistryLab extends BlockWithEntity {
	public BasicChemistryLab(Settings settings) {
		super(settings);
	}

	@Override
	protected MapCodec<? extends BasicChemistryLab> getCodec() {
		return createCodec(BasicChemistryLab::new);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new BasicChemistryLabBlockEntity(pos, state);
	}

	@Override
	protected BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

}

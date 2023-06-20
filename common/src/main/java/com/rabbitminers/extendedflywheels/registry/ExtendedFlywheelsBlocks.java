package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.content.kinetics.flywheel.FlywheelBlock;
import com.simibubi.create.foundation.data.*;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

public class ExtendedFlywheelsBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedFlywheels.MOD_ID);

	public static <B extends FlywheelBlock, P> NonNullUnaryOperator<BlockBuilder<B, P>> flywheelTransformer() {
		return b -> b.initialProperties(SharedProperties::softMetal)
				.properties(p -> p.color(MaterialColor.TERRACOTTA_YELLOW))
				.properties(BlockBehaviour.Properties::noOcclusion)
				.transform(TagGen.axeOrPickaxe())
				.transform(BlockStressDefaults.setNoImpact())
				.blockstate(BlockStateGen.axisBlockProvider(true))
				.item()
				.transform(ModelGen.customItemModel());
	}


	public static void init() {
		ExtendedFlywheels.LOGGER.info("Registering blocks for " + ExtendedFlywheels.NAME);
	}
}

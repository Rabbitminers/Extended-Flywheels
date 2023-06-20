package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;

import com.simibubi.create.foundation.data.*;
import com.tterrag.registrate.builders.BlockBuilder;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

public class ExtendedFlywheelsBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedFlywheels.MOD_ID);


	public static void init() {
		ExtendedFlywheels.LOGGER.info("Registering blocks for " + ExtendedFlywheels.NAME);
	}
}

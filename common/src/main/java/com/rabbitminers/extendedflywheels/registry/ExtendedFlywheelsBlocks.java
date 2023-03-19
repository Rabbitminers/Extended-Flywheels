package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class ExtendedFlywheelsBlocks {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedFlywheels.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

	public static void init() {
		// load the class and register everything
		ExtendedFlywheels.LOGGER.info("Registering blocks for " + ExtendedFlywheels.NAME);
	}
}

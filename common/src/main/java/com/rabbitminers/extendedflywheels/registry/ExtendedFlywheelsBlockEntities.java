package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.flywheels.wooden.WoodenFlywheelBlockEntity;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;


public class ExtendedFlywheelsBlockEntities {
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate();

    public static final BlockEntityEntry<WoodenFlywheelBlockEntity> WOODEN_FLYWHEEL = REGISTRATE
            .blockEntity("wooden_flywheel", WoodenFlywheelBlockEntity::new)
            .register();

    // This has no added functionallity but prevents old tile entities breaking
    public static void init() {

    }
}

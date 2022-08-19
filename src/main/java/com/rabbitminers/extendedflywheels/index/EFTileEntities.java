package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.simibubi.create.Create;
import com.simibubi.create.content.contraptions.components.flywheel.FlyWheelInstance;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelRenderer;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelTileEntity;
import com.simibubi.create.foundation.block.ITE;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;

public class EFTileEntities {
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate();

    public static final BlockEntityEntry<FlywheelTileEntity> FLYWHEEL = Create.registrate()
            .tileEntity("flywheel", FlywheelTileEntity::new)
            .instance(() -> FlyWheelInstance::new, false)
            .validBlocks(EFBlocks.FLYWHEEL)
            .renderer(() -> FlywheelRenderer::new)
            .register();

    public static void register() {}
}

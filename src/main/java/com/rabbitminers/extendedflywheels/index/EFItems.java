package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;

public class EFItems {

    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate()
            .creativeModeTab(() -> ExtendedFlywheels.itemGroup);

    public static void register(IEventBus eventBus) {

    }
}

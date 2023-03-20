package com.rabbitminers.extendedflywheels;

import com.rabbitminers.extendedflywheels.registry.ExtendedFlywheelsBlocks;
import com.rabbitminers.extendedflywheels.registry.ExtendedFlywheelsItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedFlywheels {
    public static final String MOD_ID = "extendedflywheels";
    public static final String NAME = "Extended Flywheels";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedFlywheels.MOD_ID)
            .creativeModeTab(() -> ExtendedFlywheelsItems.itemGroup);

    public static void init() {
        ExtendedFlywheelsBlocks.init();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    @ExpectPlatform
    public static int getNextAvailableTabId() {
        throw new AssertionError();
    }
}

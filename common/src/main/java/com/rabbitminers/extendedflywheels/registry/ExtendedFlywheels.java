package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheelsBlocks;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedFlywheels {
    public static final String MOD_ID = "extendedflywheels";
    public static final String NAME = "Extended Flywheels";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
        ExtendedFlywheelsBlocks.init();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}

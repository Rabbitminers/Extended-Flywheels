package com.rabbitminers.extendedflywheels.fabric;

import com.rabbitminers.extendedflywheels.registry.ExtendedFlywheelsBlocks;
import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.fabricmc.api.ModInitializer;

public class ExtendedFlywheelsImpl implements ModInitializer {
    @Override
    public void onInitialize() {
        ExtendedFlywheels.init();
        ExtendedFlywheels.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), ExtendedFlywheels.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExtendedFlywheelsBlocks.REGISTRATE.register();
    }

    public static int getNextAvailableTabId() {
        return ItemGroupUtil.expandArrayAndGetId();
    }
}

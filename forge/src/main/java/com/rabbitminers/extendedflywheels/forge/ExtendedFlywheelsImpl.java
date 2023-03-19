package com.rabbitminers.extendedflywheels.forge;

import com.rabbitminers.extendedflywheels.ExtendedFlywheelsBlocks;
import com.rabbitminers.extendedflywheels.registry.ExtendedFlywheels;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtendedFlywheels.MOD_ID)
public class ExtendedFlywheelsImpl {
    public ExtendedFlywheelsImpl() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExtendedFlywheelsBlocks.REGISTRATE.registerEventListeners(eventBus);
        ExtendedFlywheels.init();
    }
}

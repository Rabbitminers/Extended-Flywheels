package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.simibubi.create.AllBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ExtendedFlywheelsItems {
    public static final CreativeModeTab itemGroup = new CreativeModeTab(ExtendedFlywheels.getNextAvailableTabId(), ExtendedFlywheels.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return AllBlocks.FLYWHEEL.asStack();
        }
    };

    public static void init() {

    }
}

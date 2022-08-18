package com.rabbitminers.extendedflywheels.config;

import com.simibubi.create.foundation.utility.animation.Force;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;

public class EFCommonValues {

    public static  final  ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec.IntValue FLYWHEEL_STRESS;

    static {
        FLYWHEEL_STRESS = COMMON_BUILDER
                .comment("Max Stress Impact of the machine (while running at 256rpm)\n Default value: 2048")
                .defineInRange("stress", 2048, 0, Integer.MAX_VALUE);
    }
}

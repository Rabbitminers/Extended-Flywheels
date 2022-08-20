package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.wheel.WheelInstance;
import com.rabbitminers.extendedflywheels.wheel.WheelRenderer;
import com.rabbitminers.extendedflywheels.wheel.WheelTileEntity;
import com.simibubi.create.Create;
import com.simibubi.create.content.contraptions.components.flywheel.FlyWheelInstance;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelRenderer;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelTileEntity;
import com.simibubi.create.foundation.block.ITE;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.entry.BlockEntityEntry;

public class EFTileEntities {
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate();

    // TEST IMPLEMENTATION TODO: REMOVE

    public static final BlockEntityEntry<FlywheelTileEntity> FLYWHEEL = REGISTRATE
            .tileEntity("wheel", FlywheelTileEntity::new)
            .instance(() -> FlyWheelInstance::new, false)
            .validBlocks(EFBlocks.FLYWHEEL)
            .renderer(() -> FlywheelRenderer::new)
            .register();

    // Naming Convention: [COLOUR][MATERIAL]WHEEL
    // Brass Flywheels

    // Default
    public static final BlockEntityEntry<WheelTileEntity> WHEEL = REGISTRATE
            .tileEntity("flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Dyed

    public static final BlockEntityEntry<WheelTileEntity> BLACKBRASSWHEEL = REGISTRATE
            .tileEntity("black_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLACKBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GRAYBRASSWHEEL = REGISTRATE
            .tileEntity("gray_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GRAYBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_GRAYBRASSWHEEL = REGISTRATE
            .tileEntity("light_gray_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_GRAYBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> WHITEBRASSWHEEL = REGISTRATE
            .tileEntity("white_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHITEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> REDBRASSWHEEL = REGISTRATE
            .tileEntity("red_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.REDBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> ORANGEBRASSWHEEL = REGISTRATE
            .tileEntity("orange_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ORANGEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> YELLOWBRASSWHEEL = REGISTRATE
            .tileEntity("yellow_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.YELLOWBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIMEBRASSWHEEL = REGISTRATE
            .tileEntity("lime_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIMEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GREENBRASSWHEEL = REGISTRATE
            .tileEntity("green_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GREENBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> CYANBRASSWHEEL = REGISTRATE
            .tileEntity("cyan_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CYANBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_BLUEBRASSWHEEL = REGISTRATE
            .tileEntity("light_blue_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_BLUEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> BLUEBRASSWHEEL = REGISTRATE
            .tileEntity("blue_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLUEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> MAGENTABRASSWHEEL = REGISTRATE
            .tileEntity("magenta_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.MAGENTABRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PURPLEBRASSWHEEL = REGISTRATE
            .tileEntity("purple_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PURPLEBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PINKBRASSWHEEL = REGISTRATE
            .tileEntity("pink_brass_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PINKBRASSWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Steel Flywheels

    // Default
    public static final BlockEntityEntry<WheelTileEntity> STEELWHEEL = REGISTRATE
            .tileEntity("steelflywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.STEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();

    // Dyed

    public static final BlockEntityEntry<WheelTileEntity> BLACKSTEELWHEEL = REGISTRATE
            .tileEntity("black_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLACKSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GRAYSTEELWHEEL = REGISTRATE
            .tileEntity("gray_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GRAYSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_GRAYSTEELWHEEL = REGISTRATE
            .tileEntity("light_gray_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_GRAYSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> WHITESTEELWHEEL = REGISTRATE
            .tileEntity("white_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.WHITESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> REDSTEELWHEEL = REGISTRATE
            .tileEntity("red_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.REDSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> ORANGESTEELWHEEL = REGISTRATE
            .tileEntity("orange_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.ORANGESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> YELLOWSTEELWHEEL = REGISTRATE
            .tileEntity("yellow_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.YELLOWSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIMESTEELWHEEL = REGISTRATE
            .tileEntity("lime_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIMESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> GREENSTEELWHEEL = REGISTRATE
            .tileEntity("green_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.GREENSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> CYANSTEELWHEEL = REGISTRATE
            .tileEntity("cyan_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.CYANSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> LIGHT_BLUESTEELWHEEL = REGISTRATE
            .tileEntity("light_blue_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.LIGHT_BLUESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> BLUESTEELWHEEL = REGISTRATE
            .tileEntity("blue_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.BLUESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> MAGENTASTEELWHEEL = REGISTRATE
            .tileEntity("magenta_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.MAGENTASTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PURPLESTEELWHEEL = REGISTRATE
            .tileEntity("purple_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PURPLESTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();



    public static final BlockEntityEntry<WheelTileEntity> PINKSTEELWHEEL = REGISTRATE
            .tileEntity("pink_steel_flywheel", WheelTileEntity::new)
            .instance(() -> WheelInstance::new, false)
            .validBlocks(EFBlocks.PINKSTEELWHEEL)
            .renderer(() -> WheelRenderer::new)
            .register();




    public static void register() {}
}

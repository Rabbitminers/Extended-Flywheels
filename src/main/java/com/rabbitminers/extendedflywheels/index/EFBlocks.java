package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.wheel.CarriageVisualRotationMovementBehaviour;
import com.rabbitminers.extendedflywheels.wheel.WheelBlock;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelBlock;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Objects;

import static com.simibubi.create.AllMovementBehaviours.movementBehaviour;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class EFBlocks {


    // Factory
    public static BlockEntry<WheelBlock> FlywheelRegistrateFactory(
            String id, // Block id
            String colour, //
            String material
    ) {
        return REGISTRATE.block(id, p -> FlywheelTypeParser(material, colour, p))
                .initialProperties(Objects.equals(material, "wood") ?  SharedProperties::wooden : SharedProperties::softMetal)
                .properties(BlockBehaviour.Properties::noOcclusion) // Fix shadow issues
                .blockstate(BlockStateGen.axisBlockProvider(true)) // Directions
                .transform(BlockStressDefaults.setNoImpact())
                .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                .item()
                .transform(customItemModel())
                .register();
    }

    public static WheelBlock FlywheelTypeParser(String material, String colour, BlockBehaviour.Properties p) {
        switch (material) {
            case "brass": return WheelBlock.brass(colour, p);
            case "steel": return WheelBlock.steel(colour, p);
            case "iron": return WheelBlock.iron(colour, p);
            case "wood": return WheelBlock.wood(colour, p);
            default: return WheelBlock.large(colour, p); // Fallback or if none are found
        }
    }


    // Custom tool requirements
    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> axeOrPickAxe() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_AXE).tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> pickaxeOnly() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    // Derive registrate from create
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate().creativeModeTab(
                    () -> ExtendedFlywheels.itemGroup
            );

    // Naming Convention: [COLOUR][MATERIAL]WHEEL
    // Brass Flywheels

    // Default - This exists as a replacement to the 'vanilla flywheel' as it is able to rotate on a train

    public static final BlockEntry<WheelBlock> FLYWHEEL =
            FlywheelRegistrateFactory("flywheel", "none", "brass");
    public static final BlockEntry<WheelBlock> OAKWHEEL =
            FlywheelRegistrateFactory("oak_flywheel", "oak", "wood");

    // Dyed


    public static final BlockEntry<WheelBlock> BLACKBRASSWHEEL =
            REGISTRATE.block("black_brass_flywheel", p -> WheelBlock.brass("black", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GRAYBRASSWHEEL =
            REGISTRATE.block("gray_brass_flywheel", p -> WheelBlock.brass("gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_GRAYBRASSWHEEL =
            REGISTRATE.block("light_gray_brass_flywheel", p -> WheelBlock.brass("light_gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> WHITEBRASSWHEEL =
            REGISTRATE.block("white_brass_flywheel", p -> WheelBlock.brass("white", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> REDBRASSWHEEL =
            REGISTRATE.block("red_brass_flywheel", p -> WheelBlock.brass("red", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> ORANGEBRASSWHEEL =
            REGISTRATE.block("orange_brass_flywheel", p -> WheelBlock.brass("orange", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> YELLOWBRASSWHEEL =
            REGISTRATE.block("yellow_brass_flywheel", p -> WheelBlock.brass("yellow", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIMEBRASSWHEEL =
            REGISTRATE.block("lime_brass_flywheel", p -> WheelBlock.brass("lime", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GREENBRASSWHEEL =
            REGISTRATE.block("green_brass_flywheel", p -> WheelBlock.brass("green", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> CYANBRASSWHEEL =
            REGISTRATE.block("cyan_brass_flywheel", p -> WheelBlock.brass("cyan", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_BLUEBRASSWHEEL =
            REGISTRATE.block("light_blue_brass_flywheel", p -> WheelBlock.brass("light_blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> BLUEBRASSWHEEL =
            REGISTRATE.block("blue_brass_flywheel", p -> WheelBlock.brass("blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> MAGENTABRASSWHEEL =
            REGISTRATE.block("magenta_brass_flywheel", p -> WheelBlock.brass("magenta", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PURPLEBRASSWHEEL =
            REGISTRATE.block("purple_brass_flywheel", p -> WheelBlock.brass("purple", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PINKBRASSWHEEL =
            REGISTRATE.block("pink_brass_flywheel", p -> WheelBlock.brass("pink", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();


    // Steel Flywheels

    // Default
    public static final BlockEntry<WheelBlock> STEELWHEEL =
            REGISTRATE.block("steelflywheel", p -> WheelBlock.steel("none", p))
                .initialProperties(SharedProperties::softMetal)
                .properties(BlockBehaviour.Properties::noOcclusion)
                .blockstate(BlockStateGen.axisBlockProvider(true))
                .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                .item()
                .transform(customItemModel())
                .register();

    // Dyed



    public static final BlockEntry<WheelBlock> BLACKSTEELWHEEL =
            REGISTRATE.block("black_steel_flywheel", p -> WheelBlock.steel("black", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GRAYSTEELWHEEL =
            REGISTRATE.block("gray_steel_flywheel", p -> WheelBlock.steel("gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_GRAYSTEELWHEEL =
            REGISTRATE.block("light_gray_steel_flywheel", p -> WheelBlock.steel("light_gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> WHITESTEELWHEEL =
            REGISTRATE.block("white_steel_flywheel", p -> WheelBlock.steel("white", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> REDSTEELWHEEL =
            REGISTRATE.block("red_steel_flywheel", p -> WheelBlock.steel("red", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> ORANGESTEELWHEEL =
            REGISTRATE.block("orange_steel_flywheel", p -> WheelBlock.steel("orange", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> YELLOWSTEELWHEEL =
            REGISTRATE.block("yellow_steel_flywheel", p -> WheelBlock.steel("yellow", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIMESTEELWHEEL =
            REGISTRATE.block("lime_steel_flywheel", p -> WheelBlock.steel("lime", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GREENSTEELWHEEL =
            REGISTRATE.block("green_steel_flywheel", p -> WheelBlock.steel("green", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> CYANSTEELWHEEL =
            REGISTRATE.block("cyan_steel_flywheel", p -> WheelBlock.steel("cyan", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_BLUESTEELWHEEL =
            REGISTRATE.block("light_blue_steel_flywheel", p -> WheelBlock.steel("light_blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> BLUESTEELWHEEL =
            REGISTRATE.block("blue_steel_flywheel", p -> WheelBlock.steel("blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> MAGENTASTEELWHEEL =
            REGISTRATE.block("magenta_steel_flywheel", p -> WheelBlock.steel("magenta", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PURPLESTEELWHEEL =
            REGISTRATE.block("purple_steel_flywheel", p -> WheelBlock.steel("purple", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PINKSTEELWHEEL =
            REGISTRATE.block("pink_steel_flywheel", p -> WheelBlock.steel("pink", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    // Iron Flywheels

    // Default
    public static final BlockEntry<WheelBlock> IRONWHEEL =
            REGISTRATE.block("ironflywheel", p -> WheelBlock.iron("none", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    // Dyed



    public static final BlockEntry<WheelBlock> BLACKIRONWHEEL =
            REGISTRATE.block("black_iron_flywheel", p -> WheelBlock.iron("black", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GRAYIRONWHEEL =
            REGISTRATE.block("gray_iron_flywheel", p -> WheelBlock.iron("gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_GRAYIRONWHEEL =
            REGISTRATE.block("light_gray_iron_flywheel", p -> WheelBlock.iron("light_gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> WHITEIRONWHEEL =
            REGISTRATE.block("white_iron_flywheel", p -> WheelBlock.iron("white", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> REDIRONWHEEL =
            REGISTRATE.block("red_iron_flywheel", p -> WheelBlock.iron("red", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> ORANGEIRONWHEEL =
            REGISTRATE.block("orange_iron_flywheel", p -> WheelBlock.iron("orange", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> YELLOWIRONWHEEL =
            REGISTRATE.block("yellow_iron_flywheel", p -> WheelBlock.iron("yellow", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIMEIRONWHEEL =
            REGISTRATE.block("lime_iron_flywheel", p -> WheelBlock.iron("lime", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GREENIRONWHEEL =
            REGISTRATE.block("green_iron_flywheel", p -> WheelBlock.iron("green", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> CYANIRONWHEEL =
            REGISTRATE.block("cyan_iron_flywheel", p -> WheelBlock.iron("cyan", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_BLUEIRONWHEEL =
            REGISTRATE.block("light_blue_iron_flywheel", p -> WheelBlock.iron("light_blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> BLUEIRONWHEEL =
            REGISTRATE.block("blue_iron_flywheel", p -> WheelBlock.iron("blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> MAGENTAIRONWHEEL =
            REGISTRATE.block("magenta_iron_flywheel", p -> WheelBlock.iron("magenta", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PURPLEIRONWHEEL =
            REGISTRATE.block("purple_iron_flywheel", p -> WheelBlock.iron("purple", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PINKIRONWHEEL =
            REGISTRATE.block("pink_iron_flywheel", p -> WheelBlock.iron("pink", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    // Wooden flywheels

    public static final BlockEntry<WheelBlock> DARKOAKWHEEL =
            REGISTRATE.block("dark_oak_flywheel", p -> WheelBlock.wood("dark_oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDDARKOAKWHEEL =
            REGISTRATE.block("dark_oak_plated_flywheel", p -> WheelBlock.wood("plated_dark_oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();


    public static final BlockEntry<WheelBlock> SPRUCEWHEEL =
            REGISTRATE.block("spruce_flywheel", p -> WheelBlock.wood("spruce", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDSPRUCEWHEEL =
            REGISTRATE.block("spruce_plated_flywheel", p -> WheelBlock.wood("plated_spruce", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    /*
    public static final BlockEntry<WheelBlock> OAKWHEEL =
            REGISTRATE.block("oak_flywheel", p -> WheelBlock.wood("oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

     */

    public static final BlockEntry<WheelBlock> PLATEDOAKWHEEL =
            REGISTRATE.block("oak_plated_flywheel", p -> WheelBlock.wood("plated_oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();


    public static final BlockEntry<WheelBlock> BIRCHWHEEL =
            REGISTRATE.block("birch_flywheel", p -> WheelBlock.wood("birch", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDBIRCHWHEEL =
            REGISTRATE.block("birch_plated_flywheel", p -> WheelBlock.wood("plated_birch", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> JUNGLEWHEEL =
            REGISTRATE.block("jungle_flywheel", p -> WheelBlock.wood("jungle", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDJUNGLEWHEEL =
            REGISTRATE.block("jungle_plated_flywheel", p -> WheelBlock.wood("plated_jungle", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> ACACIAWHEEL =
            REGISTRATE.block("acacia_flywheel", p -> WheelBlock.wood("acacia", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDACACIAWHEEL =
            REGISTRATE.block("acacia_plated_flywheel", p -> WheelBlock.wood("plated_acacia", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> CRIMSONWHEEL =
            REGISTRATE.block("crimson_flywheel", p -> WheelBlock.wood("crimson", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDCRIMSONWHEEL =
            REGISTRATE.block("crimson_plated_flywheel", p -> WheelBlock.wood("plated_crimson", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> WARPEDWHEEL =
            REGISTRATE.block("warped_flywheel", p -> WheelBlock.wood("warped", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> PLATEDWARPEDWHEEL =
            REGISTRATE.block("warped_plated_flywheel", p -> WheelBlock.wood("plated_warped", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact()).onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEDARKOAKFLYWHEEL =
            REGISTRATE.block("large_dark_oak_flywheel", p -> WheelBlock.large("dark_oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();
    
    public static final BlockEntry<WheelBlock> LARGESPRUCEFLYWHEEL =
            REGISTRATE.block("large_spruce_flywheel", p -> WheelBlock.large("spruce", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEOAKFLYWHEEL =
            REGISTRATE.block("large_oak_flywheel", p -> WheelBlock.large("oak", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEBIRCHFLYWHEEL =
            REGISTRATE.block("large_birch_flywheel", p -> WheelBlock.large("birch", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEJUNGLEFLYWHEEL =
            REGISTRATE.block("large_jungle_flywheel", p -> WheelBlock.large("jungle", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEACACIAFLYWHEEL =
            REGISTRATE.block("large_acacia_flywheel", p -> WheelBlock.large("acacia", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGEWARPEDFLYWHEEL =
            REGISTRATE.block("large_warped_flywheel", p -> WheelBlock.large("warped", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<WheelBlock> LARGECRIMSONFLYWHEEL =
            REGISTRATE.block("large_crimson_flywheel", p -> WheelBlock.large("crimson", p))
                    .initialProperties(SharedProperties::wooden)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static void register() {}

}

package com.rabbitminers.extendedflywheels.index;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.config.EFCommonValues;
import com.rabbitminers.extendedflywheels.wheel.WheelBlock;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelBlock;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.repack.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class EFBlocks {


    // Utilities

    // Custom tool requirements
    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> axeOrPickAxe() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_AXE).tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> pickaxeOnly() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    // Derive registrate from create
    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels
            .registrate()
            .creativeModeTab(
                    () -> CreativeModeTab.TAB_BUILDING_BLOCKS
            );

    // TEST IMPLEMENTATION TODO: REMOVE
    public static final BlockEntry<FlywheelBlock> FLYWHEEL = REGISTRATE.block("wheel", FlywheelBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(BlockBehaviour.Properties::noOcclusion)
            //        .transform(pickaxeOnly())
            .blockstate(BlockStateGen.axisBlockProvider(true))
            .transform(BlockStressDefaults.setNoImpact())
            .item()
            .transform(customItemModel())
            .register();

    // Naming Convention: [COLOUR][MATERIAL]WHEEL
    // Brass Flywheels

    // Default
    public static final BlockEntry<WheelBlock> WHEEL =
            REGISTRATE.block("flywheel", p -> WheelBlock.brass("none", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();

    // Dyed


    public static final BlockEntry<WheelBlock> BLACKBRASSWHEEL =
            REGISTRATE.block("black_brass_flywheel", p -> WheelBlock.brass("black", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GRAYBRASSWHEEL =
            REGISTRATE.block("gray_brass_flywheel", p -> WheelBlock.brass("gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_GRAYBRASSWHEEL =
            REGISTRATE.block("light_gray_brass_flywheel", p -> WheelBlock.brass("light_gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> WHITEBRASSWHEEL =
            REGISTRATE.block("white_brass_flywheel", p -> WheelBlock.brass("white", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> REDBRASSWHEEL =
            REGISTRATE.block("red_brass_flywheel", p -> WheelBlock.brass("red", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> ORANGEBRASSWHEEL =
            REGISTRATE.block("orange_brass_flywheel", p -> WheelBlock.brass("orange", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> YELLOWBRASSWHEEL =
            REGISTRATE.block("yellow_brass_flywheel", p -> WheelBlock.brass("yellow", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIMEBRASSWHEEL =
            REGISTRATE.block("lime_brass_flywheel", p -> WheelBlock.brass("lime", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GREENBRASSWHEEL =
            REGISTRATE.block("green_brass_flywheel", p -> WheelBlock.brass("green", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> CYANBRASSWHEEL =
            REGISTRATE.block("cyan_brass_flywheel", p -> WheelBlock.brass("cyan", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_BLUEBRASSWHEEL =
            REGISTRATE.block("light_blue_brass_flywheel", p -> WheelBlock.brass("light_blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> BLUEBRASSWHEEL =
            REGISTRATE.block("blue_brass_flywheel", p -> WheelBlock.brass("blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> MAGENTABRASSWHEEL =
            REGISTRATE.block("magenta_brass_flywheel", p -> WheelBlock.brass("magenta", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PURPLEBRASSWHEEL =
            REGISTRATE.block("purple_brass_flywheel", p -> WheelBlock.brass("purple", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PINKBRASSWHEEL =
            REGISTRATE.block("pink_brass_flywheel", p -> WheelBlock.brass("pink", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
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
                .transform(BlockStressDefaults.setNoImpact())
                .item()
                .transform(customItemModel())
                .register();

    // Dyed



    public static final BlockEntry<WheelBlock> BLACKSTEELWHEEL =
            REGISTRATE.block("black_steel_flywheel", p -> WheelBlock.steel("black", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GRAYSTEELWHEEL =
            REGISTRATE.block("gray_steel_flywheel", p -> WheelBlock.steel("gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_GRAYSTEELWHEEL =
            REGISTRATE.block("light_gray_steel_flywheel", p -> WheelBlock.steel("light_gray", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> WHITESTEELWHEEL =
            REGISTRATE.block("white_steel_flywheel", p -> WheelBlock.steel("white", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> REDSTEELWHEEL =
            REGISTRATE.block("red_steel_flywheel", p -> WheelBlock.steel("red", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> ORANGESTEELWHEEL =
            REGISTRATE.block("orange_steel_flywheel", p -> WheelBlock.steel("orange", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> YELLOWSTEELWHEEL =
            REGISTRATE.block("yellow_steel_flywheel", p -> WheelBlock.steel("yellow", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIMESTEELWHEEL =
            REGISTRATE.block("lime_steel_flywheel", p -> WheelBlock.steel("lime", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> GREENSTEELWHEEL =
            REGISTRATE.block("green_steel_flywheel", p -> WheelBlock.steel("green", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> CYANSTEELWHEEL =
            REGISTRATE.block("cyan_steel_flywheel", p -> WheelBlock.steel("cyan", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> LIGHT_BLUESTEELWHEEL =
            REGISTRATE.block("light_blue_steel_flywheel", p -> WheelBlock.steel("light_blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> BLUESTEELWHEEL =
            REGISTRATE.block("blue_steel_flywheel", p -> WheelBlock.steel("blue", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> MAGENTASTEELWHEEL =
            REGISTRATE.block("magenta_steel_flywheel", p -> WheelBlock.steel("magenta", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PURPLESTEELWHEEL =
            REGISTRATE.block("purple_steel_flywheel", p -> WheelBlock.steel("purple", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static final BlockEntry<WheelBlock> PINKSTEELWHEEL =
            REGISTRATE.block("pink_steel_flywheel", p -> WheelBlock.steel("pink", p))
                    .initialProperties(SharedProperties::softMetal)
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .blockstate(BlockStateGen.axisBlockProvider(true))
                    .transform(BlockStressDefaults.setNoImpact())
                    .item()
                    .transform(customItemModel())
                    .register();



    public static void register() {}

}

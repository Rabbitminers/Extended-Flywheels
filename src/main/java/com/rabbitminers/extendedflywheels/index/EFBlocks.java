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

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> axeOrPickAxe() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_AXE).tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    public static <T extends Block, P> NonNullFunction<BlockBuilder<T, P>, BlockBuilder<T, P>> pickaxeOnly() {
        return (b) -> b.tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    private static final CreateRegistrate REGISTRATE = ExtendedFlywheels
            .registrate()
            .creativeModeTab(
                    () -> CreativeModeTab.TAB_BUILDING_BLOCKS
            );

    public static final BlockEntry<FlywheelBlock> FLYWHEEL = REGISTRATE.block("wheel", FlywheelBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(BlockBehaviour.Properties::noOcclusion)
    //        .transform(pickaxeOnly())
            .blockstate(BlockStateGen.axisBlockProvider(true))
            .transform(BlockStressDefaults.setNoImpact())
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WheelBlock> WHEEL = REGISTRATE.block("flywheel", WheelBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .properties(BlockBehaviour.Properties::noOcclusion)
            .blockstate(BlockStateGen.axisBlockProvider(true))
            .transform(BlockStressDefaults.setNoImpact())
            .item()
            .transform(customItemModel())
            .register();

    public static void register() {}

}

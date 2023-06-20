package com.rabbitminers.extendedflywheels.flywheels.wooden;

import com.rabbitminers.extendedflywheels.flywheels.AbstractFlywheelBlock;
import com.rabbitminers.extendedflywheels.registry.ExtendedFlywheelsBlockEntities;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class WoodenFlywheelBlock extends AbstractFlywheelBlock implements IBE<WoodenFlywheelBlockEntity> {
    public WoodenFlywheelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult hit) {
        return onBlockEntityUse(level, pos, fbe -> fbe.applyMaterialIfValid(player.getItemInHand(hand)));
    }

    @Override
    public Class<WoodenFlywheelBlockEntity> getBlockEntityClass() {
        return WoodenFlywheelBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends WoodenFlywheelBlockEntity> getBlockEntityType() {
        return ExtendedFlywheelsBlockEntities.WOODEN_FLYWHEEL.get();
    }
}

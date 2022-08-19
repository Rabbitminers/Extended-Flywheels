package com.rabbitminers.extendedflywheels.wheel;

import com.rabbitminers.extendedflywheels.index.EFTileEntities;
import com.simibubi.create.AllShapes;
import com.simibubi.create.AllTileEntities;
import com.simibubi.create.content.contraptions.base.RotatedPillarKineticBlock;
import com.simibubi.create.foundation.block.ITE;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Objects;

public class WheelBlock extends RotatedPillarKineticBlock implements ITE<WheelTileEntity> {

    String type;
    protected WheelBlock(String material, Properties properties) {
        super(properties);
        type = material;
    }
    public static WheelBlock brass(Properties properties) {
        return new WheelBlock("brass", properties);
    }

    public static WheelBlock steel(Properties properties) {
        return new WheelBlock("steel", properties);
    }



    @Override
    public Class<WheelTileEntity> getTileEntityClass() {
        return WheelTileEntity.class;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return AllShapes.LARGE_GEAR.get(pState.getValue(AXIS));
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockEntityType<? extends WheelTileEntity> getTileEntityType() {
        if (Objects.equals(type, "steel")) {
            return EFTileEntities.STEELWHEEL.get();
        }
        return EFTileEntities.WHEEL.get();
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face.getAxis() == getRotationAxis(state);
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return state.getValue(AXIS);
    }

    @Override
    public float getParticleTargetRadius() {
        return 2f;
    }

    @Override
    public float getParticleInitialRadius() {
        return 1.75f;
    }

}


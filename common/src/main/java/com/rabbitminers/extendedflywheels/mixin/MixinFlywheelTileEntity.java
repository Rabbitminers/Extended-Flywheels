package com.rabbitminers.extendedflywheels.mixin;

import com.rabbitminers.extendedflywheels.base.FlywheelRotationType;
import com.rabbitminers.extendedflywheels.flywheels.IRotatingBlockEnity;
import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import com.simibubi.create.content.kinetics.flywheel.FlywheelBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import com.simibubi.create.foundation.blockEntity.behaviour.CenteredSideValueBoxTransform;
import com.simibubi.create.foundation.blockEntity.behaviour.scrollValue.ScrollOptionBehaviour;
import com.simibubi.create.foundation.utility.Lang;
import com.simibubi.create.foundation.utility.animation.LerpedFloat;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

import java.util.List;

@Mixin(FlywheelBlockEntity.class)
public class MixinFlywheelTileEntity extends KineticBlockEntity implements IRotatingBlockEnity {
    boolean hasForcedSpeed = false;
    float forcedSpeed = 0;
    LerpedFloat visualSpeed = LerpedFloat.linear();
    float angle;
    protected ScrollOptionBehaviour<FlywheelRotationType> movementDirection;

    public MixinFlywheelTileEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    @Override
    public void setForcedSpeed(float speed) {
        hasForcedSpeed = true;
        forcedSpeed = speed;
        visualSpeed.updateChaseTarget(speed);
        visualSpeed.tickChaser();
    }

    @Override
    public void unsetForcedSpeed() {
        hasForcedSpeed = false;
    }

    @Override
    public void setAngle(float angle) {
        this.angle = angle;
    }

    @Override
    public float getAngle() {
        return angle;
    }

    @Override
    public float getWheelRadius() {
        return 22.5f / 16;
    }

    @Override
    public void addBehaviours(List<BlockEntityBehaviour> behaviours) {
        super.addBehaviours(behaviours);
        CenteredSideValueBoxTransform slot = new CenteredSideValueBoxTransform();
        movementDirection = new ScrollOptionBehaviour<>(FlywheelRotationType.class,
                Lang.translateDirect("contraptions.windmill.rotation_direction"), this, slot);
        movementDirection.requiresWrench();
        behaviours.add(movementDirection);
    }
}

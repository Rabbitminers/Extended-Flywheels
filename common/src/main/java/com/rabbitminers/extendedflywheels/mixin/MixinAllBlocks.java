package com.rabbitminers.extendedflywheels.mixin;

import com.rabbitminers.extendedflywheels.flywheels.FlywheelMovementBehaviour;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllMovementBehaviours;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.builders.Builder;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(AllBlocks.class)
public class MixinAllBlocks {
    @Redirect(
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/tterrag/registrate/builders/BlockBuilder;transform(Lcom/tterrag/registrate/util/nullness/NonNullFunction;)Lcom/tterrag/registrate/builders/Builder;",
                    ordinal = 2
            ),
            slice = @Slice(
                    from = @At(value = "CONSTANT", args = "stringValue=sequenced_gearshift"),
                    to = @At(value = "CONSTANT", args = "stringValue=rotation_speed_controller")
            )
    )
    private static Builder addMovementBehaviour(BlockBuilder b, NonNullFunction transformer) {
        return b.transform(transformer).onRegister(AllMovementBehaviours.movementBehaviour(new FlywheelMovementBehaviour()));
    }
}
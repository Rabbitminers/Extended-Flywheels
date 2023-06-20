package com.rabbitminers.extendedflywheels.flywheels.wooden;

import com.rabbitminers.extendedflywheels.flywheels.AbstractFlywheelBlockEntity;
import com.simibubi.create.content.kinetics.flywheel.FlywheelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class WoodenFlywheelBlockEntity extends AbstractFlywheelBlockEntity {
    private static final String MATERIAL_KEY = "Material";
    public BlockState material;

    public WoodenFlywheelBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public InteractionResult applyMaterialIfValid(ItemStack stack) {
        if (!((stack.getItem()) instanceof BlockItem blockItem))
            return InteractionResult.PASS;
        BlockState material = blockItem.getBlock().defaultBlockState();
        if (material == this.material)
            return InteractionResult.PASS;
        if (!material.is(BlockTags.PLANKS))
            return InteractionResult.PASS;
        if (level.isClientSide() && !isVirtual())
            return InteractionResult.SUCCESS;
        this.material = material;
        notifyUpdate();
        level.levelEvent(2001, worldPosition, Block.getId(material));
        return InteractionResult.SUCCESS;
    }

    private void redraw() {
        if (!isVirtual())
            requestModelDataUpdate();
        if (hasLevel()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 16);
            level.getChunkSource()
                    .getLightEngine()
                    .checkBlock(worldPosition);
        }
    }

    @Override
    public void write(CompoundTag nbt, boolean clientPacket) {
        super.write(nbt, clientPacket);
        nbt.put(MATERIAL_KEY, NbtUtils.writeBlockState(this.material));
    }

    @Override
    protected void read(CompoundTag nbt, boolean clientPacket) {
        super.read(nbt, clientPacket);
        BlockState prevMaterial = material;
        if (!nbt.contains("Material"))
            return;

        material = NbtUtils.readBlockState(nbt.getCompound("Material"));
        if (material.isAir())
            material = Blocks.SPRUCE_PLANKS.defaultBlockState();

        if (clientPacket && prevMaterial != material)
            redraw();
    }
}

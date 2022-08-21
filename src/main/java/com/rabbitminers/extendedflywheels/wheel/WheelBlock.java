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

    String type, colour;
    protected WheelBlock(String material, String paint, Properties properties) {
        super(properties);
        type = material;
        colour = paint;
    }
    public static WheelBlock brass(String colour, Properties properties) {
        return new WheelBlock("brass", colour, properties);
    }

    public static WheelBlock steel(String colour, Properties properties) {
        return new WheelBlock("steel", colour, properties);
    }

    public String matchColour(String colour) {
        return "TODO";
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

        switch (type) {
            case "brass":
                switch(colour) {
                    case "black":
                        return EFTileEntities.BLACKBRASSWHEEL.get();
                    case "gray":
                        return EFTileEntities.GRAYBRASSWHEEL.get();
                    case "light_gray":
                        return EFTileEntities.LIGHT_GRAYBRASSWHEEL.get();
                    case "white":
                        return EFTileEntities.WHITEBRASSWHEEL.get();
                    case "red":
                        return EFTileEntities.REDBRASSWHEEL.get();
                    case "orange":
                        return EFTileEntities.ORANGEBRASSWHEEL.get();
                    case "yellow":
                        return EFTileEntities.YELLOWBRASSWHEEL.get();
                    case "lime":
                        return EFTileEntities.LIMEBRASSWHEEL.get();
                    case "green":
                        return EFTileEntities.GREENBRASSWHEEL.get();
                    case "cyan":
                        return EFTileEntities.CYANBRASSWHEEL.get();
                    case "light_blue":
                        return EFTileEntities.LIGHT_BLUEBRASSWHEEL.get();
                    case "blue":
                        return EFTileEntities.BLUEBRASSWHEEL.get();
                    case "magenta":
                        return EFTileEntities.MAGENTABRASSWHEEL.get();
                    case "purple":
                        return EFTileEntities.PURPLEBRASSWHEEL.get();
                    case "pink":
                        return EFTileEntities.PINKBRASSWHEEL.get();
                    default:
                        return EFTileEntities.FLYWHEEL.get();
                }
            case "steel":
                switch (colour) {
                    case "black":
                        return EFTileEntities.BLACKSTEELWHEEL.get();
                    case "gray":
                        return EFTileEntities.GRAYSTEELWHEEL.get();
                    case "light_gray":
                        return EFTileEntities.LIGHT_GRAYSTEELWHEEL.get();
                    case "white":
                        return EFTileEntities.WHITESTEELWHEEL.get();
                    case "red":
                        return EFTileEntities.REDSTEELWHEEL.get();
                    case "orange":
                        return EFTileEntities.ORANGESTEELWHEEL.get();
                    case "yellow":
                        return EFTileEntities.YELLOWSTEELWHEEL.get();
                    case "lime":
                        return EFTileEntities.LIMESTEELWHEEL.get();
                    case "green":
                        return EFTileEntities.GREENSTEELWHEEL.get();
                    case "cyan":
                        return EFTileEntities.CYANSTEELWHEEL.get();
                    case "light_blue":
                        return EFTileEntities.LIGHT_BLUESTEELWHEEL.get();
                    case "blue":
                        return EFTileEntities.BLUESTEELWHEEL.get();
                    case "magenta":
                        return EFTileEntities.MAGENTASTEELWHEEL.get();
                    case "purple":
                        return EFTileEntities.PURPLESTEELWHEEL.get();
                    case "pink":
                        return EFTileEntities.PINKSTEELWHEEL.get();
                    default:
                        return EFTileEntities.STEELWHEEL.get();
                }
            default:
                return EFTileEntities.FLYWHEEL.get();
        }
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


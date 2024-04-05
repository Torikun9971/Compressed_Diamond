package com.compressed_diamond.blocks;

import com.compressed_diamond.blocks.properties.CompressedDiamondPartProperty;

import net.minecraft.block.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.*;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.*;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;

public class CompressedDiamondBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<CompressedDiamondPartProperty> PART = EnumProperty.create("part", CompressedDiamondPartProperty.class);
    private final String diamonds;

    public static final VoxelShape NORTH_SHAPE = VoxelShapes.or(
            Block.box(0, 0, -16, 16, 16, 0),
            Block.box(-8, 0, 0, 8,16, 16),
            Block.box(8, 0, 0, 24, 16, 16),
            Block.box(-16, 0, 16, 0, 16, 32),
            Block.box(0, 0, 16, 16, 16, 32),
            Block.box(16, 0, 16, 32, 16, 32),
            Block.box(0, 16, -8, 16, 32, 8),
            Block.box(-8, 16, 8, 8, 32, 24),
            Block.box(8, 16, 8, 24, 32, 24));

    public static final VoxelShape SOUTH_SHAPE = VoxelShapes.or(
            Block.box(0, 0, 16, 16, 16, 32),
            Block.box(8, 0, 0, 24, 16, 16),
            Block.box(-8, 0, 0, 8, 16, 16),
            Block.box(16, 0, -16, 32, 16, 0),
            Block.box(0, 0, -16, 16, 16, 0),
            Block.box(-16, 0, -16, 0, 16, 0),
            Block.box(0, 16, 8, 16, 32, 24),
            Block.box(8, 16, -8, 24, 32, 8),
            Block.box(-8, 16, -8, 8, 32, 8));

    public static final VoxelShape WEST_SHAPE = VoxelShapes.or(
            Block.box(-16, 0, 0, 0, 16, 16),
            Block.box(0, 0, 8, 16, 16, 24),
            Block.box(0, 0, -8, 16, 16, 8),
            Block.box(16, 0, 16, 32, 16, 32),
            Block.box(16, 0, 0, 32, 16, 16),
            Block.box(16, 0, -16, 32, 16, 0),
            Block.box(-8, 16, 0, 8, 32, 16),
            Block.box(8, 16, 8, 24, 32, 24),
            Block.box(8, 16, -8, 24, 32, 8));

    public static final VoxelShape EAST_SHAPE = VoxelShapes.or(
            Block.box(16, 0, 0, 32, 16, 16),
            Block.box(0, 0, -8, 16, 16, 8),
            Block.box(0, 0, 8, 16, 16, 24),
            Block.box(-16, 0, -16, 0, 16, 0),
            Block.box(-16, 0, 0, 0, 16, 16),
            Block.box(-16, 0, 16, 0, 16, 32),
            Block.box(8, 16, 0, 24, 32, 16),
            Block.box(-8, 16, -8, 8, 32, 8),
            Block.box(-8 , 16, 8, 8, 32, 24));

    public CompressedDiamondBlock(Properties properties, String diamonds) {
        super(properties.harvestTool(ToolType.PICKAXE).harvestLevel(2));
        this.diamonds = diamonds;
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(PART, CompressedDiamondPartProperty.CENTER));
    }

    public void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, PART);
    }

    public void appendHoverText(ItemStack stack, @Nullable IBlockReader reader, List<ITextComponent> components, ITooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslationTextComponent("info.compressed_diamond.diamonds", new DecimalFormat("#,###").format(new BigInteger(diamonds).multiply(BigInteger.valueOf(stack.getCount())))));
        }
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(FACING)) {
            default: switch (state.getValue(PART)) {
                default: return NORTH_SHAPE;
                case TOP: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.TOP.x, -CompressedDiamondPartProperty.TOP.y, -CompressedDiamondPartProperty.TOP.z);
                case LEFT: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.LEFT.x, -CompressedDiamondPartProperty.LEFT.y, -CompressedDiamondPartProperty.LEFT.z);
                case CENTER: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.CENTER.x, -CompressedDiamondPartProperty.CENTER.y, -CompressedDiamondPartProperty.CENTER.z);
                case RIGHT: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.RIGHT.x, -CompressedDiamondPartProperty.RIGHT.y, -CompressedDiamondPartProperty.RIGHT.z);
                case BOTTOM_LEFT: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_LEFT.x, -CompressedDiamondPartProperty.BOTTOM_LEFT.y, -CompressedDiamondPartProperty.BOTTOM_LEFT.z);
                case BOTTOM: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM.x, -CompressedDiamondPartProperty.BOTTOM.y, -CompressedDiamondPartProperty.BOTTOM.z);
                case BOTTOM_RIGHT: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_RIGHT.x, -CompressedDiamondPartProperty.BOTTOM_RIGHT.y, -CompressedDiamondPartProperty.BOTTOM_RIGHT.z);
                case TOP2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.TOP2.x, -CompressedDiamondPartProperty.TOP2.y, -CompressedDiamondPartProperty.TOP2.z);
                case LEFT2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.LEFT2.x, -CompressedDiamondPartProperty.LEFT2.y, -CompressedDiamondPartProperty.LEFT2.z);
                case CENTER2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.CENTER2.x, -CompressedDiamondPartProperty.CENTER2.y, -CompressedDiamondPartProperty.CENTER2.z);
                case RIGHT2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.RIGHT2.x, -CompressedDiamondPartProperty.RIGHT2.y, -CompressedDiamondPartProperty.RIGHT2.z);
                case BOTTOM_LEFT2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_LEFT2.x, -CompressedDiamondPartProperty.BOTTOM_LEFT2.y, -CompressedDiamondPartProperty.BOTTOM_LEFT2.z);
                case BOTTOM2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM2.x, -CompressedDiamondPartProperty.BOTTOM2.y, -CompressedDiamondPartProperty.BOTTOM2.z);
                case BOTTOM_RIGHT2: return NORTH_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_RIGHT2.x, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.y, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.z);
            }

            case SOUTH: switch (state.getValue(PART)) {
                default: return SOUTH_SHAPE;
                case TOP: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.TOP.x, -CompressedDiamondPartProperty.TOP.y, CompressedDiamondPartProperty.TOP.z);
                case LEFT: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.LEFT.x, -CompressedDiamondPartProperty.LEFT.y, CompressedDiamondPartProperty.LEFT.z);
                case CENTER: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.CENTER.x, -CompressedDiamondPartProperty.CENTER.y, CompressedDiamondPartProperty.CENTER.z);
                case RIGHT: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.RIGHT.x, -CompressedDiamondPartProperty.RIGHT.y, CompressedDiamondPartProperty.RIGHT.z);
                case BOTTOM_LEFT: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_LEFT.x, -CompressedDiamondPartProperty.BOTTOM_LEFT.y, CompressedDiamondPartProperty.BOTTOM_LEFT.z);
                case BOTTOM: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM.x, -CompressedDiamondPartProperty.BOTTOM.y, CompressedDiamondPartProperty.BOTTOM.z);
                case BOTTOM_RIGHT: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_RIGHT.x, -CompressedDiamondPartProperty.BOTTOM_RIGHT.y, CompressedDiamondPartProperty.BOTTOM_RIGHT.z);
                case TOP2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.TOP2.x, -CompressedDiamondPartProperty.TOP2.y, CompressedDiamondPartProperty.TOP2.z);
                case LEFT2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.LEFT2.x, -CompressedDiamondPartProperty.LEFT2.y, CompressedDiamondPartProperty.LEFT2.z);
                case CENTER2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.CENTER2.x, -CompressedDiamondPartProperty.CENTER2.y, CompressedDiamondPartProperty.CENTER2.z);
                case RIGHT2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.RIGHT2.x, -CompressedDiamondPartProperty.RIGHT2.y, CompressedDiamondPartProperty.RIGHT2.z);
                case BOTTOM_LEFT2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_LEFT2.x, -CompressedDiamondPartProperty.BOTTOM_LEFT2.y, CompressedDiamondPartProperty.BOTTOM_LEFT2.z);
                case BOTTOM2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM2.x, -CompressedDiamondPartProperty.BOTTOM2.y, CompressedDiamondPartProperty.BOTTOM2.z);
                case BOTTOM_RIGHT2: return SOUTH_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_RIGHT2.x, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.y, CompressedDiamondPartProperty.BOTTOM_RIGHT2.z);
            }

            case WEST: switch (state.getValue(PART)) {
                default: return WEST_SHAPE;
                case TOP: return WEST_SHAPE.move(-CompressedDiamondPartProperty.TOP.z, -CompressedDiamondPartProperty.TOP.y, CompressedDiamondPartProperty.TOP.x);
                case LEFT: return WEST_SHAPE.move(-CompressedDiamondPartProperty.LEFT.z, -CompressedDiamondPartProperty.LEFT.y, CompressedDiamondPartProperty.LEFT.x);
                case CENTER: return WEST_SHAPE.move(-CompressedDiamondPartProperty.CENTER.z, -CompressedDiamondPartProperty.CENTER.y, CompressedDiamondPartProperty.CENTER.x);
                case RIGHT: return WEST_SHAPE.move(-CompressedDiamondPartProperty.RIGHT.z, -CompressedDiamondPartProperty.RIGHT.y, CompressedDiamondPartProperty.RIGHT.x);
                case BOTTOM_LEFT: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_LEFT.z, -CompressedDiamondPartProperty.BOTTOM_LEFT.y, CompressedDiamondPartProperty.BOTTOM_LEFT.x);
                case BOTTOM: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM.z, -CompressedDiamondPartProperty.BOTTOM.y, CompressedDiamondPartProperty.BOTTOM.x);
                case BOTTOM_RIGHT: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_RIGHT.z, -CompressedDiamondPartProperty.BOTTOM_RIGHT.y, CompressedDiamondPartProperty.BOTTOM_RIGHT.x);
                case TOP2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.TOP2.z, -CompressedDiamondPartProperty.TOP2.y, CompressedDiamondPartProperty.TOP2.x);
                case LEFT2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.LEFT2.z, -CompressedDiamondPartProperty.LEFT2.y, CompressedDiamondPartProperty.LEFT2.x);
                case CENTER2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.CENTER2.z, -CompressedDiamondPartProperty.CENTER2.y, CompressedDiamondPartProperty.CENTER2.x);
                case RIGHT2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.RIGHT2.z, -CompressedDiamondPartProperty.RIGHT2.y, CompressedDiamondPartProperty.RIGHT2.x);
                case BOTTOM_LEFT2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_LEFT2.z, -CompressedDiamondPartProperty.BOTTOM_LEFT2.y, CompressedDiamondPartProperty.BOTTOM_LEFT2.x);
                case BOTTOM2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM2.z, -CompressedDiamondPartProperty.BOTTOM2.y, CompressedDiamondPartProperty.BOTTOM2.x);
                case BOTTOM_RIGHT2: return WEST_SHAPE.move(-CompressedDiamondPartProperty.BOTTOM_RIGHT2.z, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.y, CompressedDiamondPartProperty.BOTTOM_RIGHT2.x);
            }

            case EAST: switch (state.getValue(PART)) {
                default: return EAST_SHAPE;
                case TOP: return EAST_SHAPE.move(CompressedDiamondPartProperty.TOP.z, -CompressedDiamondPartProperty.TOP.y, -CompressedDiamondPartProperty.TOP.x);
                case LEFT: return EAST_SHAPE.move(CompressedDiamondPartProperty.LEFT.z, -CompressedDiamondPartProperty.LEFT.y, -CompressedDiamondPartProperty.LEFT.x);
                case CENTER: return EAST_SHAPE.move(CompressedDiamondPartProperty.CENTER.z, -CompressedDiamondPartProperty.CENTER.y, -CompressedDiamondPartProperty.CENTER.x);
                case RIGHT: return EAST_SHAPE.move(CompressedDiamondPartProperty.RIGHT.z, -CompressedDiamondPartProperty.RIGHT.y, -CompressedDiamondPartProperty.RIGHT.x);
                case BOTTOM_LEFT: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_LEFT.z, -CompressedDiamondPartProperty.BOTTOM_LEFT.y, -CompressedDiamondPartProperty.BOTTOM_LEFT.x);
                case BOTTOM: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM.z, -CompressedDiamondPartProperty.BOTTOM.y, -CompressedDiamondPartProperty.BOTTOM.x);
                case BOTTOM_RIGHT: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_RIGHT.z, -CompressedDiamondPartProperty.BOTTOM_RIGHT.y, -CompressedDiamondPartProperty.BOTTOM_RIGHT.x);
                case TOP2: return EAST_SHAPE.move(CompressedDiamondPartProperty.TOP2.z, -CompressedDiamondPartProperty.TOP2.y, -CompressedDiamondPartProperty.TOP2.x);
                case LEFT2: return EAST_SHAPE.move(CompressedDiamondPartProperty.LEFT2.z, -CompressedDiamondPartProperty.LEFT2.y, -CompressedDiamondPartProperty.LEFT2.x);
                case CENTER2: return EAST_SHAPE.move(CompressedDiamondPartProperty.CENTER2.z, -CompressedDiamondPartProperty.CENTER2.y, -CompressedDiamondPartProperty.CENTER2.x);
                case RIGHT2: return EAST_SHAPE.move(CompressedDiamondPartProperty.RIGHT2.z, -CompressedDiamondPartProperty.RIGHT2.y, -CompressedDiamondPartProperty.RIGHT2.x);
                case BOTTOM_LEFT2: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_LEFT2.z, -CompressedDiamondPartProperty.BOTTOM_LEFT2.y, -CompressedDiamondPartProperty.BOTTOM_LEFT2.x);
                case BOTTOM2: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM2.z, -CompressedDiamondPartProperty.BOTTOM2.y, -CompressedDiamondPartProperty.BOTTOM2.x);
                case BOTTOM_RIGHT2: return EAST_SHAPE.move(CompressedDiamondPartProperty.BOTTOM_RIGHT2.z, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.y, -CompressedDiamondPartProperty.BOTTOM_RIGHT2.x);
            }
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext ctx) {
        return defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    public BlockRenderType getRenderShape(BlockState state) {
        return state.getValue(PART) == CompressedDiamondPartProperty.CENTER ? BlockRenderType.MODEL : BlockRenderType.INVISIBLE;
    }

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

    public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
        Direction direction = state.getValue(FACING);

        for (CompressedDiamondPartProperty part : CompressedDiamondPartProperty.values()) {
            BlockPos partPos = pos.relative(direction.getClockWise(), part.x).relative(direction.getOpposite(), part.z).above(part.y);
            world.setBlockAndUpdate(partPos, defaultBlockState().setValue(FACING, direction).setValue(PART, part));
        }
    }

    public boolean canSurvive(BlockState state, IWorldReader reader, BlockPos pos) {
        Direction direction = state.getValue(FACING);

        for (CompressedDiamondPartProperty part : CompressedDiamondPartProperty.values()) {
            BlockPos partPos = pos.relative(direction.getClockWise(), part.x).relative(direction.getOpposite(), part.z).above(part.y);

            if (!reader.getBlockState(partPos).getMaterial().isReplaceable()) {
                return false;
            }
        }
        return true;
    }

    public void playerWillDestroy(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.abilities.instabuild && player.hasCorrectToolForDrops(state)) {
            destroy(world, pos, state, true);
        } else {
            destroy(world, pos, state, false);
        }

        super.playerWillDestroy(world, pos, state, player);
    }

    public void wasExploded(World world, BlockPos pos, Explosion explosion) {
        if (!world.isClientSide()) {
            for (Direction direction : Direction.values()) {
                BlockState detectState = world.getBlockState(pos.relative(direction));

                if (detectState.getBlock() == this.asBlock()) {
                    destroy(world, pos.relative(direction), detectState, true);
                    break;
                }
            }
        }
    }

    private void destroy(World world, BlockPos pos, BlockState state, boolean drop) {
        Direction direction = state.getValue(FACING);
        BlockPos centerPos = pos.relative(direction.getCounterClockWise(), state.getValue(PART).x).relative(direction, state.getValue(PART).z).below(state.getValue(PART).y);

        for (CompressedDiamondPartProperty part : CompressedDiamondPartProperty.values()) {
            BlockPos partPos = centerPos.relative(direction.getClockWise(), part.x).relative(direction.getOpposite(), part.z).above(part.y);

            if (part != CompressedDiamondPartProperty.CENTER) {
                world.destroyBlock(partPos, false);
            } else {
                world.destroyBlock(partPos, drop);
            }
        }
    }
}

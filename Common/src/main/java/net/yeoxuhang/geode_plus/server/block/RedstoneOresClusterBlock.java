package net.yeoxuhang.geode_plus.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import javax.annotation.Nullable;

public class RedstoneOresClusterBlock extends RedStoneOreBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static BooleanProperty LIT;
    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb;

    public RedstoneOresClusterBlock(int box, int i, Properties properties) {
        super(properties);
        properties.pushReaction(PushReaction.DESTROY);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(LIT, false).setValue(FACING, Direction.UP));
        this.upAabb = Block.box(i, 0.0D, i, (16 - i), box, (16 - i));
        this.downAabb = Block.box(i, (16 - box), i, (16 - i), 16.0D, (16 - i));
        this.northAabb = Block.box(i, i, (16 - box), (16 - i), (16 - i), 16.0D);
        this.southAabb = Block.box(i, i, 0.0D, (16 - i), (16 - i), box);
        this.eastAabb = Block.box(0.0D, i, i, box, (16 - i), (16 - i));
        this.westAabb = Block.box((16 - box), i, i, 16.0D, (16 - i), (16 - i));
    }

    public VoxelShape getShape(BlockState p_152021_, BlockGetter p_152022_, BlockPos p_152023_, CollisionContext p_152024_) {
        Direction direction = p_152021_.getValue(FACING);
        switch (direction) {
            case NORTH:
                return this.northAabb;
            case SOUTH:
                return this.southAabb;
            case EAST:
                return this.eastAabb;
            case WEST:
                return this.westAabb;
            case DOWN:
                return this.downAabb;
            case UP:
            default:
                return this.upAabb;
        }
    }

    public void attack(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        interact(blockState, level, blockPos);
        super.attack(blockState, level, blockPos, player);
    }

    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (!entity.isSteppingCarefully()) {
            interact(blockState, level, blockPos);
        }

        super.stepOn(level, blockPos, blockState, entity);
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (level.isClientSide) {
            spawnParticles(level, blockPos);
        } else {
            interact(blockState, level, blockPos);
        }

        ItemStack itemStack = player.getItemInHand(interactionHand);
        return itemStack.getItem() instanceof BlockItem && (new BlockPlaceContext(player, interactionHand, itemStack, blockHitResult)).canPlace() ? InteractionResult.PASS : InteractionResult.SUCCESS;
    }

    private static void interact(BlockState blockState, Level level, BlockPos blockPos) {
        spawnParticles(level, blockPos);
        if (!(Boolean) blockState.getValue(LIT)) {
            level.setBlock(blockPos, (BlockState) blockState.setValue(LIT, true), 3);
        }

    }

    public boolean isRandomlyTicking(BlockState blockState) {
        return (Boolean) blockState.getValue(LIT);
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if ((Boolean) blockState.getValue(LIT)) {
            serverLevel.setBlock(blockPos, (BlockState) blockState.setValue(LIT, false), 3);
        }

    }

    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(LIT)) {
            spawnParticles(level, blockPos);
        }
    }

    private static void spawnParticles(Level level, BlockPos blockPos) {
        double d = 0.5625;
        RandomSource randomSource = level.random;
        Direction[] var5 = Direction.values();
        int var6 = var5.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            Direction direction = var5[var7];
            BlockPos blockPos2 = blockPos.relative(direction);
            if (!level.getBlockState(blockPos2).isSolidRender(level, blockPos2)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5 + 0.5625 * direction.getStepX() : randomSource.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5 + 0.5625 * direction.getStepY() : randomSource.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5 + 0.5625 * direction.getStepZ() : randomSource.nextFloat();
                level.addParticle(DustParticleOptions.REDSTONE, blockPos.getX() + e, blockPos.getY() + f, blockPos.getZ() + g, 0.0, 0.0, 0.0);
            }
        }

    }

    static {
        LIT = RedstoneTorchBlock.LIT;
    }

    @Override
    public void spawnAfterBreak(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, ItemStack itemStack, boolean bl) {
        super.spawnAfterBreak(blockState, serverLevel, blockPos, itemStack, bl);
        if (bl && !EnchantmentHelper.hasSilkTouch(itemStack) && blockState.is(BlockRegistry.SMALL_REDSTONE_BUD.get())) {
            int i = 1;
            this.popExperience(serverLevel, blockPos, i);
        }
        if (bl && !EnchantmentHelper.hasSilkTouch(itemStack) && blockState.is(BlockRegistry.MEDIUM_REDSTONE_BUD.get())) {
            int i = 1 + serverLevel.random.nextInt(2);
            this.popExperience(serverLevel, blockPos, i);
        }
        if (bl && !EnchantmentHelper.hasSilkTouch(itemStack) && blockState.is(BlockRegistry.LARGE_REDSTONE_BUD.get())) {
            int i = 1 + serverLevel.random.nextInt(5);
            this.popExperience(serverLevel, blockPos, i);
        }
        if (bl && !EnchantmentHelper.hasSilkTouch(itemStack) && blockState.is(BlockRegistry.REDSTONE_CRYSTAL.get())) {
            int i = 1 + serverLevel.random.nextInt(10);
            this.popExperience(serverLevel, blockPos, i);
        }
    }

    public boolean canSurvive(BlockState p_152026_, LevelReader p_152027_, BlockPos p_152028_) {
        Direction direction = p_152026_.getValue(FACING);
        BlockPos blockpos = p_152028_.relative(direction.getOpposite());
        return p_152027_.getBlockState(blockpos).isFaceSturdy(p_152027_, blockpos, direction);
    }

    public BlockState updateShape(BlockState p_152036_, Direction p_152037_, BlockState p_152038_, LevelAccessor p_152039_, BlockPos p_152040_, BlockPos p_152041_) {
        if (p_152036_.getValue(WATERLOGGED)) {
            p_152039_.scheduleTick(p_152040_, Fluids.WATER, Fluids.WATER.getTickDelay(p_152039_));
        }

        return p_152037_ == p_152036_.getValue(FACING).getOpposite() && !p_152036_.canSurvive(p_152039_, p_152040_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152036_, p_152037_, p_152038_, p_152039_, p_152040_, p_152041_);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_152019_) {
        LevelAccessor levelaccessor = p_152019_.getLevel();
        BlockPos blockpos = p_152019_.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER)).setValue(FACING, p_152019_.getClickedFace());
    }

    public BlockState rotate(BlockState p_152033_, Rotation p_152034_) {
        return p_152033_.setValue(FACING, p_152034_.rotate(p_152033_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_152030_, Mirror p_152031_) {
        return p_152030_.rotate(p_152031_.getRotation(p_152030_.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState p_152045_) {
        return p_152045_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_152045_);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_152043_) {
        p_152043_.add(WATERLOGGED, FACING, LIT);
    }
}
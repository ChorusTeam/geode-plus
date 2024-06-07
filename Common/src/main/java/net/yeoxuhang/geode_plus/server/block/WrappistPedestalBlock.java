package net.yeoxuhang.geode_plus.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yeoxuhang.geode_plus.server.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;

public class WrappistPedestalBlock extends BaseEntityBlock {

    public static final List<BlockPos> Wrappist_OFFSETS = BlockPos.betweenClosedStream(-2, 0, -2, 2, 1, 2).filter((p_207914_) -> Math.abs(p_207914_.getX()) == 2 || Math.abs(p_207914_.getZ()) == 2).map(BlockPos::immutable).toList();

    public WrappistPedestalBlock(Properties properties) {
        super(properties);
        properties.pushReaction(PushReaction.IGNORE);
    }

    private static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 8, 15);

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    public boolean mayPlaceOn(BlockState groundState) {
        return !groundState.is(BlockRegistry.WRAPPIST_PEDESTAL.get()) || !groundState.is(TagRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos blockpos = pos.below();
        BlockState groundState = levelReader.getBlockState(blockpos);
        return this.mayPlaceOn(groundState);
    }

    public InteractionResult use(@NotNull BlockState state, Level worldIn, @NotNull BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(handIn);
        if (worldIn.getBlockEntity(pos) instanceof WrappistPedestalBlockEntity wrappistPedestalBlock){
            int count = wrappistPedestalBlock.getItem(0).getCount();
            if ((!player.isShiftKeyDown()  && heldItem.getItem() != this.asItem())) {
                ItemStack stack = heldItem.copy();
                stack.setCount(1);
                if(wrappistPedestalBlock.getItem(0).isEmpty()){
                    wrappistPedestalBlock.setItem(0, stack);
                    if(!player.isCreative()){
                        heldItem.shrink(1);
                    }
                    return InteractionResult.SUCCESS;
                } else if(wrappistPedestalBlock.getItem(0).is(stack.getItem()) && wrappistPedestalBlock.getItem(0).getMaxStackSize() >= wrappistPedestalBlock.getItem(0).getCount() + stack.getCount()){
                    wrappistPedestalBlock.getItem(0).grow(1);
                    if(!player.isCreative()){
                        heldItem.shrink(1);
                    }
                    return InteractionResult.SUCCESS;
                } else if (wrappistPedestalBlock.getItem(0).is(Items.GOLDEN_APPLE) && !wrappistPedestalBlock.isEmpty()){
                    for (BlockPos $$4 : Wrappist_OFFSETS) {
                        if (isValidWrappistBlock(worldIn, pos, $$4)) {
                            if (player.isCreative()){
                                ItemStack stack1 = Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance();
                                stack1.setCount(count);
                                wrappistPedestalBlock.setItem(0, stack1);
                                worldIn.playSound(null, pos, SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.1F + 0.9F);
                                player.addItem(stack1);
                                wrappistPedestalBlock.setItem(0, ItemStack.EMPTY);
                                return InteractionResult.SUCCESS;
                            } else if (!player.isCreative() && player.experienceLevel >= 30){
                                player.giveExperienceLevels(-30);
                                ItemStack stack1 = Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance();
                                stack1.setCount(count);
                                wrappistPedestalBlock.setItem(0, stack1);
                                worldIn.playSound(null, pos, SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.1F + 0.9F);
                                player.addItem(stack1);
                                wrappistPedestalBlock.setItem(0, ItemStack.EMPTY);
                                return InteractionResult.SUCCESS;
                            } else if (!player.isCreative() && player.experienceLevel < 30){
                                player.displayClientMessage(Component.translatable("wrappist_pedestal.geode_plus.not_enought_xp"), true);
                                player.addItem(wrappistPedestalBlock.getItem(0).copy());
                                wrappistPedestalBlock.setItem(0, ItemStack.EMPTY);
                                worldIn.playSound(null, pos, SoundEvents.BEACON_DEACTIVATE, SoundSource.BLOCKS, 1.0F, worldIn.random.nextFloat() * 0.1F + 0.9F);
                                return InteractionResult.FAIL;
                            }
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            } else {
                player.addItem(wrappistPedestalBlock.getItem(0).copy());
                wrappistPedestalBlock.setItem(0, ItemStack.EMPTY);
                return InteractionResult.PASS;
            }
        } return InteractionResult.FAIL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WrappistPedestalBlockEntity(pos, state);
    }

    @Override
    public void onRemove(BlockState state, Level worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        BlockEntity tileentity = worldIn.getBlockEntity(pos);
        if (tileentity instanceof WrappistPedestalBlockEntity) {
            Containers.dropContents(worldIn, pos, (WrappistPedestalBlockEntity) tileentity);
            worldIn.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, worldIn, pos, newState, isMoving);
    }

    public static boolean isValidWrappistBlock(Level $$0, BlockPos $$1, BlockPos $$2) {
        return $$0.getBlockState($$1.offset($$2)).is(BlockRegistry.WRAPPIST_BLOCK.get());
    }

    @Override
    public void animateTick(BlockState $$0, Level $$1, BlockPos $$2, RandomSource $$3) {
        Iterator var5 = Wrappist_OFFSETS.iterator();
        if ($$1.getBlockEntity($$2) instanceof WrappistPedestalBlockEntity wrappistPedestalBlock){
            if (!wrappistPedestalBlock.isEmpty()){
                while(var5.hasNext()) {
                    BlockPos $$4 = (BlockPos)var5.next();
                    if ($$3.nextInt(16) == 0 && isValidWrappistBlock($$1, $$2, $$4)) {
                        $$1.addParticle(ParticleTypes.ENCHANT, (double)$$2.getX() + 0.5, (double)$$2.getY() + 2.0, (double)$$2.getZ() + 0.5, (double)((float)$$4.getX() + $$3.nextFloat()) - 0.5, (float)$$4.getY() - $$3.nextFloat() - 1.0F, (double)((float)$$4.getZ() + $$3.nextFloat()) - 0.5);
                    }
                }
            }
        }
    }

    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public PushReaction getPistonPushReaction(BlockState p_152047_) {
        return PushReaction.IGNORE;
    }

}

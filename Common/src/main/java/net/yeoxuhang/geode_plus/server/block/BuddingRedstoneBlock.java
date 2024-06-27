package net.yeoxuhang.geode_plus.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import java.util.Collections;
import java.util.List;

public class BuddingRedstoneBlock extends RedStoneOreBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingRedstoneBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = BlockRegistry.SMALL_REDSTONE_BUD.get();
            } else if (blockstate.is(BlockRegistry.SMALL_REDSTONE_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_REDSTONE_BUD.get();
            } else if (blockstate.is(BlockRegistry.MEDIUM_REDSTONE_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_REDSTONE_BUD.get();
            } else if (blockstate.is(BlockRegistry.LARGE_REDSTONE_BUD.get()) && blockstate.getValue(OresClusterBlock.FACING) == direction) {
                block = BlockRegistry.REDSTONE_CRYSTAL.get();
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(OresClusterBlock.FACING, direction).setValue(OresClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    @Override
    public void spawnAfterBreak(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, ItemStack itemStack, boolean bl) {
        super.spawnAfterBreak(blockState, serverLevel, blockPos, itemStack, bl);
        if (bl && !EnchantmentHelper.hasSilkTouch(itemStack)) {
            int i = 1 + serverLevel.random.nextInt(5);
            this.popExperience(serverLevel, blockPos, i);
        }
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack stone = new ItemStack(BlockRegistry.BUDDING_REDSTONE.get());
        ItemStack deepslate = new ItemStack(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        ItemStack sculk = new ItemStack(BlockRegistry.BUDDING_SCULK_REDSTONE.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_REDSTONE.get())){
            return Collections.singletonList(stone);
        }
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get())){
            return Collections.singletonList(deepslate);
        }
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_SCULK_REDSTONE.get())){
            return Collections.singletonList(sculk);
        }
        return super.getDrops(blockState, builder);
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}
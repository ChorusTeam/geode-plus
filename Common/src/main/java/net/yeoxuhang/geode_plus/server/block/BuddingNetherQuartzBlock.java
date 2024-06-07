package net.yeoxuhang.geode_plus.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;

import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import java.util.Collections;
import java.util.List;

public class BuddingNetherQuartzBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingNetherQuartzBlock(Properties p_152726_) {
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
                block = BlockRegistry.SMALL_QUARTZ_BUD.get();
            } else if (blockstate.is(BlockRegistry.SMALL_QUARTZ_BUD.get()) && blockstate.getValue(QuartzCrystalBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_QUARTZ_BUD.get();
            } else if (blockstate.is(BlockRegistry.MEDIUM_QUARTZ_BUD.get()) && blockstate.getValue(QuartzCrystalBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_QUARTZ_BUD.get();
            } else if (blockstate.is(BlockRegistry.LARGE_QUARTZ_BUD.get()) && blockstate.getValue(QuartzCrystalBlock.FACING) == direction) {
                block = BlockRegistry.QUARTZ_CRYSTAL.get();
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(QuartzCrystalBlock.FACING, direction).setValue(QuartzCrystalBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
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

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack nether = new ItemStack(BlockRegistry.BUDDING_NETHER_QUARTZ.get());
        ItemStack basalt = new ItemStack(BlockRegistry.BUDDING_BASALT_QUARTZ.get());
        ItemStack blackstone = new ItemStack(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_NETHER_QUARTZ.get())){
            return Collections.singletonList(nether);
        }
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_BASALT_QUARTZ.get())){
            return Collections.singletonList(basalt);
        }
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch && blockState.is(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get())){
            return Collections.singletonList(blackstone);
        }
        return super.getDrops(blockState, builder);
    }
}
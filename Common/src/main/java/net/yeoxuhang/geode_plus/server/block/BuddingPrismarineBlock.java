package net.yeoxuhang.geode_plus.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.Vec3;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class BuddingPrismarineBlock extends AmethystBlock {
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingPrismarineBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(10) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = BlockRegistry.SMALL_PRISMARINE_BUD.get();
                applyConduitPowerAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 5);
            } else if (blockstate.is(BlockRegistry.SMALL_PRISMARINE_BUD.get()) && blockstate.getValue(PrismarineClusterBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_PRISMARINE_BUD.get();
                applyConduitPowerAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 10);
            } else if (blockstate.is(BlockRegistry.MEDIUM_PRISMARINE_BUD.get()) && blockstate.getValue(PrismarineClusterBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_PRISMARINE_BUD.get();
                applyConduitPowerAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 15);
            } else if (blockstate.is(BlockRegistry.LARGE_PRISMARINE_BUD.get()) && blockstate.getValue(PrismarineClusterBlock.FACING) == direction) {
                block = BlockRegistry.PRISMARINE_CLUSTER.get();
                applyConduitPowerAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 20);
            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(PrismarineClusterBlock.FACING, direction).setValue(PrismarineClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }
        }
    }

    public static void applyConduitPowerAround(ServerLevel serverLevel, Vec3 vec3, @Nullable Entity entity, int i) {
        MobEffectInstance mobEffectInstance = new MobEffectInstance(MobEffects.CONDUIT_POWER, 260, 0, false, false);
        MobEffectUtil.addEffectToPlayersAround(serverLevel, entity, vec3, (double)i, mobEffectInstance, 200);
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack budding = new ItemStack(BlockRegistry.BUDDING_PRISMARINE.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch){
            return Collections.singletonList(budding);
        }
        return super.getDrops(blockState, builder);
    }
}
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

public class BuddingPinkTopazBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingPinkTopazBlock(Properties p_152726_) {
        super(p_152726_);
    }

    public PushReaction getPistonPushReaction(BlockState p_152733_) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState p_220898_, ServerLevel p_220899_, BlockPos p_220900_, RandomSource p_220901_) {
        if (p_220901_.nextInt(20) == 0) {
            Direction direction = DIRECTIONS[p_220901_.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = p_220900_.relative(direction);
            BlockState blockstate = p_220899_.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = BlockRegistry.SMALL_PINK_TOPAZ_BUD.get();
                applyLuckAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 5);

            } else if (blockstate.is(BlockRegistry.SMALL_PINK_TOPAZ_BUD.get()) && blockstate.getValue(PinkTopazCrystalBlock.FACING) == direction) {
                block = BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get();
                applyLuckAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 10);

            } else if (blockstate.is(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get()) && blockstate.getValue(PinkTopazCrystalBlock.FACING) == direction) {
                block = BlockRegistry.LARGE_PINK_TOPAZ_BUD.get();
                applyLuckAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 15);

            } else if (blockstate.is(BlockRegistry.LARGE_PINK_TOPAZ_BUD.get()) && blockstate.getValue(PinkTopazCrystalBlock.FACING) == direction) {
                block = BlockRegistry.PINK_TOPAZ_CRYSTAL.get();
                applyLuckAround(p_220899_, Vec3.atCenterOf(p_220900_), null, 20);

            }
            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(PinkTopazCrystalBlock.FACING, direction).setValue(PinkTopazCrystalBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                p_220899_.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }
    public static void applyLuckAround(ServerLevel serverLevel, Vec3 vec3, @Nullable Entity entity, int i) {
        MobEffectInstance mobEffectInstance = new MobEffectInstance(MobEffects.LUCK, 260, 0, false, false);
        MobEffectUtil.addEffectToPlayersAround(serverLevel, entity, vec3, (double)i, mobEffectInstance, 200);
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }

    @Override
    public List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        ItemStack pickaxe = builder.getLevel().players().get(0).getMainHandItem();
        ItemStack budding = new ItemStack(BlockRegistry.BUDDING_PINK_TOPAZ.get());
        if (EnchantmentHelper.hasSilkTouch(pickaxe) && ServerConfigs.BLOCKS.allowSilkTouch){
            return Collections.singletonList(budding);
        }
        return super.getDrops(blockState, builder);
    }
}
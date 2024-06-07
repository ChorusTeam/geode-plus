package net.yeoxuhang.geode_plus.server.world.feature;

import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import net.yeoxuhang.geode_plus.server.block.WrappistClusterBlock;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;
import net.yeoxuhang.geode_plus.server.world.feature.config.GeodeCrystalSpikeConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Iterator;

public class WrappistCrystalSpikeFeature extends Feature<GeodeCrystalSpikeConfig> {
    public WrappistCrystalSpikeFeature(Codec<GeodeCrystalSpikeConfig> codec) {
        super(codec);
    }

    public boolean place(@NotNull FeaturePlaceContext<GeodeCrystalSpikeConfig> context) {
        WorldGenLevel world = context.level();
        BlockPos blockPos = context.origin();
        RandomSource random = context.random();
        GeodeCrystalSpikeConfig config = context.config();
        HashSet<BlockPos> trigList = Sets.newHashSet();
        HashSet<BlockPos> clusterPos = Sets.newHashSet();
        boolean flag = false;
        int radiusCheck = config.xzRadius.sample(random) + 1;
        int randomChance = random.nextInt(4);
        int stepHeight = radiusCheck + 14 + Mth.nextInt(random, 10, 14);
        if (world.isStateAtPosition(blockPos.relative(config.crystal_direction.getDirection().getOpposite()), DripstoneUtils::isEmptyOrWaterOrLava) && world.getBlockState(blockPos).is(TagRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE) && this.placeSpike(world, blockPos, radiusCheck, stepHeight, randomChance, trigList, config.crystal_direction.getDirection(), random)) {
            flag = this.placeCrystals(world, random, config, trigList, clusterPos, flag);
        }

        return flag;
    }

    private boolean placeCrystals(WorldGenLevel world, RandomSource random, GeodeCrystalSpikeConfig config, HashSet<BlockPos> trigList, HashSet<BlockPos> clusterPos, boolean flag) {
        Iterator var7 = trigList.iterator();

        BlockPos pos;
        while(var7.hasNext()) {
            pos = (BlockPos)var7.next();
            if (world.isStateAtPosition(pos, DripstoneUtils::isEmptyOrWaterOrLava)) {
                this.setBlock(world, pos, config.crystal_state);
                clusterPos.add(pos);
                flag = true;
            }
        }

        var7 = clusterPos.iterator();

        while(true) {
            do {
                if (!var7.hasNext()) {
                    return flag;
                }

                pos = (BlockPos)var7.next();
            } while(random.nextInt(6) != 0);

            Direction[] var9 = Direction.values();
            int var10 = var9.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                Direction direction = var9[var11];
                BlockPos relative = pos.relative(direction);
                if (random.nextBoolean() && world.isStateAtPosition(relative, DripstoneUtils::isEmptyOrWater) && world.getBlockState(pos).equals(config.crystal_state)) {
                    this.setBlock(world, relative, config.cluster_state.setValue(WrappistClusterBlock.FACING, direction).setValue(WrappistClusterBlock.WATERLOGGED, world.getFluidState(relative).getType() == Fluids.WATER));
                }
            }
        }
    }

    public boolean placeSpike(LevelAccessor world, BlockPos blockPos, int startRadius, int height, int randomChance, HashSet<BlockPos> crystalPos, Direction direction, RandomSource random) {
        boolean flag = false;

        for(int y = 0; y < height; ++y) {
            int radius = startRadius - y / 2;

            for(int x = -radius; x <= radius; ++x) {
                for(int z = -radius; z <= radius; ++z) {
                    BlockPos pos = new BlockPos(blockPos.getX() + x, blockPos.getY(), blockPos.getZ() + z);
                    if (x * x + z * z <= radius * radius) {
                        if (direction == Direction.DOWN) {
                            //return this.placeSpike(world, blockPos.below(), startRadius / 2, height, randomChance, crystalPos, direction, random);
                        } else if (direction == Direction.UP) {
                            BlockPos.MutableBlockPos mut = pos.mutable();

                            for(int i = 0; i < 10 && world.isStateAtPosition(mut.above(), DripstoneUtils::isEmptyOrWaterOrLava); ++i) {
                                mut.move(Direction.UP);
                            }

                            pos = mut.immutable();
                            if (world.isStateAtPosition(pos.above(), DripstoneUtils::isEmptyOrWaterOrLava)) {
                                return false;
                            }
                        }

                        this.calciteBloom(world, pos.relative(direction), random, radius);
                        float var10000;
                        switch (randomChance) {
                            case 0:
                                var10000 = 2.617994F;
                                break;
                            case 1:
                                var10000 = 5.759587F;
                                break;
                            case 2:
                                var10000 = 0.5235988F;
                                break;
                            case 3:
                                var10000 = 3.6651917F;
                                break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + randomChance);
                        }

                        float delta = var10000;
                        float q = Mth.cos(delta) * (float)y;
                        float k = Mth.sin(1.5707964F) * (float)y;
                        float l = Mth.sin(delta) * (float)y;
                        float xx = direction == Direction.UP ? -q : q;
                        float yy = direction == Direction.UP ? -k : k;
                        float zz = direction == Direction.UP ? -l : l;
                        BlockPos trigPos = pos.offset((int)xx, (int)yy, (int)zz);
                        if (world.isStateAtPosition(trigPos, DripstoneUtils::isEmptyOrWaterOrLava)) {
                            crystalPos.add(trigPos);
                            flag = true;
                        } else {
                            crystalPos.remove(trigPos);
                        }
                    }
                }
            }
        }

        return flag;
    }

    private boolean calciteBloom(LevelAccessor world, BlockPos blockPos, RandomSource random, int crystalRadius) {
        int radius = crystalRadius / 4;
        int height = ConstantInt.of(2).sample(random);
        boolean flag = false;

        for(int x = -radius; x <= radius; ++x) {
            for(int z = -radius; z <= radius; ++z) {
                for(int y = -height; y <= height; ++y) {
                    BlockPos pos = new BlockPos(blockPos.getX() + x, blockPos.getY() + y, blockPos.getZ() + z);
                    Direction[] var12 = Direction.values();
                    int var13 = var12.length;

                    for(int var14 = 0; var14 < var13; ++var14) {
                        Direction direction = var12[var14];
                        if (world.getBlockState(pos).is(TagRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE) && world.isStateAtPosition(pos.relative(direction), DripstoneUtils::isEmptyOrWaterOrLava)) {
                            world.setBlock(pos, BlockRegistry.SMOOTH_END_STONE.get().defaultBlockState(), 2);
                            flag = true;
                        }
                    }
                }
            }
        }

        return flag;
    }
}

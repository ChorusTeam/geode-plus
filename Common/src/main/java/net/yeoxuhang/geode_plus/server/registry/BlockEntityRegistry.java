package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.server.block.entity.WrappistPedestalBlockEntity;
import net.yeoxuhang.geode_plus.reg.RegistrationProvider;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

import java.util.function.Supplier;

public class BlockEntityRegistry {
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK = RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, GeodePlus.MOD_ID);

    public static final RegistryObject<BlockEntityType<WrappistPedestalBlockEntity>> WRAPPIST_PEDESTAL = register("wrappist_pedestal", () -> BlockEntityType.Builder.of(WrappistPedestalBlockEntity::new, BlockRegistry.WRAPPIST_PEDESTAL.get()));

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String key, Supplier<BlockEntityType.Builder<T>> builder) {
        return BLOCK.register(key, () -> builder.get().build(null));
    }

    public static void init(){}
}

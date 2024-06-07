package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.Projectile;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.server.projectile.WrappistHornEffect;
import net.yeoxuhang.geode_plus.reg.RegistrationProvider;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

import java.util.function.Supplier;

public class EntityRegistry {
    public static final RegistrationProvider<EntityType<?>> ENTITY = RegistrationProvider.get(BuiltInRegistries.ENTITY_TYPE, GeodePlus.MOD_ID);

    public static final Supplier<EntityType<WrappistHornEffect>> WRAPPIST_HORN_EFFECT = createProjectile("wrappist_goat_horn",
            EntityType.Builder.of(WrappistHornEffect::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10));


    public static <E extends Entity> RegistryObject<EntityType<E>> createEntity(String id, EntityType.Builder<E> entityType) {
        return ENTITY.register(id, () -> entityType.build(GeodePlus.MOD_ID + ":" + id));
    }

    public static <E extends Projectile> RegistryObject<EntityType<E>> createProjectile(String id, EntityType.Builder<E> entityType) {
        return ENTITY.register(id, () -> entityType.build(GeodePlus.MOD_ID + ":" + id));
    }
    public static void init() {}
}

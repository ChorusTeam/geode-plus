package net.yeoxuhang.geode_plus.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class GeodePlusClient {

	public static final ModelLayerLocation WRAPPIST_PEDESTAL = new ModelLayerLocation(GeodePlus.createResource("wrappist_pedestal"), "main");

	public static void renderTypes(Consumer<Map<Block, RenderType>> mapConsumer) {
		Map<Block, RenderType> map = new HashMap<>();

		map.put(BlockRegistry.PINK_TOPAZ_CRYSTAL.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_PINK_TOPAZ_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_PINK_TOPAZ_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.CELESTITE_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_CELESTITE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_CELESTITE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_CELESTITE_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.LAPIS_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_LAPIS_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_LAPIS_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_LAPIS_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.REDSTONE_CRYSTAL.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_REDSTONE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_REDSTONE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_REDSTONE_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.EMERALD_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_EMERALD_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_EMERALD_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_EMERALD_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.DIAMOND_CRYSTAL.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_DIAMOND_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_DIAMOND_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_DIAMOND_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.QUARTZ_CRYSTAL.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_QUARTZ_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_QUARTZ_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_QUARTZ_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.GOLD_NUGGET_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_GOLD_NUGGET_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.GLOWSTONE_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_GLOWSTONE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_GLOWSTONE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_GLOWSTONE_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.ECHO_CRYSTAL.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_ECHO_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_ECHO_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_ECHO_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.WRAPPIST_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_WRAPPIST_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_WRAPPIST_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_WRAPPIST_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.PRISMARINE_CLUSTER.get(), RenderType.cutout());
		map.put(BlockRegistry.LARGE_PRISMARINE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.MEDIUM_PRISMARINE_BUD.get(), RenderType.cutout());
		map.put(BlockRegistry.SMALL_PRISMARINE_BUD.get(), RenderType.cutout());

		map.put(BlockRegistry.WRAPPIST_GLASS.get(), RenderType.cutout());
		map.put(BlockRegistry.CELESTITE_GLASS.get(), RenderType.cutout());
		map.put(BlockRegistry.PINK_TOPAZ_GLASS.get(), RenderType.cutout());

		map.put(BlockRegistry.WRAPPIST_PEDESTAL.get(), RenderType.cutout());
		mapConsumer.accept(map);
		GeodePlus.logInfo("Texture Cutouts Rendered");
	}
	public static void init(){}
}

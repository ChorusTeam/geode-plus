package net.yeoxuhang.geode_plus;

import net.minecraft.resources.ResourceLocation;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class GeodePlus {
    public static ServerConfigs CONFIG;
    public static final String MOD_ID = "geode_plus";
    public static final String MOD_NAME = "Geode Plus";
    public static final String MOD_DESCRIPTION = "A Forge/Fabric mod that add geodes to Minecraft Overworld, Nether and even The End!";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static void init() {
        ItemRegistry.init();
        TrimMaterialsAndPatternsRegistry.init();
        BlockRegistry.init();
        BlockEntityRegistry.init();
        FeatureRegistry.init();
        //GeodePlusEntityRegistry.init();
        PlacedFeatureRegistry.init();
        ConfiguredFeatureRegistry.init();
        logInfo(MOD_DESCRIPTION);
    }
    public static void setUpConfig(ServerConfigs config) {
        CONFIG = config;
    }

    public static ResourceLocation createResource(String s){
        return new ResourceLocation(MOD_ID, s);
    }

    public static void logWarning(String msg) {
        LOGGER.warn("Geode Plus: " + msg);
    }
    public static void logWarning(String s, IOException e) {
        LOGGER.warn("Geode Plus:" + s, e);
    }

    public static void logInfo(String msg) {
        LOGGER.info("Geode Plus: " + msg);
    }
    public static void logDebug(String msg) {
        LOGGER.debug("Geode Plus: " + msg);
    }
    public static <T> void logDebug(String msg, T loadedService, Class<T> clazz) {
        LOGGER.info("Geode Plus: " + msg, loadedService, clazz);
    }
    public static void logError(String msg) {
        LOGGER.error("Geode Plus: " + msg);
    }
    public static void logError(String msg, Throwable throwable) {
        LOGGER.error("Geode Plus:" + msg, throwable);
    }
}
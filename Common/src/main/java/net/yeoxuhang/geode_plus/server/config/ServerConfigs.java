package net.yeoxuhang.geode_plus.server.config;

import net.yeoxuhang.geode_plus.GeodePlus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import static net.yeoxuhang.geode_plus.util.BooleanEnumGetter.asBoolean;

public class ServerConfigs {

    public ServerConfigs(Path path){
        File configDir = path.resolve("Geode Plus").toFile();
        if (!configDir.exists()) {
            if (!configDir.mkdir()) {
                GeodePlus.logWarning("Could not create configuration directory: " + configDir.getAbsolutePath());
            }
        }
        Path geodePlus = configDir.toPath();
        WORLDGEN.setUpConfig(geodePlus);
        BLOCKS.setUpConfig(geodePlus);
    }



    public static class WORLDGEN {
        public static boolean shouldGenerateEchoGeodes;
        public static boolean shouldGenerateDiamondGeodes;
        public static boolean shouldGenerateEmeraldGeodes;
        public static boolean shouldGenerateLapisGeodes;
        public static boolean shouldGenerateRedstoneGeodes;

        public static boolean shouldGenerateCelestiteGeodes;
        public static boolean shouldGeneratePinkTopazGeodes;
        public static boolean shouldGeneratePrismarineGeodes;

        public static boolean shouldGenerateNetherDebrisGeodes;
        public static boolean shouldGenerateNetherGlowstoneGeodes;
        public static boolean shouldGenerateNetherGoldNuggetGeodes;
        public static boolean shouldGenerateNetherQuartzGeodes;

        public static boolean shouldGenerateWrappistGeodes;
        //Large Crystal
        public static boolean shouldGenerateEchoCrystal;
        public static boolean shouldGeneratePrismarineCrystal;

        public static boolean shouldGenerateQuartzCrystal;
        public static boolean shouldGenerateGlowstoneCrystal;

        public static boolean shouldGenerateWrappistCrystal;

        public static void setUpConfig(Path path){
            File configDir = path.resolve("worldgen").toFile();
            if (!configDir.exists()) {
                if (!configDir.mkdir()) {
                    GeodePlus.logWarning("Could not create configuration directory: " + configDir.getAbsolutePath());
                }
            }

            File overworldGeode = new File(configDir, "overworldGeodes.properties");
            Properties overworldGeodeProperties = new Properties();

            if (overworldGeode.exists()) {
                try (FileInputStream stream = new FileInputStream(overworldGeode)) {
                    overworldGeodeProperties.load(stream);
                } catch (IOException e) {
                    GeodePlus.logWarning("Could not read property file '" + overworldGeode.getAbsolutePath() + "'", e);
                }
            }
            shouldGenerateEchoGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateEchoGeodes", (a) -> "true"), true);
            shouldGenerateDiamondGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateDiamondGeodes", (a) -> "true"), true);
            shouldGenerateEmeraldGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateEmeraldGeodes", (a) -> "true"), true);
            shouldGenerateLapisGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateLapisGeodes", (a) -> "true"), true);
            shouldGenerateRedstoneGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateRedstoneGeodes", (a) -> "true"), true);
            shouldGeneratePinkTopazGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGeneratePinkTopazGeodes", (a) -> "true"), true);
            shouldGenerateCelestiteGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGenerateCelestiteGeodes", (a) -> "true"), true);
            shouldGeneratePrismarineGeodes = asBoolean((String) overworldGeodeProperties.computeIfAbsent("shouldGeneratePrismarineGeodes", (a) -> "true"), true);

            try (FileOutputStream stream = new FileOutputStream(overworldGeode)) {
                overworldGeodeProperties.store(stream, "Overworld Geodes properties file");
            } catch (IOException e) {
                GeodePlus.logWarning("Could not store property file '" + overworldGeode.getAbsolutePath() + "'", e);
            }

            File netherGeode = new File(configDir, "netherGeodes.properties");
            Properties netherGeodeProperties = new Properties();

            if (netherGeode.exists()) {
                try (FileInputStream stream = new FileInputStream(netherGeode)) {
                    netherGeodeProperties.load(stream);
                } catch (IOException e) {
                    GeodePlus.logWarning("Could not read property file '" + netherGeode.getAbsolutePath() + "'", e);
                }
            }
            //To keep the game balance, the default value is set to false.
            shouldGenerateNetherDebrisGeodes = asBoolean((String) netherGeodeProperties.computeIfAbsent("shouldGenerateNetherDebrisGeodes", (a) -> "false"), false);

            shouldGenerateNetherGlowstoneGeodes = asBoolean((String) netherGeodeProperties.computeIfAbsent("shouldGenerateNetherGlowstoneGeodes", (a) -> "true"), true);
            shouldGenerateNetherGoldNuggetGeodes = asBoolean((String) netherGeodeProperties.computeIfAbsent("shouldGenerateNetherGoldNuggetGeodes", (a) -> "true"), true);
            shouldGenerateNetherQuartzGeodes = asBoolean((String) netherGeodeProperties.computeIfAbsent("shouldGenerateNetherQuartzGeodes", (a) -> "true"), true);

            try (FileOutputStream stream = new FileOutputStream(netherGeode)) {
                netherGeodeProperties.store(stream, "Nether Geodes properties file");
            } catch (IOException e) {
                GeodePlus.logWarning("Could not store property file '" + netherGeode.getAbsolutePath() + "'", e);
            }

            File theEndGeode = new File(configDir, "theEndGeodes.properties");
            Properties theEndGeodeProperties = new Properties();

            if (theEndGeode.exists()) {
                try (FileInputStream stream = new FileInputStream(theEndGeode)) {
                    theEndGeodeProperties.load(stream);
                } catch (IOException e) {
                    GeodePlus.logWarning("Could not read property file '" + theEndGeode.getAbsolutePath() + "'", e);
                }
            }
            shouldGenerateWrappistGeodes = asBoolean((String) theEndGeodeProperties.computeIfAbsent("shouldGenerateWrappistGeode", (a) -> "true"), true);

            try (FileOutputStream stream = new FileOutputStream(theEndGeode)) {
                theEndGeodeProperties.store(stream, "The End Geodes properties file");
            } catch (IOException e) {
                GeodePlus.logWarning("Could not store property file '" + theEndGeode.getAbsolutePath() + "'", e);
            }



            //Large Crystals
            File largeCrystals = new File(configDir, "largeCrystal.properties");
            Properties largeCrystalsProperties = new Properties();

            if (largeCrystals.exists()) {
                try (FileInputStream stream = new FileInputStream(largeCrystals)) {
                    largeCrystalsProperties.load(stream);
                } catch (IOException e) {
                    GeodePlus.logWarning("Could not read property file '" + largeCrystals.getAbsolutePath() + "'", e);
                }
            }
            shouldGenerateEchoCrystal = asBoolean((String) largeCrystalsProperties.computeIfAbsent("shouldGenerateEchoCrystal", (a) -> "true"), true);
            shouldGeneratePrismarineCrystal = asBoolean((String) largeCrystalsProperties.computeIfAbsent("shouldGeneratePrismarineCrystal", (a) -> "true"), true);

            shouldGenerateQuartzCrystal = asBoolean((String) largeCrystalsProperties.computeIfAbsent("shouldGenerateQuartzCrystal", (a) -> "true"), true);
            shouldGenerateGlowstoneCrystal = asBoolean((String) largeCrystalsProperties.computeIfAbsent("shouldGenerateGlowstoneCrystal", (a) -> "true"), true);

            shouldGenerateWrappistCrystal = asBoolean((String) largeCrystalsProperties.computeIfAbsent("shouldGenerateWrappistCrystal", (a) -> "true"), true);

            try (FileOutputStream stream = new FileOutputStream(largeCrystals)) {
                largeCrystalsProperties.store(stream, "Large Crystal properties file");
            } catch (IOException e) {
                GeodePlus.logWarning("Could not store property file '" + largeCrystals.getAbsolutePath() + "'", e);
            }
        }
    }

    public static class BLOCKS {
        public static boolean allowSilkTouch;
        public static void setUpConfig(Path path){
            File configDir = path.resolve("blocks").toFile();
            if (!configDir.exists()) {
                if (!configDir.mkdir()) {
                    GeodePlus.logWarning("Could not create configuration directory: " + configDir.getAbsolutePath());
                }
            }

            File configFile = new File(configDir, "blocks.properties");
            Properties properties = new Properties();

            if (configFile.exists()) {
                try (FileInputStream stream = new FileInputStream(configFile)) {
                    properties.load(stream);
                } catch (IOException e) {
                    GeodePlus.logWarning("Could not read property file '" + configFile.getAbsolutePath() + "'", e);
                }
            }

            //To keep the game balance, the default value is set to false.
            allowSilkTouch = asBoolean((String) properties.computeIfAbsent("allowSilkTouch", (a) -> "false"), false);

            try (FileOutputStream stream = new FileOutputStream(configFile)) {
                properties.store(stream, "Blocks properties file");
            } catch (IOException e) {
                GeodePlus.logWarning("Could not store property file '" + configFile.getAbsolutePath() + "'", e);
            }
        }
    }
}

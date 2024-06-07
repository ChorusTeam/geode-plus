package net.yeoxuhang.geode_plus;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

public class GeodePlusLangProvider extends LanguageProvider {
    private static final String NORMAL_CHARS = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_,;.?!/\\'";
    private static final String UPSIDE_DOWN_CHARS = " ɐqɔpǝɟbɥıظʞןɯuodbɹsʇnʌʍxʎzⱯᗺƆᗡƎℲ⅁HIſʞꞀWNOԀὉᴚS⟘∩ΛMXʎZ0ƖᄅƐㄣϛ9ㄥ86‾'؛˙¿¡/\\,";
    private final boolean upsideDown;

    public GeodePlusLangProvider(PackOutput packOutput, String locale, boolean upsideDown) {
        super(packOutput, GeodePlus.MOD_ID, locale);
        this.upsideDown = upsideDown;
    }

    @Override
    protected void addTranslations() {
        BlockRegistry.BLOCK.getEntries().forEach(this::addBlock);
        ItemRegistry.ITEM.getEntries().stream().filter(item -> !(item.get() instanceof BlockItem)).forEach(this::addItem);
        add("itemGroup.geode_plus", "Geode+");
        add("trim_pattern.geode_plus.wrap", "Wrap Armor Trim");
        add("trim_pattern.geode_plus.celeste", "Celeste Armor Trim");
        add("trim_pattern.geode_plus.heart", "Heart Armor Trim");
        add("trim_material.geode_plus.wrappist","Wrappist Material");
        add("trim_material.geode_plus.celestite","Celestite Material");
        add("trim_material.geode_plus.pink_topaz","Pink Topaz Material");
        add("wrappist_pedestal.geode_plus.not_enought_xp", "§l§cRequired 30 Levels");
    }

    @Override
    public void add(String key, String value) {
        if(upsideDown) super.add(key, toUpsideDown(value));
        else super.add(key, value);
    }

    private void addBlock(RegistryObject<Block> block) {
        String key = block.getId().getPath();
        super.add("block.geode_plus." + key, convertToName(key));
    }

    private void addItem(RegistryObject<Item> item) {
        String key = item.getId().getPath();
        super.add("item.geode_plus." + key, convertToName(key));
    }

    private String convertToName(String key) {
        StringBuilder builder = new StringBuilder(key.substring(0, 1).toUpperCase() + key.substring(1));
        for(int i = 1; i < builder.length(); i++) {
            if(builder.charAt(i) == '_') {
                builder.deleteCharAt(i);
                builder.replace(i, i + 1, " " + Character.toUpperCase(builder.charAt(i)));
            }
        }
        String name = builder.toString();
        return upsideDown ? toUpsideDown(name) : name;
    }

    private static String toUpsideDown(String name) {
        StringBuilder builder = new StringBuilder();

        for(int i = name.length() - 1; i >= 0; i--) {
            if(i > 2 && name.substring(i - 3, i + 1).equals("%1$s")) {
                builder.append(name, i - 3, i + 1);
                i -= 4;
                continue;
            }

            char upsideDown = UPSIDE_DOWN_CHARS.charAt(NORMAL_CHARS.indexOf(name.charAt(i)));
            builder.append(upsideDown);
        }

        return builder.toString();
    }
}
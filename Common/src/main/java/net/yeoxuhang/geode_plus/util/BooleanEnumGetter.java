package net.yeoxuhang.geode_plus.util;

import java.util.Locale;

public class BooleanEnumGetter {
    public static boolean asBoolean(String property, boolean defValue) {
        switch (asTriState(property)) {
            case TRUE -> {
                return true;
            }
            case FALSE -> {
                return false;
            }
            default -> {
                return defValue;
            }
        }
    }

    public static <T extends Enum> Enum asEnum(String property, T defValue) {
        if (property != null && !property.isEmpty()) {
            Enum[] var2 = (Enum[])defValue.getClass().getEnumConstants();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                Enum obj = var2[var4];
                if (property.equalsIgnoreCase(obj.name())) {
                    return obj;
                }
            }

            return defValue;
        } else {
            return defValue;
        }
    }

    private static TriState asTriState(String property) {
        if (property != null && !property.isEmpty()) {
            switch (property.toLowerCase(Locale.ROOT)) {
                case "true":
                    return TriState.TRUE;
                case "false":
                    return TriState.FALSE;
                case "auto":
                default:
                    return TriState.DEFAULT;
            }
        } else {
            return TriState.DEFAULT;
        }
    }
}

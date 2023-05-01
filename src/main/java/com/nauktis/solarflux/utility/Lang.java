package com.nauktis.solarflux.utility;

import net.minecraft.util.StatCollector;

import com.nauktis.solarflux.reference.Reference;

public final class Lang {

    public static final String MOD_PREFIX = "info." + Reference.MOD_ID.toLowerCase() + ".";

    private Lang() {

    }

    public static String localise(String pText) {
        return localise(pText, true);
    }

    public static String localise(String pText, boolean pAppendModPrefix) {
        if (pAppendModPrefix) {
            pText = MOD_PREFIX + pText;
        }
        return StatCollector.translateToLocal(pText);
    }
}

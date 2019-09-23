package com.java.lol.job;

import java.util.HashSet;

/**
 * 斗士
 */
public class Fighter extends JobSpecies {

    private static String powerStr = "（两个斗士）斗士血量增加30%\n\t（四个斗士）斗士血量增加100%";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Warwick");
                    }
                };
    }
    private Fighter() {
        super("斗士","Fighter",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }
    @Override
    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "斗士血量增加30%";
        } else if (count >= triggerMaxCount) {
            return "斗士血量增加100%";
        }
        return null;
    }

    private static class SingletonInner {
        private static Fighter singletonStaticInner = new Fighter();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

package com.java.lol.job;

import java.util.HashSet;

/**
 * 枪手
 */
public class Gunners extends JobSpecies {
    private static String powerStr = "（两个枪手）50%几率攻击另一敌人\n\t（四个枪手）50%几率攻击全体敌人";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Tristana");
                        add("Lucian");
                    }
                };
    }
    private Gunners() {
        super("枪手","Gunners",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "50%几率攻击另一敌人";
        } else if (count >= triggerMaxCount) {
            return "50%几率攻击全体敌人";
        }
        return null;
    }

    private static class SingletonInner {
        private static Gunners singletonStaticInner = new Gunners();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

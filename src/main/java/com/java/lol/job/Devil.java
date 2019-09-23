package com.java.lol.job;

import java.util.HashSet;

public class Devil extends JobSpecies {

    private static String powerStr = "（两个恶魔）40%燃烧敌方法力造成额外伤害\n\t（四个恶魔）60%燃烧敌方法力造成额外伤害\n\t（六个恶魔）80%燃烧敌方法力造成额外伤害";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Atox");
                    }
                };
    }

    private Devil() {
        super("恶魔","Devil",
                powerStr);
        triggerCount = 2;
        triggerCount2 = 4;
        triggerMaxCount = 6;
    }

    @Override
    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "40%燃烧敌方法力造成额外伤害";
        } else if (count >= triggerCount2) {
            return "60%燃烧敌方法力造成额外伤害";
        } else if (count >= triggerMaxCount) {
            return "80%燃烧敌方法力造成额外伤害";
        }

        return null;
    }

    private static class SingletonInner {
        private static Devil singletonStaticInner = new Devil();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

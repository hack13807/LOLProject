package com.java.lol.job;

import java.util.HashSet;

/**
 * 帝国
 */
public class Empire extends JobSpecies {
    private static String powerStr = "（两个帝国）随机一名帝国单位双倍伤害\n\t（四个帝国）全体帝国单位双倍伤害";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Draven");
                    }
                };
    }

    private Empire() {
        super("帝国","Empire",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    @Override
    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "随机一名帝国单位双倍伤害";
        } else if (count >= triggerMaxCount) {
            return "全体帝国单位双倍伤害";
        }

        return null;
    }

    private static class SingletonInner {
        private static Empire singletonStaticInner = new Empire();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

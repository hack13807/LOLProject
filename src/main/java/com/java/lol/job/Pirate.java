package com.java.lol.job;

import java.util.HashSet;

/**
 * 海盗
 */
public class Pirate extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Plonk");
                        add("Graves");
                    }
                };
    }

    private static String powerStr = "（三个海盗）战斗完毕一定几率获得0-4枚金币";

    private Pirate() {
        super("海盗", "Pirate", powerStr);
        triggerCount = 3;
        triggerMaxCount = 3;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "战斗完毕一定几率获得0-4枚金币";
        }else if (count >= triggerMaxCount) {
            return "战斗完毕一定几率获得0-4枚金币";
        }
        return null;
    }

    private static class SingletonInner {
        private static Pirate singletonStaticInner = new Pirate();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

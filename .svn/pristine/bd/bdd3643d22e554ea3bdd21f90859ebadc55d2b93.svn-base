package com.java.lol.job;

import java.util.HashSet;

/**
 * 剑士
 */
public class Swordsman extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Plonk");
                    }
                };
    }
    private static String powerStr = "（三个剑士）45%额外攻击一次\n\r（六个剑士）45%额外攻击两次";

    private Swordsman() {
        super("剑士", "Swordsman", powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "45%额外攻击一次";
        }else if (count >= triggerMaxCount) {
            return "45%额外攻击两次";
        }
        return null;
    }

    private static class SingletonInner {
        private static Swordsman singletonStaticInner = new Swordsman();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

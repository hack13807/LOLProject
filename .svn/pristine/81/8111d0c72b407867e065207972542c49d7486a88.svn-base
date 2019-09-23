package com.java.lol.job;

import java.util.HashSet;

public class Rogue extends JobSpecies {
    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount){
            return "浪人开场获得和自己生命值相等的护盾";
        }
        return null;
    }

    private static String powerStr = "（浪人）开场获得和自己生命值相等的护盾";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Asia");
                    }
                };
    }
    private Rogue() {
        super("浪人","Rogue",
                powerStr);
        triggerCount = 1;
        triggerMaxCount = 1;
    }

    private static class SingletonInner {
        private static Rogue singletonStaticInner = new Rogue();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

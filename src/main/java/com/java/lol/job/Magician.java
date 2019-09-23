package com.java.lol.job;

import java.util.HashSet;

public class Magician extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Ali");
                    }
                };
    }

    private static String powerStr = "（三个法师）全体队友+35%技能伤害\n\r（六个法师）全体队友+100%技能伤害";

    private Magician() {
        super("法师", "Magician",
                powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "全体队友+35%技能伤害";
        }else if (count >= triggerMaxCount) {
            return "全体队友+100%技能伤害";
        }
        return null;
    }

    private static class SingletonInner {
        private static Magician singletonStaticInner = new Magician();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

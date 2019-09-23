package com.java.lol.job;

import java.util.HashSet;

public class Poles extends JobSpecies {
    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerCount2){
            return "普攻20%冰冻敌方单位";
        }else if (count >= triggerCount2 &&count < triggerMaxCount) {
            return "普攻40%冰冻敌方单位";
        }else if (count >= triggerMaxCount) {
            return "普攻60%冰冻敌方单位";
        }
        return null;
    }

    private static String powerStr = "（两个极地）普攻20%冰冻敌方单位\n\r（四个极地）普攻40%冰冻敌方单位\n" +
            "\n" +
            "（六个极地）普攻60%冰冻敌方单位";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Volibear");
                    }
                };
    }
    private Poles() {
        super("极地","Poles",
                powerStr);
        triggerCount = 2;
        triggerCount2 = 4;
        triggerMaxCount = 6;
    }

    private static class SingletonInner {
        private static Poles singletonStaticInner = new Poles();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

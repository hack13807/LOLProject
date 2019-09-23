package com.java.lol.job;

import java.util.HashSet;

public class Wildness extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Nidalee");
                        add("Warwick");
                    }
                };
    }

    private static String powerStr = "（两个狂野）狂野单位每次攻击后增加攻速，最高5层\n\r（四个狂野）全体队友每次攻击后增加攻速，最高5层";

    private Wildness() {
        super("狂野", "Wildness", powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "狂野单位每次攻击后增加攻速，最高5层";
        }else if (count >= triggerMaxCount) {
            return "全体单位每次攻击后增加攻速，最高5层";
        }
        return null;
    }

    private static class SingletonInner {
        private static Wildness singletonStaticInner = new Wildness();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

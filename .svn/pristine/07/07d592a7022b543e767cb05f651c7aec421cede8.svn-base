package com.java.lol.job;

import java.util.HashSet;

/**
 * 约德尔人
 */
public class Yodel extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Tristana");
                    }
                };
    }

    private static String powerStr = "（三个约德尔人）35%闪避\n\r（六个约德尔人）60%闪避普通攻击";

    private Yodel() {
        super("约德尔人", "Yodel", powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    public String isPower(int count){
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "35%闪避普通攻击";
        }else if (count >= triggerMaxCount) {
            return "60%闪避普通攻击";
        }
        return null;
    }
    private static class SingletonInner {
        private static Yodel singletonStaticInner = new Yodel();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }


}

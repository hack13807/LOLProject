package com.java.lol.job;

import java.util.HashSet;

/**
 * 贵族
 */
public class Noble extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Lucian");
                    }
                };
    }

    private static String powerStr = "（三个贵族）随机队友+100护甲，每次攻击回复30生命值\n\r（六个贵族）全体队友+100护甲，每次攻击回复30生命值";

    private Noble() {
        super("贵族", "Noble",
                powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    public String isPower(int count){
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "随机队友+100护甲，每次攻击回复30生命值";
        }else if (count >= triggerMaxCount) {
            return "全体队友+100护甲，每次攻击回复30生命值";
        }
        return null;
    }

    private static class SingletonInner {
        private static Noble singletonStaticInner = new Noble();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

package com.java.lol.job;

import java.util.HashSet;

public class Ninja extends JobSpecies {
    {
        pieceSet =
                new HashSet() {
                    {
                        add("Shen");
                    }
                };
    }

    private static String powerStr = "£¨Ò»¸öÈÌÕß£©+40%ÆÕ¹¥ÉËº¦\n\r£¨ËÄ¸öÈÌÕß£©+80%ÆÕ¹¥ÉËº¦";

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count == triggerCount ){
            return "+40%ÆÕ¹¥ÉËº¦";
        }else if (count == triggerMaxCount) {
            return "+80%ÆÕ¹¥ÉËº¦";
        }
        return null;
    }

    private Ninja() {
        super("ÈÌÕß", "Ninja",
                powerStr);
        triggerCount = 1;
        triggerMaxCount = 4;
    }

    private static class SingletonInner {
        private static Ninja singletonStaticInner = new Ninja();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }

}

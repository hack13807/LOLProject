package com.java.lol.job;

import java.util.HashSet;

/**
 * ��ʿ
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
    private static String powerStr = "��������ʿ��45%���⹥��һ��\n\r��������ʿ��45%���⹥������";

    private Swordsman() {
        super("��ʿ", "Swordsman", powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "45%���⹥��һ��";
        }else if (count >= triggerMaxCount) {
            return "45%���⹥������";
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

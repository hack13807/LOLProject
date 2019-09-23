package com.java.lol.job;

import java.util.HashSet;

public class Poles extends JobSpecies {
    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerCount2){
            return "�չ�20%�����з���λ";
        }else if (count >= triggerCount2 &&count < triggerMaxCount) {
            return "�չ�40%�����з���λ";
        }else if (count >= triggerMaxCount) {
            return "�չ�60%�����з���λ";
        }
        return null;
    }

    private static String powerStr = "���������أ��չ�20%�����з���λ\n\r���ĸ����أ��չ�40%�����з���λ\n" +
            "\n" +
            "���������أ��չ�60%�����з���λ";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Volibear");
                    }
                };
    }
    private Poles() {
        super("����","Poles",
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

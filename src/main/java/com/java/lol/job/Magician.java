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

    private static String powerStr = "��������ʦ��ȫ�����+35%�����˺�\n\r��������ʦ��ȫ�����+100%�����˺�";

    private Magician() {
        super("��ʦ", "Magician",
                powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "ȫ�����+35%�����˺�";
        }else if (count >= triggerMaxCount) {
            return "ȫ�����+100%�����˺�";
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

package com.java.lol.job;

import java.util.HashSet;

/**
 * ����
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

    private static String powerStr = "���������壩�������+100���ף�ÿ�ι����ظ�30����ֵ\n\r���������壩ȫ�����+100���ף�ÿ�ι����ظ�30����ֵ";

    private Noble() {
        super("����", "Noble",
                powerStr);
        triggerCount = 3;
        triggerMaxCount = 6;
    }

    public String isPower(int count){
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "�������+100���ף�ÿ�ι����ظ�30����ֵ";
        }else if (count >= triggerMaxCount) {
            return "ȫ�����+100���ף�ÿ�ι����ظ�30����ֵ";
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

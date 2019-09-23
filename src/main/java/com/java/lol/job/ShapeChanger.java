package com.java.lol.job;

import java.util.HashSet;

/**
 * ����ʦ
 */
public class ShapeChanger extends JobSpecies {

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Nar");
                    }
                };
    }

    private static String powerStr = "����������ʦ���������Ѫ������100%";

    private ShapeChanger() {
        super("����ʦ", "ShapeChanger", powerStr);
        triggerCount = 3;
        triggerMaxCount = 3;
    }
    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "�������Ѫ������100%";
        }else if (count >= triggerMaxCount) {
            return "�������Ѫ������100%";
        }
        return null;
    }

    private static class SingletonInner {
        private static ShapeChanger singletonStaticInner = new ShapeChanger();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

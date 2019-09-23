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

    private static String powerStr = "��������Ұ����Ұ��λÿ�ι��������ӹ��٣����5��\n\r���ĸ���Ұ��ȫ�����ÿ�ι��������ӹ��٣����5��";

    private Wildness() {
        super("��Ұ", "Wildness", powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "��Ұ��λÿ�ι��������ӹ��٣����5��";
        }else if (count >= triggerMaxCount) {
            return "ȫ�嵥λÿ�ι��������ӹ��٣����5��";
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

package com.java.lol.job;

import java.util.HashSet;

/**
 * ǹ��
 */
public class Gunners extends JobSpecies {
    private static String powerStr = "������ǹ�֣�50%���ʹ�����һ����\n\t���ĸ�ǹ�֣�50%���ʹ���ȫ�����";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Tristana");
                        add("Lucian");
                    }
                };
    }
    private Gunners() {
        super("ǹ��","Gunners",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "50%���ʹ�����һ����";
        } else if (count >= triggerMaxCount) {
            return "50%���ʹ���ȫ�����";
        }
        return null;
    }

    private static class SingletonInner {
        private static Gunners singletonStaticInner = new Gunners();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

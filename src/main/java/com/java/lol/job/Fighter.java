package com.java.lol.job;

import java.util.HashSet;

/**
 * ��ʿ
 */
public class Fighter extends JobSpecies {

    private static String powerStr = "��������ʿ����ʿѪ������30%\n\t���ĸ���ʿ����ʿѪ������100%";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Warwick");
                    }
                };
    }
    private Fighter() {
        super("��ʿ","Fighter",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }
    @Override
    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "��ʿѪ������30%";
        } else if (count >= triggerMaxCount) {
            return "��ʿѪ������100%";
        }
        return null;
    }

    private static class SingletonInner {
        private static Fighter singletonStaticInner = new Fighter();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

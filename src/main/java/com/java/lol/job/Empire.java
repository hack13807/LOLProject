package com.java.lol.job;

import java.util.HashSet;

/**
 * �۹�
 */
public class Empire extends JobSpecies {
    private static String powerStr = "�������۹������һ���۹���λ˫���˺�\n\t���ĸ��۹���ȫ��۹���λ˫���˺�";

    {
        pieceSet =
                new HashSet() {
                    {
                        add("Draven");
                    }
                };
    }

    private Empire() {
        super("�۹�","Empire",
                powerStr);
        triggerCount = 2;
        triggerMaxCount = 4;
    }

    @Override
    public String isPower(int count) {
        if (count < triggerCount) return null;

        if (count >= triggerCount && count < triggerMaxCount) {
            return "���һ���۹���λ˫���˺�";
        } else if (count >= triggerMaxCount) {
            return "ȫ��۹���λ˫���˺�";
        }

        return null;
    }

    private static class SingletonInner {
        private static Empire singletonStaticInner = new Empire();
    }
    public static JobSpecies getInstance() {
        return SingletonInner.singletonStaticInner;
    }
}

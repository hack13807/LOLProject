package com.java.lol.job;

import java.util.HashSet;

/**
 * 换形师
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

    private static String powerStr = "（三个换形师）变身额外血量增加100%";

    private ShapeChanger() {
        super("换形师", "ShapeChanger", powerStr);
        triggerCount = 3;
        triggerMaxCount = 3;
    }
    @Override
    public String isPower(int count) {
        if (count<triggerCount) return null;

        if (count >= triggerCount &&count < triggerMaxCount){
            return "变身额外血量增加100%";
        }else if (count >= triggerMaxCount) {
            return "变身额外血量增加100%";
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

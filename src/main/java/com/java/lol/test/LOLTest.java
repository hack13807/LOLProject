package com.java.lol.test;

import com.java.lol.common.Lineup;
import com.java.lol.common.PieceFactory;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class LOLTest {
    @Test
    public void lol() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List list = new ArrayList();

        list.add(PieceFactory.getPieceInstance("����"));
        list.add(PieceFactory.getPieceInstance("��ǹ"));
        list.add(PieceFactory.getPieceInstance("Ůǹ"));
        list.add(PieceFactory.getPieceInstance("����"));
        list.add(PieceFactory.getPieceInstance("��"));
        list.add(PieceFactory.getPieceInstance("��ħ"));
        list.add(PieceFactory.getPieceInstance("������"));
        list.add(PieceFactory.getPieceInstance("�°���&��ʿ"));

        String lineupResult = new Lineup(list).getLineupResult();
        System.out.println(lineupResult);
    }


}

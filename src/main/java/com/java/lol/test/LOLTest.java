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

        list.add(PieceFactory.getPieceInstance("´¬³¤"));
        list.add(PieceFactory.getPieceInstance("ÄÐÇ¹"));
        list.add(PieceFactory.getPieceInstance("Å®Ç¹"));
        list.add(PieceFactory.getPieceInstance("½£¼§"));
        list.add(PieceFactory.getPieceInstance("É÷"));
        list.add(PieceFactory.getPieceInstance("½£Ä§"));
        list.add(PieceFactory.getPieceInstance("µÂÀ³ÎÄ"));
        list.add(PieceFactory.getPieceInstance("°Â°ÍÂí&½£Ê¿"));

        String lineupResult = new Lineup(list).getLineupResult();
        System.out.println(lineupResult);
    }


}

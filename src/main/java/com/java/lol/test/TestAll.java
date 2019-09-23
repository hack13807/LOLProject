package com.java.lol.test;

import java.util.*;

public class TestAll {

    public static void say(){
        System.out.println("asdasd");
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(1);
        set.remove(1);

        Map map = new HashMap();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        map.remove(2);


        for (Object s:set
             ) {
            System.out.println(s);
        }

        System.out.println("asdasdas");
    }
}

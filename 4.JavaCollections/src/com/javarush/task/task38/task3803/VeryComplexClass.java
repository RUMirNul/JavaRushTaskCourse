package com.javarush.task.task38.task3803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        List<Integer> list = new ArrayList<Integer>();
        ((LinkedList<Integer>) list).add(15);
    }

    public void methodThrowsNullPointerException() {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        map.put(null, null);
        map.put(null,null);
        map.put(100, 10);
        map.get(null);
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(14.1, "Hi");
        labels.put(15.2, "We");
        labels.put(18.0, "kek");
        labels.put(23.0, "run");
        labels.put(133.0, "ds");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}

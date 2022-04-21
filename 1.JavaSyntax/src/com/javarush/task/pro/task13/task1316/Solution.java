package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] JRQ = JavarushQuest.values();
        for (JavarushQuest it : JRQ) {
            System.out.println(it.ordinal());
        }
    }
}

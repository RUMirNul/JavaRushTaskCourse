package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("ВВ", 2.5);
        grades.put("ВF", 3.5);
        grades.put("ВD", 4.2);
        grades.put("ВG", 2.2);
        grades.put("ВZ", 1.5);
    }
}

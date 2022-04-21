package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.toLowerCase().equals("понедельник")) return "Monday";
        if (ru.toLowerCase().equals("вторник")) return "Tuesday";
        if (ru.toLowerCase().equals("среда")) return "Wednesday";
        if (ru.toLowerCase().equals("четверг")) return "Thursday";
        if (ru.toLowerCase().equals("пятница")) return "Friday";
        if (ru.toLowerCase().equals("суббота")) return "Saturday";
        if (ru.toLowerCase().equals("воскресенье")) return "Sunday";
        return "Недействительный день недели";
    }
}

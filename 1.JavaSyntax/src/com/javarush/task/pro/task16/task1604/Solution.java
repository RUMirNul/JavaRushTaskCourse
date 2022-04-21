package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2002, 8, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String ruDay;
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                ruDay = "Воскресенье";
                break;
            case 2:
                ruDay = "Понедельник";
                break;
            case 3:
                ruDay = "Вторник";
                break;
            case 4:
                ruDay = "Среда";
                break;
            case 5:
                ruDay = "Четверг";
                break;
            case 6:
                ruDay = "Пятница";
                break;
            case 7:
                ruDay = "Суббота";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calendar.get(Calendar.DAY_OF_WEEK));
        }
        return ruDay;
    }
}

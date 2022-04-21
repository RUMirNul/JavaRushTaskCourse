package com.javarush.task.pro.task16.task1602;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Подчищаем хвосты
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date nowDate = new Date();
        for (int i = 0; i < brokenDates.size(); i++) {
            Date temp = brokenDates.get(i);
            if (temp.getTime() > nowDate.getTime()) {
                if (temp.getYear() > nowDate.getYear()) {
                    brokenDates.get(i).setYear(temp.getYear() - 1900);
                    if (temp.getMonth() > 0) {
                        brokenDates.get(i).setMonth(temp.getMonth() - 1);
                    } else {
                        brokenDates.get(i).setMonth(11);
                        brokenDates.get(i).setYear(brokenDates.get(i).getYear() - 1);
                    }
                }
            }
        }
    }
}

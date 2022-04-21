package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        boolean first = telNumber.length() == 13 && telNumber.matches("^\\+\\d{12}$");
        boolean second = telNumber.length() == 15 && telNumber.matches("^\\+\\d*\\(\\d{3}\\)\\d+$");
        boolean third = telNumber.length() == 10 && telNumber.matches("^\\d{10}$");
        boolean fourth = telNumber.length() == 12 && telNumber.matches("^\\d*\\(\\d{3}\\)\\d+$");
        return first || second || third || fourth;
    }

    public static void main(String[] args) {

    }
}

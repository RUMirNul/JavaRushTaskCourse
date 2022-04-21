package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] splitedString = string.split(" ");
        if (splitedString.length < 5) {
            throw new TooShortStringException();
        }
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            newString.append(splitedString[i]);
            newString.append(" ");
        }
        return newString.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}

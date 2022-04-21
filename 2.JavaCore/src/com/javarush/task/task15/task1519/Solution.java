package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) {

        Pattern patternDouble = Pattern.compile("-?\\d+\\.\\d+");
        Matcher matcherDouble = null;

        Pattern patternInteger = Pattern.compile("-?\\d+");
        Matcher matcherInteger = null;

        int digital;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String str;
            while (!((str = reader.readLine()).equals("exit"))) {
                matcherDouble = patternDouble.matcher(str);
                matcherInteger = patternInteger.matcher(str);
                if (matcherDouble.find()) {
                    print(Double.valueOf(str));
                } else if (matcherInteger.find()) {
                    digital = Integer.valueOf(str);
                    if (digital > 0 && digital < 128) {
                        print(Short.valueOf(str));
                    } else {
                        print(digital);
                    }
                } else {
                    print(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

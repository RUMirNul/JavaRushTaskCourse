package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String subURL = url.substring(url.lastIndexOf("?") + 1);
        String[] parametrs = subURL.split("&");
        String obj = null;

        StringBuilder resultParams = new StringBuilder();

        for (String str : parametrs) {
            String[] temp = str.split("=");
            resultParams.append(temp[0]);
            resultParams.append(" ");

            if (temp[0].equals("obj")) {
                obj = temp[1];
            }
        }

        System.out.println(resultParams.toString().trim());

        if (obj != null) {
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

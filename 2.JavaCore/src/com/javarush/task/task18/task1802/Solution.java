package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStreamReader = new FileInputStream(fileName.readLine());
        fileName.close();

        int min = Integer.MAX_VALUE;
        int temp;

        while (inputStreamReader.available() > 0) {
            temp = inputStreamReader.read();
            if (min > temp) {
                min = temp;
            }
        }
        inputStreamReader.close();
        System.out.println(min);

    }
}

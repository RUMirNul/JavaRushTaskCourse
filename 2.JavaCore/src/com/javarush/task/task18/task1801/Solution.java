package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        int max = Integer.MIN_VALUE;
        int readed;
        while (fileInputStream.available() > 0) {
            readed = fileInputStream.read();
            if (max < readed) {
                max = readed;
            }
        }
        fileInputStream.close();
        System.out.println(max);
    }
}

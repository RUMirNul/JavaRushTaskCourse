package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteList = new int[256];
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(fileName.readLine())) {
            while (fileInputStream.available() > 0) {
                byteList[fileInputStream.read()]++;
            }
        }
        for (int i = 0; i < byteList.length; i++) {
            if (byteList[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}

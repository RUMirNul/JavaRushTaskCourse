package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteCount = new int[256];
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(fileName.readLine())) {
            while (fileInputStream.available() > 0) {
                byteCount[fileInputStream.read()]++;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int count : byteCount) {
            if (count > 0 && count < min) min = count;
        }
        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}

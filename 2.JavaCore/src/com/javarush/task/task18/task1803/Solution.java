package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
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
        int maxCount = 0;
        for (int byteCountCount : byteCount) {
            if (byteCountCount > maxCount) maxCount = byteCountCount;
        }
        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i] == maxCount) {
                System.out.print(i + " ");
            }
        }

    }
}

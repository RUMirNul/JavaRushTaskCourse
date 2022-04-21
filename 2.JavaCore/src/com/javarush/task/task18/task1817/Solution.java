package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        int whiteSpace = 0;
        int countChar = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String str = null;
            while (bufferedReader.ready()) {
                str = bufferedReader.readLine();
                String lowerStr = str.toLowerCase();
                for (int i = 0; i < lowerStr.length(); i++) {
                    if (lowerStr.charAt(i) == ' ') {
                        whiteSpace++;
                    }
                    countChar++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("%.2f", ((double)(whiteSpace) / (double) countChar) * 100);
    }
}

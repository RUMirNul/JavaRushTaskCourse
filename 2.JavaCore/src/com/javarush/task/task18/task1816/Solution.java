package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        int countEngChar = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String str = null;
            while (bufferedReader.ready()) {
                str = bufferedReader.readLine();
                String lowerStr = str.toLowerCase();
                for (int i = 0; i < lowerStr.length(); i++) {
                    if (lowerStr.charAt(i) >= 'a' && lowerStr.charAt(i) <= 'z') {
                        countEngChar++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countEngChar);
    }
}

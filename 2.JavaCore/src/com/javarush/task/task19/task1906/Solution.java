package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader file1 = new FileReader(fileNameReader.readLine());
             FileWriter file2 = new FileWriter(fileNameReader.readLine())) {
            int i = 1;
            while (file1.ready()) {
                int c = file1.read();
                if (i % 2 == 0) {
                    file2.write(c);
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

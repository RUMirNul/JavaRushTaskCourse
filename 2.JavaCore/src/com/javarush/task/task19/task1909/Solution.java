package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(fileNameReader.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameReader.readLine()))) {
            while (reader.ready()) {
                String str = reader.readLine();
                writer.write(str.replaceAll("\\.", "!"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter file1 = new BufferedWriter(new FileWriter(fileNameReader.readLine(), true));
             BufferedReader file2 = new BufferedReader(new FileReader(fileNameReader.readLine()));
             BufferedReader file3 = new BufferedReader(new FileReader(fileNameReader.readLine()))) {
            while (file2.ready()) {
                file1.write(file2.readLine());
            }
            //file1.write("\n");
            while (file3.ready()) {
                file1.write(file3.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

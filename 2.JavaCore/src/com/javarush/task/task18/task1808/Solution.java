package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInput1 = new FileInputStream(readerFileName.readLine());
             FileOutputStream fileOutput2 = new FileOutputStream(readerFileName.readLine());
             FileOutputStream fileOutput3 = new FileOutputStream(readerFileName.readLine())) {
            int firstHalf = 0;
            int secondHalf = 0;
            firstHalf = fileInput1.available() / 2;
            secondHalf = fileInput1.available() / 2;
            if (fileInput1.available() % 2 == 1) {
                firstHalf++;
            }
            for (int i = 0; i < firstHalf; i++) {
                fileOutput2.write(fileInput1.read());
            }
            for (int i = 0; i < secondHalf; i++) {
                fileOutput3.write(fileInput1.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

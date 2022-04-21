package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {

        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = fileNameReader.readLine();
            fileName2 = fileNameReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            while (reader.ready()) {
                String temp = reader.readLine();
                String[] splittedStr = temp.split(" ");
                for (String str : splittedStr) {
                    double doubleNumber = Double.parseDouble(str);
                    long roundedNumber = Math.round(doubleNumber);
                    writer.write(roundedNumber + " ");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

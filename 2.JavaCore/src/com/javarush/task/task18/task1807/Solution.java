package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(fileName.readLine())) {
            while (fileInputStream.available() > 0) {
                int temp = fileInputStream.read();
                if (temp == ',') {
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}

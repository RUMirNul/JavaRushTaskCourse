package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(fileNameReader.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                StringBuilder str = new StringBuilder(line);
                System.out.println(str.reverse());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

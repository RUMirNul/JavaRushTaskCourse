package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        String fileNameInput = null;
        String fileNameOutput = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileNameInput = reader.readLine();
            fileNameOutput = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameInput));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameOutput))) {
            while (reader.ready()) {
                String[] splitedString = reader.readLine().split(" ");
                for (String str : splitedString) {
                    if (str.matches("^\\d+$")) {
                        writer.write(str + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameReader.readLine()))) {
            String str = null;
            while (fileReader.ready()) {
                str = fileReader.readLine();
                String[] tempData = str.split(" ");
                if (tempData[0].equals(args[0])) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

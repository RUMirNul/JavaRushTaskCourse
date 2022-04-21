package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
            StringBuilder stringBuilder = new StringBuilder();

            String str = "";
            while (!str.equals("exit")) {
                str = bufferedReader.readLine();
                stringBuilder.append(str).append("\n");
            }

            bufferedWriter.write(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

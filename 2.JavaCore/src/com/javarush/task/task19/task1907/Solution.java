package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             FileReader reader = new FileReader(fileNameReader.readLine())) {

            while (reader.ready()) {
                stringBuilder.append((char)reader.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = stringBuilder.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        String[] splitedStr = str.split(" ");
        for (String word : splitedStr) {
            if (word.equals("world")) {
                count++;
            }
        }

        System.out.println(count);
    }
}

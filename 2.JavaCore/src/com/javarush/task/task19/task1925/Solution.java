package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            StringBuilder answer = new StringBuilder();
            while (reader.ready()) {
                String line = reader.readLine();
                String[] splitedLine = line.replaceAll("\\n", " ").split(" ");
                for (String word : splitedLine) {
                    if (word.length() > 6) {
                        answer.append(word + ",");
                    }
                }
            }
            writer.write(answer.substring(0, answer.length() - 1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

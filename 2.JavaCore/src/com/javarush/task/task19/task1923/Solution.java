package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter writer = new FileWriter(args[1])) {
            StringBuilder stringBuilder = new StringBuilder();
            while (reader.ready()) {
                String line = reader.readLine();
                for (String s : line.split(" ")) {
                    if (s.matches(".*[1-9].*")) {
                        stringBuilder.append(s + " ");
                    }

                }
            }
            writer.write(stringBuilder.toString().trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

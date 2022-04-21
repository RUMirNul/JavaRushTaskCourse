package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {

        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(fileNameReader.readLine()))) {
            int count = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                for (String s : line.split(" ")) {
                    for (String w : words) {
                        if (s.equals(w)) {
                            count++;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }
                count = 0;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

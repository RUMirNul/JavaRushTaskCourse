package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        if (args.length == 0) return;
        int[] ascii = new int[128];
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                ascii[reader.read()]++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > 0) {
                System.out.println((char) i + " " + ascii[i]);
            }
        }
    }
}

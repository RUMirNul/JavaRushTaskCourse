package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> input = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (int i = 0; i < input.size(); i++) {
                char[] charString = input.get(i).toCharArray();
                for (int j = 0; j < charString.length; j ++) {
                    if (charString[j] != '.' && charString[j] != ',' && charString[j] != ' ') {
                        System.out.printf("%c", charString[j]);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


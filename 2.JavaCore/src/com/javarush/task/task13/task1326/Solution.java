package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             Scanner scanner = new Scanner(new FileInputStream(bufferedReader.readLine()))) {

            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> sortedList = list.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
        for (Integer x : sortedList) {
            System.out.println(x);
        }

    }
}

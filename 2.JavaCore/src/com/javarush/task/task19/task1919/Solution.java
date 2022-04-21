package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {


    public static void main(String[] args) {
        TreeMap<String, Double> salary = new TreeMap<>();
        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);
                if (salary.containsKey(name)) {
                    value += salary.get(name);
                    salary.put(name, value);
                } else {
                    salary.put(name, value);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String key : salary.keySet()) {
            System.out.println(key + " " + salary.get(key));
        }
    }
}

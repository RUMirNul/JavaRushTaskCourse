package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
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

        TreeSet<String> peopleNameMaxSalary = new TreeSet<>();
        double maxSalary = salary.get(salary.firstKey());

        for (String key : salary.keySet()) {
            double current = salary.get(key);
            if (current > maxSalary) {
                maxSalary = current;
            }
        }

        for (String key : salary.keySet()) {
            if (salary.get(key) == maxSalary) {
                peopleNameMaxSalary.add(key);
            }
        }

        for (String name : peopleNameMaxSalary) {
            System.out.println(name);
        }
    }
}

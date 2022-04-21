package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            int year = Integer.parseInt(splitedLine[splitedLine.length - 1]);
            int month = Integer.parseInt(splitedLine[splitedLine.length - 2]) - 1;
            int day = Integer.parseInt(splitedLine[splitedLine.length - 3]);
            Calendar date = new GregorianCalendar(year, month, day);
            String name = "";
            for (int i = 0; i < splitedLine.length - 3; i++) {
                name += splitedLine[i];
                name += " ";
            }
            PEOPLE.add(new Person(name.trim(), date.getTime()));
        }
    }
}

package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static SimpleDateFormat inputData = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outputData = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args == null || args.length < 1) throw new IllegalArgumentException();
        Date bd;
        Person person;

        switch (args[0]) {
            case "-c":
                try {
                    bd = inputData.parse(args[3]);
                    if (args[2].equals("м")) {
                        person = Person.createMale(args[1], bd);
                    } else {
                        person = Person.createFemale(args[1], bd);
                    }
                    allPeople.add(person);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {
                    System.out.println(person.getName() + " " +
                            (person.getSex() == Sex.MALE ? "м" : "ж") + " " + outputData.format(person.getBirthDate()));
                }
                break;
            case "-u":
                int id = Integer.parseInt(args[1]);
                try {
                    bd = inputData.parse(args[4]);
                    person = allPeople.get(id);
                    if (person == null) throw new IllegalArgumentException();
                    person.setSex(args[3].equals("m") ? Sex.MALE : Sex.FEMALE);
                    person.setBirthDate(bd);
                    person.setName(args[2]);
                    allPeople.set(id, person);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "-d":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setBirthDate(null);
                person.setName(null);
                person.setSex(null);
                break;
        }
    }
}

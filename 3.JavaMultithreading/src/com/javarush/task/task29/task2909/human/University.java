package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double point) {
        for (Student student : students) {
            if (student.getAverageGrade() == point) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = 0;
        int id = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() > max) {
                max = students.get(i).getAverageGrade();
                id = i;
            }
        }
        return students.get(id);
    }


    public Student getStudentWithMinAverageGrade() {
        double min = Double.MAX_VALUE;
        int id = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < min) {
                min = students.get(i).getAverageGrade();
                id = i;
            }
        }
        return students.get(id);

    }

    public void expel(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
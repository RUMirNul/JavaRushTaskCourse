package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream outputStream= new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(defaultStream);
        String str = outputStream.toString();
        String[] splitedStr = str.split(" ");
        int x = 0;
        switch (splitedStr[1]) {
            case "+":
                x = Integer.parseInt(splitedStr[0]) + Integer.parseInt(splitedStr[2]);
                break;
            case "-":
                x = Integer.parseInt(splitedStr[0]) - Integer.parseInt(splitedStr[2]);
                break;
            case "*":
                x = Integer.parseInt(splitedStr[0]) * Integer.parseInt(splitedStr[2]);
                break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(splitedStr[0]);
        stringBuilder.append(" ");
        stringBuilder.append(splitedStr[1]);
        stringBuilder.append(" ");
        stringBuilder.append(splitedStr[2]);
        stringBuilder.append(" ");
        stringBuilder.append(splitedStr[3]);
        stringBuilder.append(" ");
        stringBuilder.append(x);
        System.out.print(stringBuilder.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


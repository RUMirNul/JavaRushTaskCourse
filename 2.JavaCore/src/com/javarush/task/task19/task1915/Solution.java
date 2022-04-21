package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String fileName = null;
        try(BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = fileNameReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintStream defaultStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(defaultStream);

        try(FileOutputStream writer = new FileOutputStream(fileName)){
            writer.write(outputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(outputStream.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}


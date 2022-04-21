package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        String inputFileName = null;
        String outputFileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                fileContent.add(inputFileReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String s : fileContent) {
                outputFileWriter.write(s.replaceAll("\\p{P}", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

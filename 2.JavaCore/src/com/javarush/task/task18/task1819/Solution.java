package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = fileNameReader.readLine();
            fileName2 = fileNameReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> file1ArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))) {
            while (bufferedReader.ready()) {
                file1ArrayList.add(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName1));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName2))) {

            while (bufferedReader.ready()) {
                bufferedWriter.write(bufferedReader.readLine());
            }

            for (String str : file1ArrayList) {
                bufferedWriter.write(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

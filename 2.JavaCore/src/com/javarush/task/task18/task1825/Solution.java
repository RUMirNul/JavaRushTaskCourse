package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();

        try (BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))) {
            String filename;
            while (!(filename = fileNameReader.readLine()).equals("end")) {
                stringTreeSet.add(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String temp = stringTreeSet.first();
        String fileName = temp.substring(0, temp.length() - 6);

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            for (String str : stringTreeSet) {
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bytes = new byte[fileInputStream.available()];
                while (fileInputStream.available() > 0) {
                    int bytesRead = fileInputStream.read(bytes);
                    fileOutputStream.write(bytes, 0, bytesRead);
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

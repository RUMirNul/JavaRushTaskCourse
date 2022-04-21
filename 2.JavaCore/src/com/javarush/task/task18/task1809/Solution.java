package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(fileName.readLine());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName.readLine())) {
            if (fileInputStream.available() > 0) {
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                for (int i = bytes.length - 1; i >= 0; i--) {
                    fileOutputStream.write(bytes[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

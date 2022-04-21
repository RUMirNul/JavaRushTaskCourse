package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream input = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream output = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] bytesIn = input.readAllBytes();
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (bytesIn.length % 2 == 0 && i <= bytesIn.length) {
                    byte temp = bytesIn[i];
                    bytesIn[i] = bytesIn[i + 1];
                    bytesIn[i + 1] = temp;
                }
            }
            output.write(bytesIn);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


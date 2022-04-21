package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        FileInputStream fileInputStream = null;
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                fileInputStream = new FileInputStream(fileName.readLine());
                if (fileInputStream.available() < 1000) throw new DownloadException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String lastReadedStr;
            while (!(lastReadedStr = reader.readLine()).equals("exit")) {
                new ReadThread(lastReadedStr).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            byte[] bytes = new byte[256];
            try (FileReader reader = new FileReader(fileName)) {
                while (reader.ready()) {
                    bytes[reader.read()]++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > maxCountByte) {
                    maxCountByte = bytes[i];
                    maxCount = i;
                }
            }
            resultMap.put(fileName, maxCount);
        }
    }
}

package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        String fileName = null;
        int maxId = Integer.MIN_VALUE;
        try(BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = fileNameReader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));
            if (args[0].equals("-c")) {
                String temp = null;
                while (fileReader.ready()) {
                    temp = fileReader.readLine();
                    int tempId = Integer.parseInt(temp.substring(0, 8).trim());
                    if (tempId > maxId) {
                        maxId = tempId;
                    }
                }
                String product = String.format("%-8d%-30s%-8s%-4s", maxId + 1, args[1], args[2], args[3]);
                fileWriter.write("\n");
                fileWriter.write(product);
            }
            fileReader.close();
            fileWriter.close();
        }
    }
}


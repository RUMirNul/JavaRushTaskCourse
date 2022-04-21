package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader freader1 = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader freader2 = new BufferedReader(new FileReader(reader.readLine()))){
            String input;
            while ((input = freader1.readLine()) != null) {
                allLines.add(input);
            }

            while ((input = freader2.readLine()) != null) {
                forRemoveLines.add(input);
            }

            new Solution().joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args == null) throw new NullPointerException();
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        switch (args[0]) {
            case "-e":
                byte[] bytes = new byte[inputStream.available()];
                inputStream.read(bytes);
                outputStream.write(bytes);
                outputStream.write('8');
                break;
            case "-d":
                byte[] bytess = new byte[inputStream.available() - 1];
                inputStream.read(bytess);
                outputStream.write(bytess);
                break;
        }
        inputStream.close();
        outputStream.close();
    }

}

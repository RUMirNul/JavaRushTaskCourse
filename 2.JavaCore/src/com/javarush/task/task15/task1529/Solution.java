package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String str = reader.readLine();
            if (str.equals("helicopter")) result = new Helicopter();
            if (str.equals("plane")) result = new Plane(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

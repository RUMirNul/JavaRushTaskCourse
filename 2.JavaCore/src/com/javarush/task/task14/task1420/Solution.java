package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());

        System.out.println(NOD(x1,x2));
    }

    public static int NOD(int x1, int x2){
        if (x1 < 1 || x2 < 1) throw new IllegalArgumentException();

        while (x1 != x2){
            if (x1 > x2){
                x1 -= x2;
            } else {
                x2 -= x1;
            }
        }
        return x1;
    }
}

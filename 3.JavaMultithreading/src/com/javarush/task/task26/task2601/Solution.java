package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        double mediana = getMedian(array);
        Comparator<Integer> compateByMedian = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - mediana;
                double v2 = o2.intValue() - mediana;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        };
        Arrays.sort(array, compateByMedian);
        return array;
    }

    private static double getMedian(Integer[] array) {
        Arrays.sort(array);
        double result;
        int arrayLength = array.length;

        if (arrayLength % 2 == 0) {
            result = (array[arrayLength / 2 - 1] + array[arrayLength / 2]) / 2.0;
        } else {
            result = array[arrayLength / 2];
        }
        return result;
    }
}

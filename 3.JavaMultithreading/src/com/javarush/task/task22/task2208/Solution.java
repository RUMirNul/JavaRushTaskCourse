package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> paramsMap = new LinkedHashMap<>();
        paramsMap.put("name", "Ivanov");
        paramsMap.put("country", "Ukraine");
        paramsMap.put("city", "Kiev");
        paramsMap.put("age", null);

        System.out.println(getQuery(paramsMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder answer = new StringBuilder();
        for (Map.Entry<String,String> x : params.entrySet()) {
            if (x.getValue() != null) {
                if (answer.length() > 0) {
                    answer.append(" and ");
                }
                answer.append(x.getKey()).append(" = ").append("'" + x.getValue() + "'");
            }

        }
        return answer.toString();
    }
}

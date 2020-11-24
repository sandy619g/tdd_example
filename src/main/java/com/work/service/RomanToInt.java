package com.work.service;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('C', 100);
    }

    public static int convert(String romanStr) {
        int count = 0;
        char[] arr = romanStr.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count += romanMap.get(arr[i]);
            if (i > 0 && (romanMap.get(arr[i]) > romanMap.get(arr[i - 1]))) {
                count -= romanMap.get(arr[i - 1]) * 2;
            }
        }
        return count;
    }
}

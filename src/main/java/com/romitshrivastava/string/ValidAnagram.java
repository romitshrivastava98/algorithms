package com.romitshrivastava.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        ValidAnagram solution = new ValidAnagram();
        boolean result = solution.isAnagram(s, t);
        System.out.println(result);
    }

    public boolean isAnagram(String s, String t) {

        // 1. Brute force
//        if (s.length() != t.length()) {
//            return false;
//        }
//        char [] arr1 = s.toCharArray();
//        char [] arr2 = t.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        // Arrays.equals(arr1, arr2);
//        for( int i=0;i<arr1.length;i++) {
//            if(arr1[i] != arr2[i]) {
//                return false;
//            }
//        }
//        return true;

        // 2. Using HashMap

        Map<Character, Integer> map = new HashMap<>();
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        for (char c : arr1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : arr2) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();


        // 3. Stream





    }
}

package com.romitshrivastava.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        LongestCommonPrefix solution = new LongestCommonPrefix();
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }

    public String longestCommonPrefix(String[] strs) {
         // 1. Vertical Scanning
            if(strs.length == 0) {
                return "";
            }

            for(int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);
                for(int j = 1; j < strs.length; j++) {
                    if(i == strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0];

        // 2. Horizontal Scanning
//        if ( strs.length == 0 ) {
//            return "";
//        }
//
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//            }
//        }
//        return prefix;


        // 3. Divide and Conquer


        // 4. Binary Search

    }
}

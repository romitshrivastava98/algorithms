package com.romitshrivastava.string;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        IsSubsequence solution = new IsSubsequence();
        boolean result = solution.isSubsequence(s, t);
        System.out.println(result);
    }

    public boolean isSubsequence(String s, String t) {
        // 1. Brute force
        if (s.isEmpty()) {
            return true;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;

        // 2. Recursive

//        if (s.isEmpty()) {
//            return true;
//        }
//        if (t.isEmpty()) {
//            return false;
//        }
//        if (s.charAt(0) == t.charAt(0)) {
//            return isSubsequence(s.substring(1), t.substring(1));
//        } else {
//            return isSubsequence(s, t.substring(1));
//        }







    }
}

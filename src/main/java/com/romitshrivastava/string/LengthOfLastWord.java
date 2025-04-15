package com.romitshrivastava.string;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        LengthOfLastWord solution = new LengthOfLastWord();
        int result = solution.lengthOfLastWord(s);
        System.out.println(result);
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}

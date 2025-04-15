package com.romitshrivastava.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};

        ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] result = solution.getConcatenation(nums1);
        System.out.println(Arrays.toString(result));
    }
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}

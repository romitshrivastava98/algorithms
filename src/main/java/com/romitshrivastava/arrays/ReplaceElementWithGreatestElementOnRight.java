package com.romitshrivastava.arrays;

import java.util.Arrays;

public class ReplaceElementWithGreatestElementOnRight {
    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        ReplaceElementWithGreatestElementOnRight solution = new ReplaceElementWithGreatestElementOnRight();
        int[] result = solution.replaceElements(nums);
        System.out.println(Arrays.toString(result));
    }

    public int [] replaceElements(int[] arr) {


        int n = arr.length;
        int max = arr[n-1];
        int ans[]= new int[n];

        ans[n-1] = -1;

        for(int i=n-2;i>=0;i--){
            ans[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return ans;
    }
}

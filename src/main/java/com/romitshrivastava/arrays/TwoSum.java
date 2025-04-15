package com.romitshrivastava.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }

    int[] twoSum(int[] nums, int target) {

        // 1. Brute force

//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;

        // 2. Using HashMap Two Pass
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int n = nums.length;
//
//        // Build the hash table
//        for (int i = 0; i < n; i++) {
//            numMap.put(nums[i], i);
//        }
//
//        // Find the complement
//        for (int i = 0; i < n; i++) {
//            int complement = target - nums[i];
//            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
//                return new int[]{i, numMap.get(complement)};
//            }
//        }
//
//        return new int[]{};

        // 3. Using hashmap One Pass

//        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[] {};


        // 4. Streams

        Map<Integer, Integer> map= new HashMap<>();
        return IntStream.range(0, nums.length)
                .mapToObj(i -> {
                    int complement = target - nums[i];
                    if (map.containsKey(complement)) {
                        return new int[]{map.get(complement), i};
                    }
                    map.put(nums[i], i);
                    return null;
                })
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(new int[]{});


    }

}


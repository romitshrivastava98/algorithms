package com.romitshrivastava.arrays;

import java.util.*;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,2};
        ContainsDuplicate solution = new ContainsDuplicate();
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {

//        // 1. Brute force (
//        for( int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++) {
//                if(nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//        // 2. Using HashMap
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for( int i=0;i<nums.length;i++) {
//            if(map.containsKey(nums[i])) {
//                return true;
//            }
//            map.put(nums[i], i);
//        }
//        return false;
//
//
//
//        // 3. Using HashSet
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (set.contains(num)) {
//                return true;
//            }
//            set.add(num);
//        }
//        return false;
//
//        Set<Integer> set1 = new HashSet<>();
//        for(int num : nums) {
//            set1.add(num);
//        }
//
//        return set1.size() != nums.length;
//
//
//
//        // 4. Using Arrays.sort() and two pointer approach
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++) {
//            if(nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;

        // 5. Stream

        return IntStream.of(nums).distinct().count() != nums.length;


//        int length = (int) Arrays.stream(nums)
//                .distinct()
//                .count();
//
//        return length != nums.length;



    }
}


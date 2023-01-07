package com.tryden.leetcode.java.arrays;

import java.util.Arrays;

public class duplicateZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
    }
    public static int[] duplicateZeros(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length-2; j > i; j--) {
                    nums[j+1] = nums[j];
                }
                i++;
                nums[i] = 0;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return nums;
    }
}

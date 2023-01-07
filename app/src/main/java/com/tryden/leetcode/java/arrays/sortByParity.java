package com.tryden.leetcode.java.arrays;

import java.util.Arrays;

public class sortByParity {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
    }

    public static int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i++] = nums[j];
                nums[j] = tmp;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
        return nums;
    }
}

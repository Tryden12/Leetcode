package com.tryden.leetcode.java.arrays;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int elem : nums) {
            if (elem != val) {
                nums[count++] = elem;
            }
        }
        System.out.println("count = " + count);
        System.out.println(Arrays.toString(nums));
        return count;
    }
}

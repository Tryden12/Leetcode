package com.tryden.leetcode.java.arrays;

public class removeDuplicates {

    public static void main (String args[]) {
        int[] nums = {1,1,1,1,2,3,4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int cur = nums[0];
        for (int i = 1, j = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                count++;
                cur = nums[i];
                nums[j] = nums[i];
                j++;
            }
        }
        return count;
    }
}

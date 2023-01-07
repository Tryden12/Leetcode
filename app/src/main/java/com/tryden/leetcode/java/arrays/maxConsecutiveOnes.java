package com.tryden.leetcode.java.arrays;

public class maxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,0,1,1,1,1,1,0};

        findMaxConsecutiveOnes(nums);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        if (nums.length == 0 || nums.length == 1) {
            return count;
        }

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                System.out.println("nums["+i+"], count = " + count );
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
                System.out.println("nums["+i+"], max = " + max );
            }
            System.out.println();
        }
        System.out.println("max = " + max);
        return max;
    }
}

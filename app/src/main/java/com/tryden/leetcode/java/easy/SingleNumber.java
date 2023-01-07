package com.tryden.leetcode.java.easy;

/*
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/
 *
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        singleNumber(nums);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result + " = " + result + " ^ " + nums[i]);
            result = result ^ nums[i];
        }
        System.out.println("result = " + result);
        return result;
    }
}

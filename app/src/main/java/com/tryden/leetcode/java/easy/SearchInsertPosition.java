package com.tryden.leetcode.java.easy;

/*
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/
 *
 */

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l < r) {
            int m = l + (r-l)/2;

            if (nums[m] == target) return m;
            else if (nums[m] > target) r = m;
            else l = m + 1;
        }

        return nums[l] < target ? l + 1: l;
    }
}

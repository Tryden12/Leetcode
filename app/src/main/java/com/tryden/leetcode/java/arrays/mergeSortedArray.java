package com.tryden.leetcode.java.arrays;

import java.util.Arrays;

public class mergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j=0; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        return (nums1);
    }
}

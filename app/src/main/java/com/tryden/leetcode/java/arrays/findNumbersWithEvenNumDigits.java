package com.tryden.leetcode.java.arrays;

public class findNumbersWithEvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        findNumbers(nums);
    }
    public static int findNumbers(int[] nums) {

        // Math formula for number of digits - [log n]+1
        // Time: O(n)
        int count = 0;
        for(int num: nums){
            if ((int)(Math.log10(num)+1) % 2 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);
        return count;

        /** String.valueOf().length() version:
         *
         * int count = 0;
         *
         *         for (int num : nums) {
         *             if (String.valueOf(num).length() % 2 == 0) {
         *                 count++;
         *             }
         *         }
         *         System.out.println("count = " + count);
         *         return count;
         */
    }
}

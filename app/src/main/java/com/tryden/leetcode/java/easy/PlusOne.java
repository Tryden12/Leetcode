package com.tryden.leetcode.java.easy;

/*
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/
 *
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] digitsBA = {1,2,9};
        int[] digitsBBA = {1,9,9};
        int[] digitsBCD = {9,9,9};
        plusOne(digitsBCD);
    }

    public static int[] plusOne(int[] digits) {
       int tmp;
       for (int i = digits.length-1; i >= 0; i--) {
           tmp = digits[i] + 1;
           if (tmp < 10) {
               digits[i] = tmp;
               System.out.println("A");
               return digits;
           } else {
               digits[i] = 0;
               System.out.println("B");
           }
       }
        System.out.println("C");

        int[] res = new int[digits.length + 1];
       for (int i = 1; i < res.length; i++) {
           res[i] = digits[i-1];
       }
        System.out.println("D");

        return res;
    }
}

package com.tryden.leetcode.java.easy;


/*
 *
 * [70] Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 11;
        climbStairs(n);
    }
    public static int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0) {
            a = (b += a) - a;
        }
        return a;
    }
}

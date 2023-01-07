package com.tryden.leetcode.java.easy;

/*
 *
 * [69] Sqrt(x)
 *
 * https://leetcode.com/problems/sqrtx/description/
 *
 */

public class Sqrt {
    public static void main(String[] args) {
        int n = 98;
    }

    public static int mySqrt(int x) {
        long r = (x+1) / 2;
        while (r*r > x){
            r = (r + x/r) / 2;
            if (r < 0){
                r = r*-1;
            }
        }
        return (int) r;
    }
}

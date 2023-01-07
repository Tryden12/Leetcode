package com.tryden.leetcode.java.easy;

/*
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 */

public class HappyNumber {
    public static void main(String[] args) {
        int n = 21;
        isHappy(n);
    }

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        int res = 0;
        while (n > 10) {
            res = happy(n);
            if (res == 1 || res == 7) return true;
            n = res;
        }

        return false;
    }

    public static int happy(int n) {
        int sum = 0;
        while (n != 0) {
            int m = n%10;
            sum += m*m;
            n = n/10;
        }
        return sum;
    }


    /** Official Leetcode answer **/
//    private int getNext(int n) {
//        int totalSum = 0;
//        while (n > 0) {
//            int d = n % 10;
//            n = n / 10;
//            totalSum += d * d;
//        }
//        return totalSum;
//    }
//
//    public boolean isHappy(int n) {
//        Set<Integer> seen = new HashSet<>();
//        while (n != 1 && !seen.contains(n)) {
//            seen.add(n);
//            n = getNext(n);
//        }
//        return n == 1;
//    }

}

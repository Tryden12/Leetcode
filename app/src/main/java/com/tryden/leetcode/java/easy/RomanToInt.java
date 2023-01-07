package com.tryden.leetcode.java.easy;


/*
 *
 * [13] Roman to Integer
 *
 * https://leetcode.com/problems/roman-to-integer/
 *
 */

public class RomanToInt {
    public static void main(String[] args) {
        String s = "LVII";
        romanToInt(s);
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i < len-1 && getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                sum -= getValue(s.charAt(i));
            } else {
                sum += getValue(s.charAt(i));
            }
        }
        return sum;
    }

    public static int getValue(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        throw new Error("Illegal");
    }
}

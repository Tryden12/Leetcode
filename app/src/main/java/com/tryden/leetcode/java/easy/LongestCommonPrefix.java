package com.tryden.leetcode.java.easy;

/*
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/
 *
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        longestCommonPrefix(strings);
    }

    public static String longestCommonPrefix(String[] strings) {
        String prefix = strings[0];
        for (int i=1; i<strings.length; i++) {
            String currPrefix = strings[i];
            while (!currPrefix.startsWith(prefix)) {
                System.out.println(!currPrefix.startsWith(prefix));
                prefix = prefix.substring(0, prefix.length()-1);
            }
            System.out.println();
            System.out.println();;
        }
        return prefix;
    }
}

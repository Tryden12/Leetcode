package com.tryden.leetcode.java.easy;

/*
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/
 *
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        String phrase = s.trim();
        int count = 0;
        // StringBuilder lastWord = new StringBuilder();
        for (int i = phrase.length()-1; i >= 0; i--) {
            if(phrase.charAt(i) == ' ') {
                break;
            }
            // lastWord.append(phrase.charAt(i));
            count++;
        }
        return count;
        // return phrase.length() > 1 ? lastWord.toString().length() : 1;
    }
}

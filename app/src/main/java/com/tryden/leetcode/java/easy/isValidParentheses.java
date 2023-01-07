package com.tryden.leetcode.java.easy;

import java.util.Arrays;
import java.util.Stack;

/*
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/
 *
 */

public class isValidParentheses {
    public static void main(String[] args) {
        String s = "{[]}";

        isValid(s);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') stack.push(a);
            else if (stack.empty()) return false;
            else if (a == ')' && stack.pop() != '(') return false;
            else if (a == ']' && stack.pop() != '[') return false;
            else if (a == '}' && stack.pop() != '{') return false;

            System.out.println(i+" " + Arrays.toString(stack.toArray()));

        }

        return stack.empty();
    }
}

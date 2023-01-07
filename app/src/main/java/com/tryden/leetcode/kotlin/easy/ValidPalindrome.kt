package com.tryden12.leetcode_kotlin

/*
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 */

    fun main() {

    }

    // Elegant
    fun isPalindrome(s: String) = s.filter {
        it.isLetterOrDigit() }
        .run { equals(reversed(), true) }


    // Map
    fun isPalindrome2(s: String) : Boolean {
        val result = s.filter { it.isLetterOrDigit() }
            .map { it.lowercaseChar() }
        return result == result.reversed()
    }

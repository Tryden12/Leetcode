package com.tryden12.leetcode_kotlin.easy

/*
 *
 * [13] Roman to Integer
 *
 * https://leetcode.com/problems/roman-to-integer/
 *
 */

    fun main() {

    }

    fun romanToInt(s: String): Int {
        val map = mutableMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        var number = 0
        var last = 1000
        s.forEach {
            val value = map[it] ?: 0
            println(value)
            if (value > last) number -= last * 2
            println("value: "+ value + ", last: " + last)
            number += value
            last = value
        }
        return number
    }
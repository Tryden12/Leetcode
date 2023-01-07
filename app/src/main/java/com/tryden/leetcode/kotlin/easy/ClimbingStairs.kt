package com.tryden12.leetcode_kotlin.easy

/*
 *
 * [70] Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 */

    fun main() {

    }


    private val cache = mutableMapOf<Int, Int>()

    private fun climbStairs(n: Int) : Int = when {
        n < 1  -> 0
        n == 1 -> 1
        n == 2 -> 2
        else -> cache.getOrPut(n) {
            climbStairs(n-1) + climbStairs(n-2)
        }
    }
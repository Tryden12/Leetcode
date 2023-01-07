package com.tryden12.leetcode_kotlin.easy

/*
 *
 * [69] Sqrt(x)
 *
 * https://leetcode.com/problems/sqrtx/description/
 *
 */


    fun main() {
        println(mySqrt(8))
    }

    fun mySqrt(x: Int): Int {
        if(x < 2) return x

        var left = 2
        var right = x / 2

        while(left <= right) {
            var midd = left + (right - left) / 2
            var squaredMidd: Long = midd.toLong() * midd.toLong()


            if(squaredMidd > x) right = midd - 1
            else if (squaredMidd < x) left = midd + 1
            else return midd
        }

        return right
    }



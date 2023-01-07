package com.tryden.leetcode.kotlin.easy

import java.util.ArrayDeque
/*
 * [496] Next Greater Element I
 *
 * https://leetcode.com/problems/next-greater-element-i/
 *
 */

    fun main() {

    }

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray) : IntArray {
        val n = nums1.size
        val result = IntArray(n)
        val map = HashMap<Int, Int>()
        val stack = ArrayDeque<Int>()

        for (num in nums2) {
            while (stack.isNotEmpty() && stack.last < num) {
                map[stack.removeLast()] = num
            }
            stack.addLast(num)
        }

        for (i in 0 until n) result[i] = map.getOrDefault(nums1[i], -1)

        return result
    }




package com.tryden12.leetcode_kotlin.easy

/*
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 */

    fun main() {

    }


    fun twoSum(nums: IntArray, target: Int): IntArray? {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return null
    }


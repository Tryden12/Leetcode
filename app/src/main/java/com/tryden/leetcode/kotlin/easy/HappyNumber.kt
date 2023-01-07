package com.tryden12.leetcode_kotlin.easy

/*
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 */

    fun main() {

    }

    private fun isHappy(number: Int): Boolean {
        var slowNumber = number
        var fastNumber = number

        do {
            slowNumber = getSumOfSquaredDigits(slowNumber)
            fastNumber = getSumOfSquaredDigits(getSumOfSquaredDigits(fastNumber))
        } while (fastNumber != 1 && fastNumber != slowNumber)

        return fastNumber == 1
    }

    private fun getSumOfSquaredDigits(number: Int): Int {
        var sumOfSquaredDigits = 0
        var currentNumber = number
        while (currentNumber != 0) {
            val digit = currentNumber % 10
            sumOfSquaredDigits += digit * digit
            currentNumber /= 10
        }
        return sumOfSquaredDigits
    }


    /** Official Leetcode answer **/
//    private fun getNext(n: Int): Int {
//        var n = n
//        var totalSum = 0
//        while (n > 0) {
//            val d = n % 10
//            n = n / 10
//            totalSum += d * d
//        }
//        return totalSum
//    }
//
//    fun isHappy(n: Int): Boolean {
//        var n = n
//        val seen: MutableSet<Int> = HashSet()
//        while (n != 1 && !seen.contains(n)) {
//            seen.add(n)
//            n = getNext(n)
//        }
//        return n == 1
//    }



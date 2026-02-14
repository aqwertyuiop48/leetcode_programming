/*
 * @lc app=leetcode id=738 lang=kotlin
 *
 * [738] Monotone Increasing Digits
 */

class Solution { fun monotoneIncreasingDigits(n: Int): Int = generateSequence(n to 1) { (result, digit) -> (result / 10.0.pow(digit) > 0).takeIf { it }?.let { _ -> ((result / 10.0.pow(digit - 1)).toInt() % 10 < (result / 10.0.pow(digit)).toInt() % 10).let { shouldReduce -> if (shouldReduce) (result - (result % 10.0.pow(digit)).toInt() - 1).toInt() to digit + 1 else result to digit + 1 } } }.last().first }
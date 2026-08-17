/*
 * @lc app=leetcode id=3099 lang=kotlin
 *
 * [3099] Harshad Number
 */

class Solution { fun sumOfTheDigitsOfHarshadNumber(x: Int): Int = x.toString().sumOf { it - '0' }.let { sum -> if (x % sum == 0) sum else -1 } }
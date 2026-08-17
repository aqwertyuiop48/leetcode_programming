/*
 * @lc app=leetcode id=2443 lang=kotlin
 *
 * [2443] Sum of Number and Its Reverse
 */
class Solution { fun sumOfNumberAndReverse(num: Int): Boolean = (0..num).any { it + it.toString().reversed().toInt() == num } }
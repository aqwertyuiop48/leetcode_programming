/*
 * @lc app=leetcode id=2455 lang=kotlin
 *
 * [2455] Average Value of Even Numbers That Are Divisible by Three
 */

class Solution {fun averageValue(nums: IntArray): Int =nums.asSequence().filter { it % 6 == 0 }.average().toInt()}
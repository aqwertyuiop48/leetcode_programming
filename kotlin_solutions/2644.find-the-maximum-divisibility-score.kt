/*
 * @lc app=leetcode id=2644 lang=kotlin
 *
 * [2644] Find the Maximum Divisibility Score
 */

class Solution {fun maxDivScore(nums: IntArray, divisors: IntArray) = divisors.sorted().map { div -> nums.count { it % div == 0 } }.let { counts -> divisors.sorted()[counts.indexOf(counts.maxOrNull())] }}

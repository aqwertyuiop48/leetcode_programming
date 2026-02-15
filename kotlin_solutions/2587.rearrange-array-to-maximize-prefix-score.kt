/*
 * @lc app=leetcode id=2587 lang=kotlin
 *
 * [2587] Rearrange Array to Maximize Prefix Score
 */

class Solution {fun maxScore(nums: IntArray) = nums.sortedDescending().fold(0L to 0) { (sum, count), num -> (sum + num).let { newSum -> newSum to if (newSum > 0) count + 1 else count } }.second}

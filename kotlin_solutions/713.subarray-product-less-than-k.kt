/*
 * @lc app=leetcode id=713 lang=kotlin
 *
 * [713] Subarray Product Less Than K
 */

class Solution {fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int =if (k <= 1) 0 else nums.indices.fold(0 to (1 to 0)) { (count, lp), r -> (nums[r] * lp.first).let { prod -> generateSequence(lp.second to prod) { (l, p) -> if (p >= k) (l + 1) to (p / nums[l]) else null }.last().let { (l, p) -> (count + r - l + 1) to (p to l) } } }.first}
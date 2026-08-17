/*
 * @lc app=leetcode id=1027 lang=kotlin
 *
 * [1027] Longest Arithmetic Subsequence
 */

class Solution {
    fun longestArithSeqLength(nums: IntArray): Int = nums.indices.fold(Array(nums.size) { IntArray(1001) } to 0) { (dp, maxLen), i -> (0 until i).fold(maxLen) { curMax, j -> (nums[i] - nums[j] + 500).let { diff -> (if (dp[j][diff] > 0) dp[j][diff] + 1 else 2).also { dp[i][diff] = it }.let { len -> maxOf(curMax, len) } } }.let { newMax -> dp to newMax } }.second
}
/*
 * @lc app=leetcode id=2547 lang=kotlin
 *
 * [2547] Minimum Cost to Split an Array
 */

class Solution { fun minCost(nums: IntArray, k: Int): Int = IntArray(nums.size + 1).let { dp -> nums.indices.forEach { i -> mutableMapOf<Int, Int>().let { m -> intArrayOf(0).let { s -> (i downTo 0).forEach { j -> ((m[nums[j]] ?: 0) + 1).also { m[nums[j]] = it }.let { count -> if (count == 2) s[0] += 2 else if (count > 2) s[0] += 1 }.let { dp[i + 1] = if (dp[i + 1] == 0) dp[j] + s[0] + k else minOf(dp[i + 1], dp[j] + s[0] + k) } } } } }.run { dp[nums.size] } } }
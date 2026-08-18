/*
 * @lc app=leetcode id=3469 lang=kotlin
 *
 * [3469] Find Minimum Cost to Remove Array Elements
 */

class Solution { fun minCost(nums: IntArray): Int = Array(nums.size + 2) { IntArray(nums.size + 2) { -1 } }.let { memo -> kotlin.DeepRecursiveFunction<Pair<Int, Int>, Int> { (i, rem) -> if (memo[i][rem] != -1) memo[i][rem] else (if (i >= nums.size) nums[rem] else if (i == nums.size - 1) maxOf(nums[rem], nums[i]) else minOf(maxOf(nums[i], nums[i + 1]) + callRecursive(Pair(i + 2, rem)), minOf(maxOf(nums[rem], nums[i + 1]) + callRecursive(Pair(i + 2, i)), maxOf(nums[rem], nums[i]) + callRecursive(Pair(i + 2, i + 1))))).also { memo[i][rem] = it } }(Pair(1, 0)) } }
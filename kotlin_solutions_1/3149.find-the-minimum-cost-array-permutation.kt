/*
 * @lc app=leetcode id=3149 lang=kotlin
 *
 * [3149] Find the Minimum Cost Array Permutation
 */

class Solution { fun findPermutation(nums: IntArray): IntArray = nums.size.let { n -> Array(1 shl n) { IntArray(n) { -1 } }.let { dp -> Array(1 shl n) { IntArray(n) }.let { nxt -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (mask, last) -> if (mask == (1 shl n) - 1) Math.abs(last - nums[0]) else if (dp[mask][last] != -1) dp[mask][last] else (0 until n).filter { (mask and (1 shl it)) == 0 }.minByOrNull { nxtIdx -> Math.abs(last - nums[nxtIdx]) + callRecursive((mask or (1 shl nxtIdx)) to nxtIdx) }!!.also { nxt[mask][last] = it }.let { best -> (Math.abs(last - nums[best]) + callRecursive((mask or (1 shl best)) to best)).also { dp[mask][last] = it } } }.let { solve -> solve(1 to 0).let { IntArray(n).apply { foldIndexed(1 to 0) { i, (mask, last), _ -> (mask or (1 shl nxt[mask][last])) to nxt[mask][last].also { this[i] = last } } } } } } } }
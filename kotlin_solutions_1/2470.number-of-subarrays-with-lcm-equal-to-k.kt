/*
 * @lc app=leetcode id=2470 lang=kotlin
 *
 * [2470] Number of Subarrays With LCM Equal to K
 */

class Solution { fun subarrayLCM(nums: IntArray, k: Int): Int = DeepRecursiveFunction<Pair<Int, Int>, Int> { (a, b) -> if (b == 0) a else callRecursive(Pair(b, a % b)) }.let { gcd -> nums.indices.sumOf { i -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (j, cur) -> if (j >= nums.size) 0 else (cur.toLong() * nums[j] / gcd(Pair(cur, nums[j]))).let { nxt -> if (nxt > k || k % nxt != 0L) 0 else (if (nxt == k.toLong()) 1 else 0) + callRecursive(Pair(j + 1, nxt.toInt())) } }(Pair(i, 1)) } } }
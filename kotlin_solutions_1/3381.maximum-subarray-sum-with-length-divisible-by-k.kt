/*
 * @lc app=leetcode id=3381 lang=java
 *
 * [3381] Maximum Subarray Sum With Length Divisible by K
 */

fun maxSubarraySum(nums: IntArray, k: Int): Long = LongArray(k) { 1000000000000000L }.apply { this[0] = 0 }.let { minP -> nums.indices.fold(0L to -1000000000000000L) { (s, maxS), i -> (s + nums[i]).let { ns -> (i + 1) % k to ns }.let { (m, ns) -> ns to maxOf(maxS, ns - minP[m]).also { minP[m] = minOf(minP[m], ns) } } }.second }
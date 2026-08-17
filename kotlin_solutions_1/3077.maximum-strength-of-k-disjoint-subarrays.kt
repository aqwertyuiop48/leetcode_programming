/*
 * @lc app=leetcode id=3077 lang=kotlin
 *
 * [3077] Maximum Strength of K Disjoint Subarrays
 */

class Solution { fun maximumStrength(nums: IntArray, k: Int): Long = (1..k).fold(LongArray(nums.size + 1)) { prevDp, i -> (if (i % 2 == 1) k - i + 1L else i - 1L - k).let { weight -> ((i - 1) until nums.size).fold((LongArray(nums.size + 1) to (Long.MIN_VALUE / 4)) to (Long.MIN_VALUE / 4)) { ((nextDp, mx), best), j -> (nums[j] * weight).let { gain -> maxOf(mx + gain, prevDp[j] + gain).let { newMx -> maxOf(best, newMx).let { newBest -> (nextDp.also { it[j + 1] = newBest } to newMx) to newBest } } } }.first.first } }[nums.size] }
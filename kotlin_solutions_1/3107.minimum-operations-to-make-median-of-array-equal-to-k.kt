/*
 * @lc app=leetcode id=3107 lang=kotlin
 *
 * [3107] Minimum Operations to Make Median of Array Equal to K
 */

class Solution {
    fun minOperationsToMakeMedianK(nums: IntArray, k: Int): Long = nums.sorted().let { s -> (s.size / 2).let { m -> (m until s.size).filter { s[it] < k }.sumOf { (k - s[it]).toLong() } + (0..m).filter { s[it] > k }.sumOf { (s[it] - k).toLong() } } }
}
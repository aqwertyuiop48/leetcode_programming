/*
 * @lc app=leetcode id=1577 lang=kotlin
 *
 * [1577] Number of Ways Where Square of Number Is Equal to Product of Two Numbers
 */

class Solution {
    fun numTriplets(nums1: IntArray, nums2: IntArray): Int = listOf(nums1 to nums2, nums2 to nums1).sumOf { (a, b) -> b.toList().groupingBy { it.toLong() }.fold(0L) { acc, _ -> acc + 1 }.let { map -> a.sumOf { x -> (x.toLong() * x).let { target -> map.entries.sumOf { (k, v) -> if (target % k == 0L) (target / k).let { other -> if (k == other) v * (v - 1) / 2 else if (k < other) v * (map[other] ?: 0L) else 0L } else 0L } } } } }.toInt()
}
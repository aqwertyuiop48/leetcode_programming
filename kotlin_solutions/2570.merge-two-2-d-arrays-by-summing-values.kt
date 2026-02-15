/*
 * @lc app=leetcode id=2570 lang=kotlin
 *
 * [2570] Merge Two 2D Arrays by Summing Values
 */

class Solution {fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>) = (nums1 + nums2).groupBy { it[0] }.mapValues { it.value.sumOf { arr -> arr[1] } }.toSortedMap().map { intArrayOf(it.key, it.value) }.toTypedArray()}

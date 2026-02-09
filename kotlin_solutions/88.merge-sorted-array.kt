/*
 * @lc app=leetcode id=88 lang=kotlin
 *
 * [88] Merge Sorted Array
 */

class Solution { fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit = nums1.run { generateSequence(Triple(m - 1, n - 1, m + n - 1)) { (i, j, k) -> (i >= 0 && j >= 0).takeIf { it }?.let { if (this[i] > nums2[j]) Triple(i - 1, j, k - 1).also { this[k] = this[i] } else Triple(i, j - 1, k - 1).also { this[k] = nums2[j] } } }.last().let { (_, j, k) -> generateSequence(j to k) { (jIdx, kIdx) -> (jIdx >= 0).takeIf { it }?.let { (jIdx - 1) to (kIdx - 1).also { this[kIdx] = nums2[jIdx] } } }.last() } } }
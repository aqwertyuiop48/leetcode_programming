/*
 * @lc app=leetcode id=2605 lang=kotlin
 *
 * [2605] Form Smallest Number From Two Digit Arrays
 */

class Solution {fun minNumber(nums1: IntArray, nums2: IntArray) = nums1.toSet().intersect(nums2.toSet()).minOrNull()?.let { minOf(it, (minOf(nums1.min(), nums2.min()).toString() + maxOf(nums1.min(), nums2.min()).toString()).toInt()) } ?: (minOf(nums1.min(), nums2.min()).toString() + maxOf(nums1.min(), nums2.min()).toString()).toInt()}


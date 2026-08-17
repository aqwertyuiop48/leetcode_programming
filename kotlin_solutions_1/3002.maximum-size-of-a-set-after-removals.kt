/*
 * @lc app=leetcode id=3002 lang=kotlin
 *
 * [3002] Maximum Size of a Set After Removals
 */

class Solution { fun maximumSetSize(nums1: IntArray, nums2: IntArray): Int = nums1.toSet().let { s1 -> nums2.toSet().let { s2 -> (s1 intersect s2).let { common -> minOf(nums1.size, minOf(nums1.size / 2, s1.size - common.size) + minOf(nums1.size / 2, s2.size - common.size) + common.size) } } } }
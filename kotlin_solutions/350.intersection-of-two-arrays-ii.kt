/*
 * @lc app=leetcode id=350 lang=kotlin
 *
 * [350] Intersection of Two Arrays II
 */

class Solution {fun intersect(nums1: IntArray, nums2: IntArray): IntArray = nums1.groupBy { it }.mapValues { it.value.size }.let { map1 -> nums2.groupBy { it }.mapValues { it.value.size }.flatMap { (num, count) -> List(minOf(count, map1[num] ?: 0)) { num } } }.toIntArray()}
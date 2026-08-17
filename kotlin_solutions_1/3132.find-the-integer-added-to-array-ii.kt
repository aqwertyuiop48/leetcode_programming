/*
 * @lc app=leetcode id=3132 lang=kotlin
 *
 * [3132] Find the Integer Added to Array II
 */

class Solution { fun minimumAddedInteger(nums1: IntArray, nums2: IntArray): Int = nums1.sorted().let { s1 -> nums2.sorted().let { s2 -> (0..2).map { s2[0] - s1[it] }.filter { x -> s1.fold(0) { j, v -> if (j < s2.size && s2[j] - v == x) j + 1 else j } == s2.size }.minOrNull()!! } } }
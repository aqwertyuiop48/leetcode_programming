/*
 * @lc app=leetcode id=2540 lang=kotlin
 *
 * [2540] Minimum Common Value
 */

class Solution {fun getCommon(nums1: IntArray, nums2: IntArray) = nums1.toSet().intersect(nums2.toSet()).minOrNull() ?: -1}

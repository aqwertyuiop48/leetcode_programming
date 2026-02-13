/*
 * @lc app=leetcode id=349 lang=kotlin
 *
 * [349] Intersection of Two Arrays
 */

class Solution {fun intersection(nums1: IntArray, nums2: IntArray): IntArray = nums1.toSet().intersect(nums2.toSet()).toIntArray()}
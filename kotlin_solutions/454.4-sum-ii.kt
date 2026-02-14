/*
 * @lc app=leetcode id=454 lang=kotlin
 *
 * [454] 4Sum II
 */

class Solution { fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int = nums1.flatMap { a -> nums2.map { b -> a + b } }.groupingBy { it }.eachCount() .let { map -> nums3.flatMap { c -> nums4.map { d -> c + d } }.sumOf { map.getOrDefault(-it, 0) } } }
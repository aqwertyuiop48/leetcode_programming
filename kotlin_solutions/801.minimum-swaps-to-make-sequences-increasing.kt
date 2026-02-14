/*
 * @lc app=leetcode id=801 lang=kotlin
 *
 * [801] Minimum Swaps To Make Sequences Increasing
 */

class Solution { fun minSwap(nums1: IntArray, nums2: IntArray): Int = mutableMapOf<String, Int>().let { dp -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (i, p1, p2) -> if (i == nums1.size) 0 else dp.getOrPut("$i,$p1,$p2") { nums1[i].let { v1 -> nums2[i].let { v2 -> v2.also { nums1[i] = it.also{nums2[i] = v1} }.run { (if (nums1[i] > p1 && nums2[i] > p2) callRecursive(Triple(i + 1, nums1[i], nums2[i])) else Int.MAX_VALUE - 1).also { nums1[i] = v1 .also{nums2[i] = v2} }.let { s -> minOf(if (s == Int.MAX_VALUE - 1) Int.MAX_VALUE else s + 1, if (nums1[i] > p1 && nums2[i] > p2) callRecursive(Triple(i + 1, nums1[i], nums2[i])) else Int.MAX_VALUE - 1) } } }} } }.invoke(Triple(0, -1, -1)) } }
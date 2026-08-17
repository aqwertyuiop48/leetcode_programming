/*
 * @lc app=leetcode id=1818 lang=kotlin
 *
 * [1818] Minimum Absolute Sum Difference
 */

class Solution { fun minAbsoluteSumDiff(nums1: IntArray, nums2: IntArray): Int = nums1.indices.map { Math.abs(nums1[it] - nums2[it]).toLong() }.sum().let { totalSum -> nums1.sorted().let { sorted -> nums1.indices.maxOfOrNull { i -> Math.abs(nums1[i] - nums2[i]).let { diff -> sorted.binarySearch(nums2[i]).let { if (it >= 0) it else -it - 1 }.let { idx -> diff - minOf(if (idx < sorted.size) Math.abs(sorted[idx] - nums2[i]) else Int.MAX_VALUE, if (idx > 0) Math.abs(sorted[idx - 1] - nums2[i]) else Int.MAX_VALUE) } } } ?: 0 }.let { maxGain -> ((totalSum - maxGain) % 1000000007).toInt() } } }
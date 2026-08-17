/*
 * @lc app=leetcode id=2918 lang=kotlin
 *
 * [2918] Minimum Equal Sum of Two Arrays After Replacing Zeros
 */

class Solution {
    fun minSum(nums1: IntArray, nums2: IntArray): Long = nums1.fold(0L to 0L) { (s, z), x -> if (x == 0) (s + 1) to (z + 1) else (s + x) to z }.let { (s1, z1) -> nums2.fold(0L to 0L) { (s, z), x -> if (x == 0) (s + 1) to (z + 1) else (s + x) to z }.let { (s2, z2) -> if (z1 == 0L && s1 < s2 || z2 == 0L && s2 < s1) -1L else maxOf(s1, s2) } }
}
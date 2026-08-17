/* @lc app=leetcode id=2425 lang=kotlin */
class Solution {
    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int = (if (nums2.size % 2 == 1) nums1.reduce { a, b -> a xor b } else 0) xor (if (nums1.size % 2 == 1) nums2.reduce { a, b -> a xor b } else 0)
}
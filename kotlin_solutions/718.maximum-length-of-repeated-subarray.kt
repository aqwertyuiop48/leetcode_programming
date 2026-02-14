/*
 * @lc app=leetcode id=718 lang=kotlin
 *
 * [718] Maximum Length of Repeated Subarray
 */

class Solution { fun findLength(nums1: IntArray, nums2: IntArray): Int = Array(nums1.size + 1) { IntArray(nums2.size + 1) }.let { dp -> nums1.indices.maxOf { i -> nums2.indices.maxOf { j -> (if (nums1[i] == nums2[j]) dp[i][j] + 1 else 0).also { dp[i + 1][j + 1] = it } }} } }

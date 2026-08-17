/*
 * @lc app=leetcode id=1855 lang=kotlin
 *
 * [1855] Maximum Distance Between a Pair of Values
 */
class Solution { fun maxDistance(nums1: IntArray, nums2: IntArray): Int = intArrayOf(0, 0, 0).let { s -> generateSequence { if (s[0] < nums1.size && s[1] < nums2.size) if (nums1[s[0]] <= nums2[s[1]]) s[2].let { s[2] = maxOf(s[2], s[1] - s[0]) }.let { s[1]++ } else s[0]++ else null }.forEach {}.run { s[2] } } }
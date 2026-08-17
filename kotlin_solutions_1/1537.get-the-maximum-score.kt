/*
 * @lc app=leetcode id=1537 lang=kotlin
 *
 * [1537] Get the Maximum Score
 */

class Solution { fun maxSum(nums1: IntArray, nums2: IntArray): Int = IntArray(2).let { idx -> LongArray(2).let { sum -> (while (idx[0] < nums1.size && idx[1] < nums2.size) if (nums1[idx[0]] < nums2[idx[1]]) sum[0] += nums1[idx[0]].toLong().also { idx[0] += 1 } else if (nums1[idx[0]] > nums2[idx[1]]) sum[1] += nums2[idx[1]].toLong().also { idx[1] += 1 } else (maxOf(sum[0], sum[1]) + nums1[idx[0]]).let { v -> v.also { sum[0] = v }.also { sum[1] = v }.also { idx[0] += 1 }.also { idx[1] += 1 } }).also { while (idx[0] < nums1.size) sum[0] += nums1[idx[0]].toLong().also { idx[0] += 1 } }.also { while (idx[1] < nums2.size) sum[1] += nums2[idx[1]].toLong().also { idx[1] += 1 } }.let { (maxOf(sum[0], sum[1]) % 1000000007).toInt() } } } }
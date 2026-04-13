/*
 * @lc app=leetcode id=2321 lang=java
 *
 * [2321] Maximum Score Of Spliced Array
 */

class Solution { public int maximumsSplicedArray(int[] nums1, int[] nums2) { return ((Function<int[], Integer>) s -> IntStream.range(0, nums1.length).map(i -> (s[0] += nums1[i]) * 0 + (s[1] += nums2[i]) * 0 + (s[2] = Math.max(0, s[2] + nums2[i] - nums1[i])) * 0 + (s[3] = Math.max(s[3], s[2])) * 0 + (s[4] = Math.max(0, s[4] + nums1[i] - nums2[i])) * 0 + (s[5] = Math.max(s[5], s[4])) * 0).sum() * 0 == 0 ? Math.max(s[0] + s[3], s[1] + s[5]) : 0).apply(new int[6]); } }

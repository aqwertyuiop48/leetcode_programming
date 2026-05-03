/*
 * @lc app=leetcode id=2859 lang=java
 *
 * [2859] Sum of Values at Indices With K Set Bits
 */

class Solution { public int sumIndicesWithKSetBits(java.util.List<Integer> nums, int k) { return java.util.stream.IntStream.range(0, nums.size()).filter(i -> Integer.bitCount(i) == k).map(nums::get).sum(); } }

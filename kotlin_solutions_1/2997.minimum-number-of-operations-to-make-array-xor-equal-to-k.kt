/*
 * @lc app=leetcode id=2997 lang=kotlin
 *
 * [2997] Minimum Number of Operations to Make Array XOR Equal to K
 */

class Solution { fun minOperations(nums: IntArray, k: Int): Int = Integer.bitCount(nums.fold(k) { acc, num -> acc xor num }) }
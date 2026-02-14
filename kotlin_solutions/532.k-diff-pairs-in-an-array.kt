/*
 * @lc app=leetcode id=532 lang=kotlin
 *
 * [532] K-diff Pairs in an Array
 */

class Solution { fun findPairs(nums: IntArray, k: Int) = nums.toList().groupingBy { it }.eachCount().count { (num, count) -> if (k == 0) count > 1 else nums.contains(num + k) } }
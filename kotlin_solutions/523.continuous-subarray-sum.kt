/*
 * @lc app=leetcode id=523 lang=kotlin
 *
 * [523] Continuous Subarray Sum
 */

class Solution { fun checkSubarraySum(nums: IntArray, k: Int) = mutableSetOf<Int>().let { prefixSumModKs -> nums.fold(0 to false) { (prevPrefixSumModK, found), num -> if (found) return true else (prevPrefixSumModK + num) % k to (((prevPrefixSumModK + num) % k) in prefixSumModKs).also { prefixSumModKs.add(prevPrefixSumModK) } }.second } }

/*
 * @lc app=leetcode id=2640 lang=kotlin
 *
 * [2640] Find the Score of All Prefixes of an Array
 */

class Solution {fun findPrefixScore(nums: IntArray) = nums.fold(Triple(0L, 0L, mutableListOf<Long>())) { (sum, currMax, result), num -> Triple(sum + num + maxOf(currMax, num.toLong()), maxOf(currMax, num.toLong()), result.apply { add(sum + num + maxOf(currMax, num.toLong())) }) }.third.toLongArray()}
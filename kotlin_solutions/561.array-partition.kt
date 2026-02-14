/*
 * @lc app=leetcode id=561 lang=kotlin
 *
 * [561] Array Partition
 */

class Solution { fun arrayPairSum(nums: IntArray): Int = nums.sorted().reduceIndexed { index, acc, num -> if (index % 2 == 0) acc + num else acc } }


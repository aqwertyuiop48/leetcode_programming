/*
 * @lc app=leetcode id=442 lang=kotlin
 *
 * [442] Find All Duplicates in an Array
 */

class Solution { fun findDuplicates(nums: IntArray): List<Int> = buildList { nums.forEach { kotlin.math.abs(it).also { x -> if (nums[x - 1] < 0) add(x) }.let { x -> nums[x - 1] *= -1 } } } }
/*
 * @lc app=leetcode id=448 lang=kotlin
 *
 * [448] Find All Numbers Disappeared in an Array
 */

class Solution { fun findDisappearedNumbers(nums: IntArray): List<Int> = nums.toSet().let { set -> (1..nums.size).filter { it !in set } } }

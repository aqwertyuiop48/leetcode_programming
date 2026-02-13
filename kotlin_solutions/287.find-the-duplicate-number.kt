/*
 * @lc app=leetcode id=287 lang=kotlin
 *
 * [287] Find the Duplicate Number
 */

class Solution {fun findDuplicate(nums: IntArray) = generateSequence(nums[0]) { nums[it] }.let { slow -> generateSequence(nums[nums[0]]) { nums[nums[it]] }.zip(slow).dropWhile { (fast, s) -> fast != s }.first().first }.let { meeting -> generateSequence(0 to meeting) { (a, b) -> if (nums[a] == nums[b]) null else nums[a] to nums[b] }.last().let { (a, _) -> nums[a] } }}

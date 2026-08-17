/* @lc app=leetcode id=2155 lang=kotlin */
class Solution {
    fun maxScoreIndices(nums: IntArray) = nums.count { it == 1 }.let { totalOnes -> (0 until nums.size).scan(0 to totalOnes) { (z, o), i -> if (nums[i] == 0) (z + 1) to o else z to (o - 1) }.map { it.first + it.second }.let { scores -> scores.maxOrNull().let { max -> scores.indices.filter { scores[it] == max } } } }
}
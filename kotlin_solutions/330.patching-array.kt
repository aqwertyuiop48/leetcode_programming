/*
 * @lc app=leetcode id=330 lang=kotlin
 *
 * [330] Patching Array
 */

class Solution {fun minPatches(nums: IntArray, n: Int) = generateSequence(Triple(0L, 0, 0)) { (currentMax, currentNumIndex, res) -> if (currentMax >= n) null else if (currentNumIndex < nums.size && nums[currentNumIndex] <= currentMax + 1) Triple(currentMax + nums[currentNumIndex], currentNumIndex + 1, res) else Triple(currentMax + currentMax + 1, currentNumIndex, res + 1) }.last().third}
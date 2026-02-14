/*
 * @lc app=leetcode id=491 lang=kotlin
 *
 * [491] Non-decreasing Subsequences
 */

class Solution { fun findSubsequences(nums: IntArray): List<List<Int>> = mutableSetOf<List<Int>>().let { result -> DeepRecursiveFunction<Pair<Int, List<Int>>, Unit> { (idx, path) -> path.takeIf { it.size >= 2 }?.let { result.add(it) }.run { (idx until nums.size).filter { path.isEmpty() || nums[it] >= path.last() }.forEach { i -> callRecursive(i + 1 to path + nums[i]) } } }.invoke(0 to emptyList()).let { result.toList() } } }
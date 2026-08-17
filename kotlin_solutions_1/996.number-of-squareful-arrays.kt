/*
 * @lc app=leetcode id=996 lang=kotlin
 *
 * [996] Number of Squareful Arrays
 */

class Solution {
    fun numSquarefulPerms(A: IntArray): Int = A.sortedArray().let { nums -> BooleanArray(nums.size).let { used -> object { fun dfs(prev: Int, count: Int): Int = if (count == nums.size) 1 else nums.indices.fold(0) { total, i -> total + if (!used[i] && !(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) && (prev < 0 || Math.sqrt((prev + nums[i]).toDouble()).let { s -> s.toLong() * s.toLong() == (prev + nums[i]).toLong() })) (used.set(i, true).run { dfs(nums[i], count + 1) }).also { used[i] = false } else 0 } }.dfs(-1, 0) } }
}
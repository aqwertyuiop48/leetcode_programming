/*
 * @lc app=leetcode id=3462 lang=java
 *
 * [3462] Maximum Sum With at Most K Elements
 */
class Solution { fun maxSum(grid: Array<IntArray>, limits: IntArray, k: Int): Long = grid.flatMapIndexed { i, row -> row.sortedDescending().take(limits[i]) }.sortedDescending().take(k).sumOf { it.toLong() } }
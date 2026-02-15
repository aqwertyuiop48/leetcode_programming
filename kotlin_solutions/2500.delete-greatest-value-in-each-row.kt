/*
 * @lc app=leetcode id=2500 lang=kotlin
 *
 * [2500] Delete Greatest Value in Each Row
 */

class Solution {fun deleteGreatestValue(grid: Array<IntArray>) = grid.onEach { it.sort() }.let { g -> (0 until g[0].size).sumOf { j -> g.maxOf { it[j] } } }}


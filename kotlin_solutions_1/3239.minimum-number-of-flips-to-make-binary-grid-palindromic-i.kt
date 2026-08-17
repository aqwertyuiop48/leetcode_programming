/*
 * @lc app=leetcode id=3239 lang=java
 *
 * [3239] Minimum Number of Flips to Make Binary Grid Palindromic I
 */
class Solution { fun minFlips(grid: Array<IntArray>): Int = minOf(grid.sumOf { r -> (0 until r.size / 2).count { c -> r[c] != r[r.size - 1 - c] } }, (0 until grid[0].size).sumOf { c -> (0 until grid.size / 2).count { r -> grid[r][c] != grid[grid.size - 1 - r][c] } }) }
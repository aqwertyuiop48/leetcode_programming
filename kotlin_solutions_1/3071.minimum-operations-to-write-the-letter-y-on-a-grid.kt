/*
 * @lc app=leetcode id=3071 lang=kotlin
 *
 * [3071] Minimum Operations to Write the Letter Y on a Grid
 */

class Solution { fun minimumOperationsToWriteY(grid: Array<IntArray>): Int = grid.size.let { n -> grid.indices.flatMap { r -> grid[0].indices.map { c -> (r <= n / 2 && (r == c || r + c == n - 1) || r > n / 2 && c == n / 2) to grid[r][c] } }.partition { it.first }.let { (yList, nList) -> (0..2).flatMap { yVal -> (0..2).map { nVal -> yVal to nVal } }.filter { it.first != it.second }.minOf { (yVal, nVal) -> yList.count { it.second != yVal } + nList.count { it.second != nVal } } } } }
/*
 * @lc app=leetcode id=3446 lang=java
 *
 * [3446] Sort Matrix by Diagonals
 */
class Solution { fun sortMatrix(grid: Array<IntArray>): Array<IntArray> = grid.size.let { n -> (-(n - 1) until n).forEach { d -> (0 until n).filter { i -> i - d in 0 until n }.let { c -> c.map { i -> grid[i][i - d] }.let { l -> if (d >= 0) l.sortedDescending() else l.sorted() }.let { sorted -> c.forEachIndexed { idx, i -> grid[i].set(i - d, sorted[idx]) } } } }.run { grid } } }
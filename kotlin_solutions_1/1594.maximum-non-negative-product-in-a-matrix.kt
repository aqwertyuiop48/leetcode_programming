/*
 * @lc app=leetcode id=1594 lang=kotlin
 *
 * [1594] Maximum Non Negative Product in a Matrix
 */

class Solution { fun maxProductPath(grid: Array<IntArray>): Int = grid[0].scan(1L) { acc, x -> acc * x }.drop(1).toLongArray().let { row0 -> row0 to row0.copyOf() }.let { initial -> (1 until grid.size).fold(initial) { (maxR, minR), r -> (1 until grid[0].size).fold(LongArray(grid[0].size).apply { this[0] = maxR[0] * grid[r][0] } to LongArray(grid[0].size).apply { this[0] = minR[0] * grid[r][0] }) { (curMax, curMin), c -> grid[r][c].toLong().let { x -> if (x >= 0) (maxOf(maxR[c], curMax[c - 1]) * x to minOf(minR[c], curMin[c - 1]) * x) else (minOf(minR[c], curMin[c - 1]) * x to maxOf(maxR[c], curMax[c - 1]) * x) }.let { (mx, mn) -> curMax.apply { this[c] = mx } to curMin.apply { this[c] = mn } } } }.first.last().let { if (it < 0) -1 else (it % 1000000007).toInt() } }
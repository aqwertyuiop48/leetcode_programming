/*
 * @lc app=leetcode id=1536 lang=kotlin
 *
 * [1536] Minimum Swaps to Arrange a Binary Grid
 */

class Solution { fun minSwaps(grid: Array<IntArray>): Int = grid.size.let { n -> IntArray(n) { i -> grid[i].takeLastWhile { it == 0 }.size }.let { trailing -> (0 until n).fold(0) { swaps, i -> if (swaps == -1) -1 else (i until n).firstOrNull { trailing[it] >= n - 1 - i }?.let { j -> (swaps + j - i).also { trailing[j].let { temp -> (j downTo i + 1).forEach { k -> trailing[k] = trailing[k - 1] }.also { trailing[i] = temp } } } } ?: -1 } } } }
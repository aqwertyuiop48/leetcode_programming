/*
 * @lc app=leetcode id=840 lang=kotlin
 *
 * [840] Magic Squares In Grid
 */

class Solution { fun numMagicSquaresInside(grid: Array<IntArray>): Int = grid.size.let { n -> grid[0].size.let { m -> (n < 3 || m < 3).let { tooSmall -> if (tooSmall) 0 else arrayOf( arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)), arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8)), arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)), arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)), arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)), arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)), arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)), arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)) ).let { magicSq -> (0 until n - 2).flatMap { rStart -> (0 until m - 2).map { cStart -> Array(3) { IntArray(3) }.apply { (0 until 3).forEach { i -> (0 until 3).forEach { j -> this[i][j] = grid[rStart + i][cStart + j] } } }.let { subgrid -> (0..7).count { i -> magicSq[i].contentDeepEquals(subgrid) } } } }.sum() } } } } }
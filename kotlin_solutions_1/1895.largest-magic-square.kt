/*
 * @lc app=leetcode id=1895 lang=kotlin
 *
 * [1895] Largest Magic Square
 */

class Solution { fun largestMagicSquare(grid: Array<IntArray>): Int = grid.size.let { R -> grid[0].size.let { C -> (minOf(R, C) downTo 2).firstOrNull { k -> (0..R - k).any { r -> (0..C - k).any { c -> (0 until k).sumOf { grid[r + it][c + it] }.let { d1 -> (0 until k).sumOf { grid[r + k - 1 - it][c + it] } == d1 && (0 until k).all { i -> (0 until k).sumOf { j -> grid[r + i][c + j] } == d1 } && (0 until k).all { j -> (0 until k).sumOf { i -> grid[r + i][c + j] } == d1 } } } } } ?: 1 } } }
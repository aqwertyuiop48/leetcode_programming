/*
 * @lc app=leetcode id=688 lang=kotlin
 *
 * [688] Knight Probability in Chessboard
 */

class Solution { fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double = Array(k + 1) { Array(n) { DoubleArray(n) } }.apply { this[0][row][column] = 1.0 }.let { dp -> (1..k).forEach { step -> (0 until n).forEach { i -> (0 until n).forEach { j -> listOf(-2 to -1, -2 to 1, -1 to -2, -1 to 2, 1 to -2, 1 to 2, 2 to -1, 2 to 1).forEach { (di, dj) -> (i + di to j + dj).let { (ni, nj) -> if (ni in 0 until n && nj in 0 until n) dp[step][i][j] += dp[step - 1][ni][nj] / 8.0 } } } } } .run{dp[k].sumOf { it.sum() }} } }

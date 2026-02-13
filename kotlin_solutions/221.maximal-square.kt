/*
 * @lc app=leetcode id=221 lang=kotlin
 *
 * [221] Maximal Square
 */

class Solution { fun maximalSquare(matrix: Array<CharArray>): Int = matrix.indices.flatMap { i -> matrix[0].indices.map { j -> i to j } } .fold(matrix.map { it.map { c -> c - '0' }.toIntArray() }.toTypedArray() to 0) { (dp, max), (i, j) -> dp.also { if (i > 0 && j > 0 && matrix[i][j] == '1') it[i][j] = minOf(it[i-1][j], it[i][j-1], it[i-1][j-1]) + 1 } to maxOf(max, if (matrix[i][j] == '1') dp[i][j] else 0) }.second.let { it * it } }


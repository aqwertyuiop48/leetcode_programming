/*
 * @lc app=leetcode id=1277 lang=kotlin
 *
 * [1277] Count Square Submatrices with All Ones
 */

class Solution {
    fun countSquares(matrix: Array<IntArray>): Int = matrix.indices.sumOf { r -> matrix[0].indices.sumOf { c -> if (matrix[r][c] == 1 && r > 0 && c > 0) minOf(matrix[r - 1][c - 1], matrix[r - 1][c], matrix[r][c - 1]).plus(1).also { matrix[r][c] = it } else matrix[r][c] } }
}
/*
 * @lc app=leetcode id=304 lang=kotlin
 *
 * [304] Range Sum Query 2D - Immutable
 */

class NumMatrix(matrix: Array<IntArray>, private val prefix: Array<IntArray> = Array(matrix.size + 1) { IntArray(matrix[0].size + 1) }.also { p -> matrix.indices.forEach { i -> matrix[0].indices.forEach { j -> p[i + 1][j + 1] = matrix[i][j] + p[i][j + 1] + p[i + 1][j] - p[i][j] } } }) { fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int) = prefix[row2 + 1][col2 + 1] - prefix[row1][col2 + 1] - prefix[row2 + 1][col1] + prefix[row1][col1] }


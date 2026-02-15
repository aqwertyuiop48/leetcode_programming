/*
 * @lc app=leetcode id=3033 lang=kotlin
 *
 * [3033] Modify the Matrix
 */

class Solution {fun modifiedMatrix(matrix: Array<IntArray>) = (0 until matrix[0].size).map { col -> matrix.map { it[col] }.let { column -> column.maxOrNull()?.let { max -> column.map { if (it == -1) max else it } } ?: column } }.let { transposed -> (0 until transposed[0].size).map { row -> transposed.map { it[row] }.toIntArray() }.toTypedArray() }}

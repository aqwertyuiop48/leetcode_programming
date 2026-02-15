/*
 * @lc app=leetcode id=867 lang=kotlin
 *
 * [867] Transpose Matrix
 */

class Solution {fun transpose(matrix: Array<IntArray>) =matrix[0].indices.map { c -> matrix.indices.map { r -> matrix[r][c] }.toIntArray() }.toTypedArray()}


/*
 * @lc app=leetcode id=766 lang=kotlin
 *
 * [766] Toeplitz Matrix
 */

class Solution {fun isToeplitzMatrix(matrix: Array<IntArray>) = matrix.indices.all { i -> matrix[0].indices.all { j -> i == 0 || j == 0 || matrix[i][j] == matrix[i-1][j-1] } }}

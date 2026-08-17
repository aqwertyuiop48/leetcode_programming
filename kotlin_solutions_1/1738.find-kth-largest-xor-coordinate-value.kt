/*
 * @lc app=leetcode id=1738 lang=kotlin
 *
 * [1738] Find Kth Largest XOR Coordinate Value
 */
class Solution { fun kthLargestValue(matrix: Array<IntArray>, k: Int): Int = matrix.indices.flatMap { i -> matrix[0].indices.map { j -> (matrix[i][j] xor (if (i > 0) matrix[i - 1][j] else 0) xor (if (j > 0) matrix[i][j - 1] else 0) xor (if (i > 0 && j > 0) matrix[i - 1][j - 1] else 0)).also { matrix[i][j] = it } } }.sortedDescending()[k - 1] }
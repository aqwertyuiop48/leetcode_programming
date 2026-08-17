/*
 * @lc app=leetcode id=1572 lang=kotlin
 *
 * [1572] Matrix Diagonal Sum
 */

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int = mat.indices.sumOf { i -> mat[i][i] + if (i != mat.size - 1 - i) mat[i][mat.size - 1 - i] else 0 }
}
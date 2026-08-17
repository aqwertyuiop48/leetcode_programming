/*
 * @lc app=leetcode id=1504 lang=kotlin
 *
 * [1504] Count Submatrices With All Ones
 */

class Solution { fun numSubmat(mat: Array<IntArray>): Int = mat.also { m -> m.indices.forEach { r -> (1 until m[0].size).forEach { c -> if (m[r][c] == 1) m[r][c] += m[r][c - 1] } } }.indices.sumOf { r -> mat[0].indices.sumOf { c -> (r downTo 0).scan(Int.MAX_VALUE) { w, k -> minOf(w, mat[k][c]) }.drop(1).takeWhile { it > 0 }.sum() } } }
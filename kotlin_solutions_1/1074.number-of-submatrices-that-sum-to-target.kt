/*
 * @lc app=leetcode id=1074 lang=kotlin
 *
 * [1074] Number of Submatrices That Sum to Target
 */

class Solution {
    fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int = matrix.map { row -> row.scan(0) { acc, x -> acc + x }.drop(1) }.let { rowPrefix -> (0 until matrix[0].size).sumOf { c1 -> (c1 until matrix[0].size).sumOf { c2 -> (0 until matrix.size).map { r -> rowPrefix[r][c2] - (if (c1 > 0) rowPrefix[r][c1 - 1] else 0) }.fold(Triple(0, 0, mutableMapOf(0 to 1))) { (totalCount, currentSum, map), x -> (currentSum + x).let { s -> Triple(totalCount + (map[s - target] ?: 0), s, map.also { it[s] = (it[s] ?: 0) + 1 }) } }.first } } }
}
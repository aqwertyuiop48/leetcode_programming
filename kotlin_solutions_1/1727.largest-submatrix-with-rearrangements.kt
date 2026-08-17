/*
 * @lc app=leetcode id=1727 lang=kotlin
 *
 * [1727] Largest Submatrix With Rearrangements
 */

class Solution { fun largestSubmatrix(matrix: Array<IntArray>): Int = matrix.fold(Pair(IntArray(matrix[0].size), 0)) { (heights, maxArea), row -> IntArray(row.size) { j -> if (row[j] == 1) heights[j] + 1 else 0 }.let { next -> Pair(next, maxOf(maxArea, next.sorted().mapIndexed { idx, h -> h * (next.size - idx) }.maxOrNull() ?: 0)) } }.second }
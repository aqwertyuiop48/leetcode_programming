/*
 * @lc app=leetcode id=54 lang=kotlin
 *
 * [54] Spiral Matrix
 */

class Solution { fun spiralOrder(matrix: Array<IntArray>): List<Int> = mutableListOf<Int>().apply { intArrayOf(0, matrix[0].size-1, 0, matrix.size-1, 0).also { bounds -> while(bounds[0] <= bounds[1] && bounds[2] <= bounds[3]) when(bounds[4]) { 0 -> (bounds[0]..bounds[1]).forEach { add(matrix[bounds[2]][it]) }.also { bounds[2]++ } 1 -> (bounds[2]..bounds[3]).forEach { add(matrix[it][bounds[1]]) }.also { bounds[1]-- } 2 -> (bounds[1] downTo bounds[0]).forEach { add(matrix[bounds[3]][it]) }.also { bounds[3]-- } 3 -> (bounds[3] downTo bounds[2]).forEach { add(matrix[it][bounds[0]]) }.also { bounds[0]++ } else -> Unit }.also { bounds[4] = (bounds[4] + 1) % 4 } } } }

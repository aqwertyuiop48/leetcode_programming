/*
 * @lc app=leetcode id=48 lang=kotlin
 *
 * [48] Rotate Image
 */

class Solution {fun rotate(matrix: Array<IntArray>): Unit = matrix.apply { (0 until size).forEach { i -> (i + 1 until size).forEach { j -> this[i][j] = this[j][i].also { this[j][i] = this[i][j] } }.also { this[i] = this[i].reversed().toIntArray() } } }.let { }}


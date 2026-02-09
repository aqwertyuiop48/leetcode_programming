/*
 * @lc app=leetcode id=73 lang=kotlin
 *
 * [73] Set Matrix Zeroes
 */

class Solution { fun setZeroes(matrix: Array<IntArray>): Unit = matrix.run { mutableSetOf<Pair<Int, Int>>() .apply { this@run.forEachIndexed { i, row -> row.forEachIndexed { j, v -> if (v == 0) add(i to j) } } } .forEach { (i, j) -> this[i].fill(0).also { (0 until size).forEach { this[it][j] = 0 } } } } }


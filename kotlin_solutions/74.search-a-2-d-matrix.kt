/*
 * @lc app=leetcode id=74 lang=kotlin
 *
 * [74] Search a 2D Matrix
 */

class Solution {fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {return matrix.any { it.contains(target) }}}


/*
 * @lc app=leetcode id=240 lang=kotlin
 *
 * [240] Search a 2D Matrix II
 */

class Solution {fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean = matrix.any { it.binarySearch(target) >= 0 }}

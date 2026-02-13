/*
 * @lc app=leetcode id=378 lang=kotlin
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

class Solution {fun kthSmallest(matrix: Array<IntArray>, k: Int): Int = matrix.flatMap { it.asIterable() }.sorted()[k - 1]}

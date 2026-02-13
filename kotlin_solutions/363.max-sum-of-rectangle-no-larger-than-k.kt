/*
 * @lc app=leetcode id=363 lang=kotlin
 *
 * [363] Max Sum of Rectangle No Larger Than K
 */

class Solution {fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int = (matrix.size to (matrix.getOrNull(0)?.size ?: 0)).let { (R, C) -> Triple(R, C, Array(R + 1) { IntArray(C + 1) }.apply { (0..<R).forEach { r -> (0..<C).fold(0) { acc, c -> (acc + matrix[r][c]).also { currentPrefix -> this[r + 1][c + 1] = currentPrefix + this[r][c + 1] } } } }) }.let { (R, C, prefixSum) -> intArrayOf(Int.MIN_VALUE).let { maxSumHolder -> (0..<R).forEach { r1 -> (r1..<R).forEach { r2 -> (0..<C).forEach { c1 -> (c1..<C).forEach { c2 -> (prefixSum[r2 + 1][c2 + 1] - prefixSum[r1][c2 + 1] - prefixSum[r2 + 1][c1] + prefixSum[r1][c1]).let { currentSum -> if (currentSum <= k) maxSumHolder[0] = maxOf(maxSumHolder[0], currentSum) } } } } }.let { maxSumHolder[0].takeIf { it != Int.MIN_VALUE } ?: 0 } } }}

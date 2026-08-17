/*
 * @lc app=leetcode id=1292 lang=kotlin
 *
 * [1292] Maximum Side Length of a Square with Sum Less than or Equal to Threshold
 */

class Solution {
    fun maxSideLength(mat: Array<IntArray>, threshold: Int): Int =
        Array(mat.size + 1) { IntArray(mat[0].size + 1) }.run {
            (1..mat.size).forEach { r ->
                (1..mat[0].size).forEach { c ->
                    this[r][c] = this[r - 1][c] + this[r][c - 1] - this[r - 1][c - 1] + mat[r - 1][c - 1]
                }
            }
            (1..mat.size).fold(0) { len, r ->
                (1..mat[0].size).fold(len) { cur, c ->
                    if (r >= cur + 1 && c >= cur + 1 && this[r][c] - this[r - cur - 1][c] - this[r][c - cur - 1] + this[r - cur - 1][c - cur - 1] <= threshold) cur + 1 else cur
                }
            }
        }
}
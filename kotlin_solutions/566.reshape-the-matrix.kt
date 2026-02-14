/*
 * @lc app=leetcode id=566 lang=kotlin
 *
 * [566] Reshape the Matrix
 */

class Solution { fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int) = if (mat.size * mat[0].size != r * c) mat else mat.flatMap { it.toList() }.chunked(c).map { it.toIntArray() }.toTypedArray() }

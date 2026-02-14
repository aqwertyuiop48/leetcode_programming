/*
 * @lc app=leetcode id=733 lang=kotlin
 *
 * [733] Flood Fill
 */

class Solution { fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int) = image.apply { if (this[sr][sc] != color) DeepRecursiveFunction<Triple<Int, Int, Int>, Unit> { (r, c, src) -> run { this@apply[r][c] = color }.run { arrayOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1).forEach { (dr, dc) -> (r + dr to c + dc).let { (nr, nc) -> if (nr in indices && nc in this@apply[0].indices && this@apply[nr][nc] == src) callRecursive(Triple(nr, nc, src)) } } } }.invoke(Triple(sr, sc, this[sr][sc])) } }
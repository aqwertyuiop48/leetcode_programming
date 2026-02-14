/*
 * @lc app=leetcode id=498 lang=kotlin
 *
 * [498] Diagonal Traverse
 */

class Solution(var r: Int = 0, var c: Int = 0, var up: Boolean = true) { fun findDiagonalOrder(m: Array<IntArray>) = IntArray(m.size * m[0].size).apply { indices.forEach { i -> this[i] = m[r][c].also { when { up && (r == 0 || c == m[0].size - 1) -> { (if (c < m[0].size - 1) c += 1 else r += 1).also { up = !up } } !up && (r == m.size - 1 || c == 0) -> { (if (r < m.size - 1) r += 1 else c += 1).also { up = !up } } up -> { r -= 1.also{c += 1 }} else -> { r += 1.also{c -= 1 }} } }} } }

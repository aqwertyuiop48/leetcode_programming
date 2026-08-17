/*
 * @lc app=leetcode id=1284 lang=kotlin
 *
 * [1284] Minimum Number of Flips to Convert Binary Matrix to Zero Matrix
 */

class Solution {
    fun minFlips(mat: Array<IntArray>): Int = mat.size.let { m -> mat[0].size.let { n -> (m * n).let { len -> (0 until len).map { k -> listOf(k / n to k % n, k / n - 1 to k % n, k / n + 1 to k % n, k / n to k % n - 1, k / n to k % n + 1).filter { (r, c) -> r in 0 until m && c in 0 until n }.fold(0) { a, (r, c) -> a or (1 shl (r * n + c)) } }.let { masks -> (0 until (1 shl len)).filter { s -> (0 until len).fold(0) { a, k -> if ((s and (1 shl k)) != 0) a xor masks[k] else a } == mat.foldIndexed(0) { i, acc, row -> row.foldIndexed(acc) { j, a, v -> a or (v shl (i * n + j)) } } }.map { Integer.bitCount(it) }.minOrNull() ?: -1 } } } }
}
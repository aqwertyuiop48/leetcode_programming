/*
 * @lc app=leetcode id=3257 lang=java
 *
 * [3257] Maximum Value Sum by Placing Three Rooks II
 */
class Solution { fun maximumValueSum(board: Array<IntArray>): Long = board.flatMapIndexed { r, row -> row.mapIndexed { c, v -> longArrayOf(v.toLong(), r.toLong(), c.toLong()) }.sortedByDescending { it[0] }.take(3) }.sortedByDescending { it[0] }.take(200).let { c -> c.indices.fold(Long.MIN_VALUE) { m, i -> (i + 1 until c.size).fold(m) { m2, j -> (j + 1 until c.size).fold(m2) { m3, k -> if (c[i][1] != c[j][1] && c[i][1] != c[k][1] && c[j][1] != c[k][1] && c[i][2] != c[j][2] && c[i][2] != c[k][2] && c[j][2] != c[k][2]) maxOf(m3, c[i][0] + c[j][0] + c[k][0]) else m3 } } } } }
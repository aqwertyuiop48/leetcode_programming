/*
 * @lc app=leetcode id=2536 lang=kotlin
 *
 * [2536] Increment Submatrices by One
 */

class Solution { fun rangeAddQueries(n: Int, queries: Array<IntArray>) = Array(n) { IntArray(n) }.apply { queries.forEach { (r1, c1, r2, c2) -> (r1..r2).forEach { r -> this[r][c1]++.let { if (c2 + 1 < n) this[r][c2 + 1]-- } } } }.apply { forEach { row -> row.foldIndexed(0) { c, acc, v -> (acc + v).apply { row[c] = this } } } } }
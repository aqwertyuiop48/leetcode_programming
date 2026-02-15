/*
 * @lc app=leetcode id=2536 lang=kotlin
 *
 * [2536] Increment Submatrices by One
 */

class Solution {fun rangeAddQueries(n: Int, queries: Array<IntArray>) = Array(n) { IntArray(n) }.also { matrix -> queries.forEach { q -> (q[0]..q[2]).forEach { j -> (q[1]..q[3]).forEach { k -> matrix[j][k]++ } } } }}

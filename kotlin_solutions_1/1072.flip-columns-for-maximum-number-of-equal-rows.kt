/*
 * @lc app=leetcode id=1072 lang=kotlin
 *
 * [1072] Flip Columns For Maximum Number of Equal Rows
 */

class Solution {
    fun maxEqualRowsAfterFlips(m: Array<IntArray>): Int = m.map { row -> row.map { it xor row[0] } }.groupingBy { it }.eachCount().values.maxOrNull() ?: 0
}
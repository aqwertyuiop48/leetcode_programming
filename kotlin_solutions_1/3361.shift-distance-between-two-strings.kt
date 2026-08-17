/*
 * @lc app=leetcode id=3361 lang=java
 *
 * [3361] Shift Distance Between Two Strings
 */
class Solution {
    fun shiftDistance(s: String, t: String, nextCost: IntArray, previousCost: IntArray): Long = s.indices.sumOf { i -> (s[i] - 'a').let { a -> (t[i] - 'a').let { b -> minOf((0 until (b - a + 26) % 26).fold(0L) { acc, j -> acc + nextCost[(a + j) % 26] }, (0 until (a - b + 26) % 26).fold(0L) { acc, j -> acc + previousCost[(a - j + 26) % 26]) } } }
}
/*
 * @lc app=leetcode id=3193 lang=kotlin
 *
 * [3193] Count the Number of Inversions
 */
class Solution { fun numberOfPermutations(n: Int, requirements: Array<IntArray>): Int = IntArray(n) { -1 }.also { req -> requirements.forEach { req[it[0]] = it[1] } }.let { req -> if (req[0] > 0) 0 else (1 until n).fold(IntArray(401).also { it[0] = 1 }) { dp, i -> IntArray(401) { j -> if (req[i] != -1 && req[i] != j) 0 else (0..minOf(i, j)).fold(0) { acc, k -> (acc + dp[j - k]) % 1_000_000_007 } } }[req[n - 1]] } }
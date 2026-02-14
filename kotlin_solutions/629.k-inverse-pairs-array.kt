/*
 * @lc app=leetcode id=629 lang=kotlin
 *
 * [629] K Inverse Pairs Array
 */
class Solution { fun kInversePairs(n: Int, k: Int): Int = (1..n).fold(IntArray(k + 1).apply { this[0] = 1 }) { dp, i -> IntArray(k + 1).apply { (0..k).forEach { j -> this[j] = ((0..minOf(j, i - 1)).sumOf { dp[j - it].toLong() } % 1000000007).toInt() } } }.let { it[k] } }

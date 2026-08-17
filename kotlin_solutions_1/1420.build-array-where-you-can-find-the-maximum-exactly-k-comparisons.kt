/*
 * @lc app=leetcode id=1420 lang=kotlin
 *
 * [1420] Build Array Where You Can Find The Maximum Exactly K Comparisons
 */

class Solution { fun numOfArrays(n: Int, m: Int, k: Int): Int = Array(n + 1) { Array(k + 1) { LongArray(m + 1) } }.apply { (1..m).forEach { x -> this[1][1][x] = 1L } }.apply { (2..n).forEach { i -> (1..k).forEach { j -> (1..m).forEach { maxVal -> this[i][j][maxVal] = ((this[i - 1][j][maxVal] * maxVal % 1000000007) + (1 until maxVal).fold(0L) { acc, prev -> acc + this[i - 1][j - 1][prev] }) % 1000000007 } } } }.let { dp -> (1..m).fold(0L) { acc, x -> (acc + dp[n][k][x]) % 1000000007 }.toInt() } }
/*
 * @lc app=leetcode id=552 lang=kotlin
 *
 * [552] Student Attendance Record II
 */

class Solution {fun checkRecord(n: Int) = Array(n + 1) { _ -> IntArray(7) }.apply { this[0][0] = 1 }.also { dp -> (1..n).forEach { i -> dp[i][0] = ((dp[i - 1][0] + dp[i - 1][1]) % 1000000007 + dp[i - 1][2]) % 1000000007.also { dp[i][1] = dp[i - 1][0] }.also { dp[i][2] = dp[i - 1][1] }.also { dp[i][4] = (((((dp[i - 1][0] + dp[i - 1][1]) % 1000000007 + dp[i - 1][2]) % 1000000007 + dp[i - 1][4]) % 1000000007 + dp[i - 1][5]) % 1000000007 + dp[i - 1][6]) % 1000000007 }.also { dp[i][5] = dp[i - 1][4] }.also { dp[i][6] = dp[i - 1][5] } } }.let { it[n].fold(0) { acc, v -> (acc + v) % 1000000007 } }}

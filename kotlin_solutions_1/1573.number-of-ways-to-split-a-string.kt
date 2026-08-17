/*
 * @lc app=leetcode id=1573 lang=kotlin
 *
 * [1573] Number of Ways to Split a String
 */

class Solution {
    fun numWays(s: String): Int = s.indices.filter { s[it] == '1' }.let { ones -> if (ones.size % 3 != 0) 0 else if (ones.isEmpty()) ((s.length.toLong() - 1) * (s.length.toLong() - 2) / 2 % 1000000007).toInt() else ((ones[ones.size / 3] - ones[ones.size / 3 - 1]).toLong() * (ones[2 * ones.size / 3] - ones[2 * ones.size / 3 - 1]) % 1000000007).toInt() }
}
/*
 * @lc app=leetcode id=1987 lang=kotlin
 *
 * [1987] Number of Unique Good Subsequences
 */

class Solution { fun numberOfUniqueGoodSubsequences(binary: String): Int = binary.fold(LongArray(3)) { s, c -> s.apply { if (c == '0') s.set(0, (s[0] + s[1]) % 1000000007).run { s.set(2, 1) } else s.set(1, (s[0] + s[1] + 1) % 1000000007) } }.let { ((it[0] + it[1] + it[2]) % 1000000007).toInt() } }
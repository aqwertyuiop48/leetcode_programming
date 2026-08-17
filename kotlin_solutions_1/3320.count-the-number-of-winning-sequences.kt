/*
 * @lc app=leetcode id=3320 lang=java
 *
 * [3320] Count The Number of Winning Sequences
 */
fun countWinningSequences(s: String): Int = (mapOf('F' to 0, 'E' to 1, 'S' to 2)).let { map -> Array(2) { Array(3) { IntArray(2001) } }.also { dp -> (0..2).forEach { m -> dp[0][m][1000 + (if (m == (map[s[0]]!! + 1) % 3) 1 else if (m == (map[s[0]]!! + 2) % 3) -1 else 0)] = 1 } }.let { dp -> (1 until s.length).fold(dp) { curr, i -> Array(2) { Array(3) { IntArray(2001) } }.also { next -> (0..2).forEach { prevM -> (0..2000).forEach { score -> if (curr[0][prevM][score] > 0) (0..2).forEach { currM -> if (currM != prevM) (score + (if (currM == (map[s[i]]!! + 1) % 3) 1 else if (currM == (map[s[i]]!! + 2) % 3) -1 else 0)).let { nextS -> if (nextS in 0..2000) next[0][currM][nextS] = (next[0][currM][nextS] + curr[0][prevM][score]) % 1000000007 } } } } } }.let { final -> (0..2).sumOf { m -> (1001..2000).sumOf { sc -> final[0][m][sc].toLong() } % 1000000007 }.toInt() % 1000000007 } } }
/*
 * @lc app=leetcode id=943 lang=kotlin
 *
 * [943] Find the Shortest Superstring
 */

class Solution { fun shortestSuperstring(words: Array<String>): String = words.size.let { n -> Array(n) { i -> IntArray(n) { j -> if (i == j) 0 else (0..words[i].length).first { k -> words[j].startsWith(words[i].substring(k)) }.let { words[i].length - it } } }.let { overlap -> Array(1 shl n) { IntArray(n) }.let { dp -> Array(1 shl n) { IntArray(n) }.let { parent -> (0 until (1 shl n)).forEach { mask -> (0 until n).forEach { i -> if ((mask and (1 shl i)) > 0) { (0 until n).forEach { j -> if ((mask and (1 shl j)) == 0) { (dp[mask][i] + overlap[i][j]).let { nextVal -> if (nextVal >= dp[mask or (1 shl j)][j]) { dp[mask or (1 shl j)][j] = nextVal .also{parent[mask or (1 shl j)][j] = i} } } } } } } }.let { (0 until n).maxByOrNull { dp[(1 shl n) - 1][it] } ?: 0 }.let { bestLast -> generateSequence(Triple((1 shl n) - 1, bestLast, "")) { (mask, last, _) -> if (mask == 0) null else parent[mask][last].let { prev -> Triple(mask xor (1 shl last), prev, words[last].substring(if ((mask and (mask - 1)) == 0) 0 else overlap[prev][last])) } }.map { it.third }.toList().reversed().joinToString("") } } } } } }
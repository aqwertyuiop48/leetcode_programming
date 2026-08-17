/*
 * @lc app=leetcode id=1405 lang=kotlin
 *
 * [1405] Longest Happy String
 */

class Solution { fun longestDiverseString(a: Int, b: Int, c: Int): String = generateSequence(StringBuilder() to intArrayOf(a, b, c)) { (sb, counts) -> (0..2).filter { counts[it] > 0 && !(sb.length >= 2 && sb[sb.length - 1] == 'a' + it && sb[sb.length - 2] == 'a' + it) }.maxByOrNull { counts[it] }?.let { i -> sb.append('a' + i).also { counts[i]-- } }?.let { sb to counts } }.last().first.toString() }
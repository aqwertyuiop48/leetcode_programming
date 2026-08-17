/*
 * @lc app=leetcode id=1147 lang=kotlin
 *
 * [1147] Longest Chunked Palindrome Decomposition
 */

class Solution { fun longestDecomposition(text: String): Int = DeepRecursiveFunction<String, Int> { s -> if (s.isEmpty()) 0 else (1..s.length / 2).firstOrNull { i -> s.take(i) == s.takeLast(i) }?.let { i -> 2 + callRecursive(s.substring(i, s.length - i)) } ?: 1 }(text) }
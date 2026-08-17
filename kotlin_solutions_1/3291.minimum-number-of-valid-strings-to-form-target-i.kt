/*
 * @lc app=leetcode id=3291 lang=java
 *
 * [3291] Minimum Number of Valid Strings to Form Target I
 */

class Solution {
    fun minValidStrings(words: Array<String>, target: String): Int = IntArray(target.length + 1) { 100000 }.apply { this[0] = 0 }.let { dp -> IntArray(100005 * 26).let { trie -> intArrayOf(1).let { trieIdx -> words.forEach { word -> word.fold(0) { curr, char -> (char - 'a').let { c -> (if (trie[curr * 26 + c] == 0) trie[curr * 26 + c] = trieIdx[0].also { trieIdx[0]++ } else Unit).let { trie[curr * 26 + c] } } } } }.run { (0 until target.length).forEach { i -> if (dp[i] < 100000) (i until target.length).fold(0) { curr, j -> if (curr != -1) (target[j] - 'a').let { c -> if (trie[curr * 26 + c] != 0) trie[curr * 26 + c].also { dp[j + 1] = minOf(dp[j + 1], dp[i] + 1) } else -1 } else -1 } } } }.run { if (dp[target.length] >= 100000) -1 else dp[target.length] } }
}
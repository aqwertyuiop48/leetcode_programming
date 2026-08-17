/*
 * @lc app=leetcode id=2953 lang=kotlin
 *
 * [2953] Count Complete Substrings
 */

class Solution {
    fun countCompleteSubstrings(word: String, k: Int): Int = IntArray(word.length).also { valid -> word.indices.forEach { i -> valid[i] = if (i > 0 && kotlin.math.abs(word[i] - word[i - 1]) <= 2) valid[i - 1] + 1 else 1 } }.let { valid -> (1..26).map { u -> u * k }.filter { len -> len <= word.length }.sumOf { len -> IntArray(26).let { freq -> IntArray(1).let { countK -> word.indices.count { i -> (word[i] - 'a').let { cIn -> countK[0] += ((if (freq[cIn] == k - 1) 1 else 0) - (if (freq[cIn] == k) 1 else 0)).also { freq[cIn]++ } }.let { if (i >= len) (word[i - len] - 'a').let { cOut -> countK[0] += ((if (freq[cOut] == k + 1) 1 else 0) - (if (freq[cOut] == k) 1 else 0)).also { freq[cOut]-- } } }.let { i >= len - 1 && valid[i] >= len && countK[0] == len / k } } } } }
}
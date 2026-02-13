/*
 * @lc app=leetcode id=336 lang=kotlin
 *
 * [336] Palindrome Pairs
 */

class Solution { fun palindromePairs(words: Array<String>): List<List<Int>> = words.withIndex().associate { it.value to it.index }.let { wordMap -> words.flatMapIndexed { i, word -> (0..word.length).flatMap { j -> listOfNotNull(if (isPalindrome(word, 0, j - 1)) wordMap[word.substring(j).reversed()]?.takeIf { it != i }?.let { listOf(it, i) } else null, if (j != word.length && isPalindrome(word, j, word.length - 1)) wordMap[word.substring(0, j).reversed()]?.takeIf { it != i }?.let { listOf(i, it) } else null) } }.distinct() } fun isPalindrome(s: String, l: Int, r: Int): Boolean = if (l >= r) true else (l..(l + r) / 2).all { s[it] == s[r - it + l] } }
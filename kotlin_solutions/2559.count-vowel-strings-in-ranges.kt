/*
 * @lc app=leetcode id=2559 lang=kotlin
 *
 * [2559] Count Vowel Strings in Ranges
 */

class Solution {fun vowelStrings(words: Array<String>, queries: Array<IntArray>) = setOf('a', 'e', 'i', 'o', 'u').let { vowels -> words.scan(0) { acc, word -> acc + if (word.first() in vowels && word.last() in vowels) 1 else 0 }.let { prefixSums -> queries.map { (start, end) -> prefixSums[end + 1] - prefixSums[start] }.toIntArray() } }}

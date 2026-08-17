/*
 * @lc app=leetcode id=3042 lang=kotlin
 *
 * [3042] Count Prefix and Suffix Pairs I
 */

class Solution { fun countPrefixSuffixPairs(words: Array<String>): Int = words.indices.sumOf { i -> (i + 1 until words.size).count { j -> words[j].startsWith(words[i]) && words[j].endsWith(words[i]) } } }
/*
 * @lc app=leetcode id=472 lang=kotlin
 *
 * [472] Concatenated Words
 */

class Solution { fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> = words.toSet().let { dict -> words.filter { word -> BooleanArray(word.length + 1).apply { this[0] = true }.let { dp -> (1..word.length).forEach { i -> (0..<i).forEach { j -> if (dp[j] && word.substring(j, i) in dict && word.substring(j, i) != word) dp[i] = true } } .run{dp[word.length]} } } } }
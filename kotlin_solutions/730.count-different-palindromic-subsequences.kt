/*
 * @lc app=leetcode id=730 lang=kotlin
 *
 * [730] Count Different Palindromic Subsequences
 */

class Solution {fun countPalindromicSubsequences(str: String) = mutableMapOf<Char, Int>().let { map -> IntArray(str.length) { i -> (map[str[i]] ?: -1).also { map[str[i]] = i } } }.let { pre -> mutableMapOf<Char, Int>().let { map -> IntArray(str.length) { i -> (str.length - 1 - i).let { idx -> (map[str[idx]] ?: Int.MAX_VALUE).also { map[str[idx]] = idx } } } }.reversedArray().let { next -> Array(str.length) { IntArray(str.length) }.apply { (0 until str.length).forEach { g -> (0..str.length - 1 - g).forEach { i -> (i + g).let { j -> this[i][j] = when (g) { 0 -> {1} 1 -> {2} else -> (if (str[i] == str[j]) next[i].let { n -> pre[j].let { p -> when { n > p -> {((2 * this[i + 1][j - 1]) + 2) % 1000000007} n == p -> {((2 * this[i + 1][j - 1]) + 1) % 1000000007} else -> ((2 * this[i + 1][j - 1]) - this[n + 1][p - 1]) % 1000000007 } } } else (this[i + 1][j] + this[i][j - 1] - this[i + 1][j - 1]) % 1000000007).let { (it % 1000000007 + 1000000007) % 1000000007 } } } } } }[0][str.length - 1] } } }

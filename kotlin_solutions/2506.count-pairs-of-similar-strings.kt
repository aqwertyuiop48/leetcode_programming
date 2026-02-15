/*
 * @lc app=leetcode id=2506 lang=kotlin
 *
 * [2506] Count Pairs Of Similar Strings
 */

class Solution {fun similarPairs(words: Array<String>) = words.map { it.toSet().sorted().joinToString("") }.groupingBy { it }.eachCount().values.sumOf { it * (it - 1) / 2 }}


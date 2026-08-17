/*
 * @lc app=leetcode id=3039 lang=kotlin
 *
 * [3039] Apply Operations to Make String Empty
 */

class Solution { fun lastNonEmptyString(s: String): String = s.groupingBy { it }.eachCount().let { counts -> (counts.values.maxOrNull() ?: 0).let { maxFreq -> s.indices.filter { i -> counts[s[i]] == maxFreq && s.lastIndexOf(s[i]) == i }.map { s[it] }.joinToString("") } } }
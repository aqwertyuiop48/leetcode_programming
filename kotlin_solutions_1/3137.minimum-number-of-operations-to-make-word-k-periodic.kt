/*
 * @lc app=leetcode id=3137 lang=kotlin
 *
 * [3137] Minimum Number of Operations to Make Word K-Periodic
 */

class Solution { fun minimumOperationsToMakeKPeriodic(word: String, k: Int): Int = word.chunked(k).let { blocks -> blocks.size - blocks.groupingBy { it }.eachCount().values.maxOrNull()!! } }
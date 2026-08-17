/*
 * @lc app=leetcode id=3541 lang=kotlin
 *
 * [3541] Find Most Frequent Vowel and Consonant
 */

class Solution { fun maxFreqSum(s: String): Int = s.groupingBy { it }.eachCount().let { counts -> (counts.filterKeys { it in "aeiou" }.values.maxOrNull() ?: 0) + (counts.filterKeys { it !in "aeiou" }.values.maxOrNull() ?: 0) } }
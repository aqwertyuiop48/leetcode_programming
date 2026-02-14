/*
 * @lc app=leetcode id=506 lang=kotlin
 *
 * [506] Relative Ranks
 */

class Solution { fun findRelativeRanks(s: IntArray) = Array(s.size) { i -> s.indices.count { j -> s[i] < s[j] }.let { rank -> when (rank) { 0 -> {"Gold Medal"} 1 -> {"Silver Medal"} 2 -> {"Bronze Medal"} else -> "${rank + 1}" } } } }


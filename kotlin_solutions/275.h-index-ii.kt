/*
 * @lc app=leetcode id=275 lang=kotlin
 *
 * [275] H-Index II
 */

class Solution { fun hIndex(citations: IntArray) = citations.indices.firstOrNull { citations[it] >= citations.size - it }?.let { citations.size - it } ?: 0 }

/*
 * @lc app=leetcode id=274 lang=kotlin
 *
 * [274] H-Index
 */

class Solution {fun hIndex(citations: IntArray) = citations.sortedDescending().withIndex().lastOrNull { (i, citation) -> citation >= i + 1 }?.let { it.index + 1 } ?: 0}


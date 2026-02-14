/*
 * @lc app=leetcode id=594 lang=kotlin
 *
 * [594] Longest Harmonious Subsequence
 */

class Solution { fun findLHS(nums: IntArray): Int = nums.groupBy { it }.mapValues { it.value.size }.let { m -> m.keys.maxOfOrNull { k -> (m[k]!! + (m[k + 1] ?: 0)).takeIf { m.containsKey(k + 1) } ?: 0 } ?: 0 } }


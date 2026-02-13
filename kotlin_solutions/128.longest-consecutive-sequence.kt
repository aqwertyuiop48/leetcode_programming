/*
 * @lc app=leetcode id=128 lang=kotlin
 *
 * [128] Longest Consecutive Sequence
 */

class Solution { fun longestConsecutive(nums: IntArray): Int = nums.toSet().let { set -> set.filter { it - 1 !in set }.maxOfOrNull { start -> generateSequence(start) { it + 1 }.takeWhile { it in set }.count() } ?: 0 } }

/*
 * @lc app=leetcode id=1207 lang=kotlin
 *
 * [1207] Unique Number of Occurrences
 */

class Solution { fun uniqueOccurrences(arr: IntArray): Boolean = arr.asSequence().groupingBy { it }.eachCount().values.let { it.size == it.toSet().size } }
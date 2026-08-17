/*
 * @lc app=leetcode id=1897 lang=kotlin
 *
 * [1897] Redistribute Characters to Make All Strings Equal
 */

class Solution { fun makeEqual(words: Array<String>): Boolean = words.flatMap { it.toList() }.groupBy { it }.all { it.value.size % words.size == 0 } }
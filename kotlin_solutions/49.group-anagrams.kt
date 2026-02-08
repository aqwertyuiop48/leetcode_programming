/*
 * @lc app=leetcode id=49 lang=kotlin
 *
 * [49] Group Anagrams
 */

class Solution {fun groupAnagrams(strs: Array<String>): List<List<String>> = strs.groupBy { it.toCharArray().sorted().joinToString() }.values.toList()}
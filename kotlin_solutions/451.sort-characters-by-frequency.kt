/*
 * @lc app=leetcode id=451 lang=kotlin
 *
 * [451] Sort Characters By Frequency
 */

class Solution { fun frequencySort(s: String): String = s.groupingBy { it }.eachCount().entries.sortedByDescending { it.value } .joinToString("") { it.key.toString().repeat(it.value) } }

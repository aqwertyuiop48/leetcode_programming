/*
 * @lc app=leetcode id=383 lang=kotlin
 *
 * [383] Ransom Note
 */

class Solution {fun canConstruct(ransomNote: String, magazine: String): Boolean = magazine.groupingBy { it }.eachCount().let { counts -> ransomNote.fold(counts.toMutableMap()) { map, c -> map.apply { this[c] = (this[c] ?: 0) - 1 } }.values.all { it >= 0 } }}

/*
 * @lc app=leetcode id=692 lang=kotlin
 *
 * [692] Top K Frequent Words
 */

class Solution { fun topKFrequent(words: Array<String>, k: Int): List<String> = words.groupingBy { it }.eachCount().entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key }).take(k).map { it.key } }


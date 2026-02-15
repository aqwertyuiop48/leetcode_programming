/*
 * @lc app=leetcode id=884 lang=kotlin
 *
 * [884] Uncommon Words from Two Sentences
 */

class Solution { fun uncommonFromSentences(s1: String, s2: String) = (s1.split(" ") + s2.split(" ")).groupingBy { it }.eachCount().filter { it.value == 1 }.keys.toTypedArray() }
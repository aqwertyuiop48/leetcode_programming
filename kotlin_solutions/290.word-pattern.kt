/*
 * @lc app=leetcode id=290 lang=kotlin
 *
 * [290] Word Pattern
 */
class Solution {fun wordPattern(pattern: String, s: String): Boolean = s.split(" ").let { words -> pattern.length == words.size && pattern.toList().zip(words).run { groupBy { it.first }.all { it.value.map { p -> p.second }.distinct().size == 1 } && groupBy { it.second }.all { it.value.map { p -> p.first }.distinct().size == 1 } } }}


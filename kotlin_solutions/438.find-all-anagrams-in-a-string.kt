/*
 * @lc app=leetcode id=438 lang=kotlin
 *
 * [438] Find All Anagrams in a String
 */

class Solution {fun findAnagrams(s: String, p: String): List<Int> = p.groupingBy { it }.eachCount().let { target -> s.windowed(p.length, 1).mapIndexedNotNull { i, w -> if (w.groupingBy { it }.eachCount() == target) i else null } }}
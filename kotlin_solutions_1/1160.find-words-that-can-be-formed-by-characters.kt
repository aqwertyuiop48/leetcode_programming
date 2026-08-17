/*
 * @lc app=leetcode id=1160 lang=kotlin
 *
 * [1160] Find Words That Can Be Formed by Characters
 */

class Solution { fun countCharacters(words: Array<String>, chars: String): Int = chars.groupingBy { it }.eachCount().let { counts -> words.filter { w -> w.groupingBy { it }.eachCount().all { (c, count) -> count <= (counts[c] ?: 0) } }.sumOf { it.length } } }
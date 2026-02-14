/*
 * @lc app=leetcode id=557 lang=kotlin
 *
 * [557] Reverse Words in a String III
 */

class Solution {fun reverseWords(s: String) = s.split(" ").joinToString(" ") { it.reversed() }}


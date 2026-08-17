/*
 * @lc app=leetcode id=1624 lang=kotlin
 *
 * [1624] Largest Substring Between Two Equal Characters
 */

class Solution { fun maxLengthBetweenEqualCharacters(s: String): Int = s.indices.maxOf { s.lastIndexOf(s[it]) - s.indexOf(s[it]) - 1 } }
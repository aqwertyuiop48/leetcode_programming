/*
 * @lc app=leetcode id=709 lang=kotlin
 *
 * [709] To Lower Case
 */

class Solution { fun toLowerCase(s: String): String = s.map { if (it in 'A'..'Z') it + 32 else it }.joinToString("")}
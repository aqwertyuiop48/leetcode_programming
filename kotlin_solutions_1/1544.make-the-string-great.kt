/*
 * @lc app=leetcode id=1544 lang=kotlin
 *
 * [1544] Make The String Great
 */

class Solution { fun makeGood(s: String): String = s.fold(StringBuilder()) { sb, c -> sb.apply { if (isNotEmpty() && Math.abs(last() - c) == 32) deleteAt(length - 1) else append(c) } }.toString() }
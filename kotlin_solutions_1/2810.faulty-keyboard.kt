/* @lc app=leetcode id=2810 lang=kotlin */
class Solution { fun finalString(s: String): String = s.fold(StringBuilder()) { sb, c -> if (c == 'i') sb.reverse() else sb.append(c) }.toString() }
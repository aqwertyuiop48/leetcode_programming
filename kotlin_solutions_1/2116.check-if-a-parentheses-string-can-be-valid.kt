/* @lc app=leetcode id=2116 lang=kotlin */
class Solution {
    fun canBeValid(s: String, locked: String): Boolean = s.length % 2 == 0 && s.indices.fold(0) { b, i -> if (b < 0) b else if (locked[i] == '0' || s[i] == '(') b + 1 else b - 1 }.let { it >= 0 } && s.indices.reversed().fold(0) { b, i -> if (b < 0) b else if (locked[i] == '0' || s[i] == ')') b + 1 else b - 1 }.let { it >= 0 }
}
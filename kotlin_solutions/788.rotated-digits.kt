/*
 * @lc app=leetcode id=788 lang=kotlin
 *
 * [788] Rotated Digits
 */

class Solution { fun rotatedDigits(n: Int): Int = (1..n).count { num -> num.toString().let { s -> s.none { it in "347" } && s.any { it in "2569" } } } }


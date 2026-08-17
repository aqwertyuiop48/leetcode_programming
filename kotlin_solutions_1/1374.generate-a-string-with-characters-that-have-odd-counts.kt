/*
 * @lc app=leetcode id=1374 lang=kotlin
 *
 * [1374] Generate a String With Characters That Have Odd Counts
 */

class Solution { fun generateTheString(n: Int): String = if (n % 2 != 0) "a".repeat(n) else "a".repeat(n - 1) + "b" }
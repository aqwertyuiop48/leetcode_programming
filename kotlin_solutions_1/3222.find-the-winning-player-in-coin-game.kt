/* @lc app=leetcode id=3222 lang=kotlin */
class Solution { fun winningPlayer(x: Int, y: Int): String = if (minOf(x, y / 4) % 2 == 1) "Alice" else "Bob" }
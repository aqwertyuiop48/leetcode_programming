/*
 * @lc app=leetcode id=830 lang=kotlin
 *
 * [830] Positions of Large Groups
 */

class Solution { fun largeGroupPositions(s: String): List<List<Int>> = (s + " ").foldIndexed(mutableListOf<List<Int>>() to (s[0] to 0)) { i, (res, cur), c -> if (c == cur.first) res to (cur.first to cur.second) else (if (i - cur.second >= 3) res.apply { add(listOf(cur.second, i - 1)) } else res) to (c to i) }.first }

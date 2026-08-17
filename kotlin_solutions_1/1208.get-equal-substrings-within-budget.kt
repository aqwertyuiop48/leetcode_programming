/*
 * @lc app=leetcode id=1208 lang=kotlin
 *
 * [1208] Get Equal Substrings Within Budget
 */

class Solution { fun equalSubstring(s: String, t: String, maxCost: Int): Int = s.indices.fold(0 to 0) { (l, cost), r -> (cost + kotlin.math.abs(s[r] - t[r])).let { c -> if (c > maxCost) (l + 1) to (c - kotlin.math.abs(s[l] - t[l])) else l to c } }.let { (l, _) -> s.length - l } }
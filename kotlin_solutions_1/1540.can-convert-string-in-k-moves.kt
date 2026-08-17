/*
 * @lc app=leetcode id=1540 lang=kotlin
 *
 * [1540] Can Convert String in K Moves
 */

class Solution { fun canConvertString(s: String, t: String, k: Int): Boolean = s.length == t.length && IntArray(26).let { counts -> s.indices.all { i -> ((t[i] - s[i] + 26) % 26).let { shift -> shift == 0 || (shift + counts[shift] * 26 <= k).also { counts[shift]++ } } } } }
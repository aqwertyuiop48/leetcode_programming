/*
 * @lc app=leetcode id=828 lang=kotlin
 *
 * [828] Count Unique Characters of All Substrings of a Given String
 */

class Solution { fun uniqueLetterString(s: String): Int = (1..s.length).fold(Triple(IntArray(26), IntArray(26), 0 to 0)) { (prev, bp, dpSum), i -> (s[i - 1] - 'A').let { ch -> (dpSum.first + i - prev[ch] * 2 + bp[ch]).let { newDp -> Triple(prev.apply { bp[ch] = this[ch].also{this[ch] = i} }, bp, newDp to dpSum.second + newDp) } } }.third.second }

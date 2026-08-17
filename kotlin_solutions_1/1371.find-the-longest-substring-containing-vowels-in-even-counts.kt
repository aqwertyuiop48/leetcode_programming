/*
 * @lc app=leetcode id=1371 lang=kotlin
 *
 * [1371] Find the Longest Substring Containing Vowels in Even Counts
 */

class Solution { fun findTheLongestSubstring(s: String): Int = IntArray(32) { if (it == 0) -1 else -2 }.let { firstSeen -> s.foldIndexed(0 to 0) { i, (mask, maxLen), c -> (mask xor (if (c == 'a') 1 else if (c == 'e') 2 else if (c == 'i') 4 else if (c == 'o') 8 else if (c == 'u') 16 else 0)).let { newMask -> newMask to Math.max(maxLen, if (firstSeen[newMask] != -2) i - firstSeen[newMask] else 0.also { firstSeen[newMask] = i }) } }.second } }
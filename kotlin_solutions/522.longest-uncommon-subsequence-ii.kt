/*
 * @lc app=leetcode id=522 lang=kotlin
 *
 * [522] Longest Uncommon Subsequence II
 */

class Solution { fun findLUSlength(strs: Array<String>) = strs.sortedBy { -it.length }.let { sorted -> sorted.indices.firstOrNull { index -> sorted[index].let { s -> sorted.filterIndexed { checkIndex, checkString -> checkIndex != index }.all { checkString -> checkString.fold(0 to 0) { (checkIdx, sIdx), char -> if (sIdx < s.length && char == s[sIdx]) (checkIdx + 1) to (sIdx + 1) else (checkIdx + 1) to sIdx }.second < s.length } } }?.let { sorted[it].length } ?: -1 } }

/*
 * @lc app=leetcode id=467 lang=kotlin
 *
 * [467] Unique Substrings in Wraparound String
 */

class Solution { fun findSubstringInWraproundString(s: String): Int = IntArray(26).let { maxEndingWith -> s.foldIndexed(1) { i, sequence, c -> (if (i > 0 && (s[i - 1] == 'z' && c == 'a' || c - s[i - 1] == 1)) sequence + 1 else 1) .also { newSeq -> maxEndingWith[c - 'a'] = maxOf(maxEndingWith[c - 'a'], newSeq) } }.let { maxEndingWith.sum() } } }
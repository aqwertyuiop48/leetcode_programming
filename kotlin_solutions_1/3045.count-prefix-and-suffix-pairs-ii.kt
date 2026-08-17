/*
 * @lc app=leetcode id=3045 lang=kotlin
 *
 * [3045] Count Prefix and Suffix Pairs II
 */

class Solution { fun countPrefixSuffixPairs(words: Array<String>): Long = arrayOf(HashMap<Int, Any>(), LongArray(1)).let { root -> words.sumOf { w -> (0 until w.length).fold(root to 0L) { (curr, sum), i -> ((curr[0] as HashMap<Int, Array<Any>>).getOrPut(w[i].code * 128 + w[w.length - 1 - i].code) { arrayOf(HashMap<Int, Any>(), LongArray(1)) }).let { next -> next to sum + (next[1] as LongArray)[0] } }.also { (lastNode, _) -> (lastNode[1] as LongArray)[0]++ }.second } } }
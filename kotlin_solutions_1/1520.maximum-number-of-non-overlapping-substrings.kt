/*
 * @lc app=leetcode id=1520 lang=kotlin
 *
 * [1520] Maximum Number of Non-Overlapping Substrings
 */

class Solution {
    fun maxNumOfSubstrings(s: String): List<String> = IntArray(26) { -1 }.let { first -> IntArray(26) { -1 }.also { last -> s.indices.forEach { i -> (s[i] - 'a').let { c -> run { if (first[c] == -1) first[c] = i }.also { last[c] = i } } } }.let { last -> DeepRecursiveFunction<Triple<Int, Int, Int>, Pair<Int, Int>?> { (l, r, j) -> if (j > r) l to r else (s[j] - 'a').let { c -> if (first[c] < l) null else callRecursive(Triple(l, maxOf(r, last[c]), j + 1)) } }.let { expand -> (0..25).mapNotNull { i -> if (first[i] == -1) null else expand(Triple(first[i], last[i], first[i])) }.sortedBy { it.second }.fold(-1 to listOf<String>()) { (lastEnd, res), (l, r) -> if (l > lastEnd) r to (res + s.substring(l, r + 1)) else lastEnd to res }.second } }
}
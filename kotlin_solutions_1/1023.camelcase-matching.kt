/*
 * @lc app=leetcode id=1023 lang=kotlin
 *
 * [1023] Camelcase Matching
 */

class Solution {
    fun camelMatch(queries: Array<String>, pattern: String): List<Boolean> = queries.map { query -> query.fold(0 to true) { (pIdx, ok), c -> if (!ok) pIdx to false else if (pIdx < pattern.length && c == pattern[pIdx]) (pIdx + 1) to true else if (c.isUpperCase()) pIdx to false else pIdx to true }.let { (pIdx, ok) -> ok && pIdx == pattern.length } }
}
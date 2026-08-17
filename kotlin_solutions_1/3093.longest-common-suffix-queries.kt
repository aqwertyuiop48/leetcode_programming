/*
 * @lc app=leetcode id=3093 lang=kotlin
 *
 * [3093] Longest Common Suffix Queries
 */

class Solution { fun stringIndices(wordsContainer: Array<String>, wordsQuery: Array<String>): IntArray = Array<Any?>(27) { null }.apply { this[26] = wordsContainer.indices.minWith(compareBy({ wordsContainer[it].length }, { it })) }.also { root -> wordsContainer.indices.forEach { i -> wordsContainer[i].reversed().fold(root) { curr, ch -> ((curr[ch - 'a'] as? Array<Any?>) ?: Array<Any?>(27) { null }.also { curr[ch - 'a'] = it }).apply { (this[26] as? Int).let { b -> if (b == null || wordsContainer[i].length < wordsContainer[b].length || (wordsContainer[i].length == wordsContainer[b].length && i < b)) this[26] = i } } } } }.let { root -> wordsQuery.map { q -> q.reversed().fold(root to (root[26] as Int)) { (curr, best), ch -> (curr?.get(ch - 'a') as? Array<Any?>)?.let { it to (it[26] as Int) } ?: (null to best) }.second }.toIntArray() } }
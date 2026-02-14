/*
 * @lc app=leetcode id=721 lang=kotlin
 *
 * [721] Accounts Merge
 */

class Solution(private var parent: IntArray = IntArray(0)) { private fun find(x: Int): Int = if (parent[x] != x) find(parent[x]).also { parent[x] = it } else x fun accountsMerge(accounts: List<List<String>>): List<List<String>> = IntArray(accounts.size) { it }.also { parent = it }.let { mutableMapOf<String, Int>().also { emailMap -> accounts.forEachIndexed { i, acc -> acc.drop(1).forEach { email -> emailMap.getOrPut(email) { i }.let { existing -> if (existing != i) parent[find(i)] = find(existing) } } } }.entries.groupBy { find(it.value) }.values.map { listOf(accounts[it.first().value].first()) + it.map { it.key }.sorted() } } }

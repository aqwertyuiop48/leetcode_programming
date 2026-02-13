/*
 * @lc app=leetcode id=318 lang=kotlin
 *
 * [318] Maximum Product of Word Lengths
 */

class Solution {fun maxProduct(words: Array<String>): Int = words.indices.associate { it to words[it].toSet() }.let { map -> words.indices.flatMap { i -> ((i + 1) until words.size).map { j -> i to j } }.filter { (i, j) -> words[i].none { c -> map[j]!!.contains(c) } }.maxOfOrNull { (i, j) -> words[i].length * words[j].length } ?: 0 }}

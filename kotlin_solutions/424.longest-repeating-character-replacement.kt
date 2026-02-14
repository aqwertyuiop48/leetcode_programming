/*
 * @lc app=leetcode id=424 lang=kotlin
 *
 * [424] Longest Repeating Character Replacement
 */

class Solution {fun characterReplacement(s: String, k: Int): Int = s.indices.fold(0 to (0 to mutableMapOf<Char, Int>())) { (maxLen, state), r -> state.let { (l, cnt) -> cnt.apply { this[s[r]] = getOrDefault(s[r], 0) + 1 }.let { map -> generateSequence(l to map) { (left, m) -> if (r - left + 1 - (m.values.maxOrNull() ?: 0) > k) (left + 1 to m.apply { this[s[left]] = this[s[left]]!! - 1 }) else null }.last().let { (newL, newMap) -> maxOf(maxLen, r - newL + 1) to (newL to newMap) } } } }.first}

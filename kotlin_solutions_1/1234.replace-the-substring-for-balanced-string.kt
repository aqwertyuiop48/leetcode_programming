/*
 * @lc app=leetcode id=1234 lang=kotlin
 *
 * [1234] Replace the Substring for Balanced String
 */
class Solution { fun balancedString(s: String): Int = IntArray(128).apply { s.forEach { this[it.code]++ } }.let { c -> (s.length / 4).let { k -> if (c['Q'.code] <= k && c['W'.code] <= k && c['E'.code] <= k && c['R'.code] <= k) 0 else IntArray(2).apply { this[1] = s.length }.let { v -> s.indices.forEach { r -> c[s[r].code]--.also { while (c['Q'.code] <= k && c['W'.code] <= k && c['E'.code] <= k && c['R'.code] <= k) Math.min(v[1], r - v[0] + 1).also { v[1] = it }.also { c[s[v[0]++].code]++ } } }.run { v[1] } } } } }
/*
 * @lc app=leetcode id=2982 lang=kotlin
 *
 * [2982] Find Longest Special Substring That Occurs Thrice II
 */

class Solution { fun maximumLength(s: String): Int = Array(26) { IntArray(3) }.also { top -> IntArray(1).also { v -> s.indices.forEach { i -> v[0]++.also { if (i == s.length - 1 || s[i] != s[i + 1]) (s[i] - 'a').let { c -> top[c].let { t -> (if (v[0] > t[0]) Unit.also { t[2] = t[1] }.also { t[1] = t[0] }.also { t[0] = v[0] } else if (v[0] > t[1]) Unit.also { t[2] = t[1] }.also { t[1] = v[0] } else if (v[0] > t[2]) t[2] = v[0] else Unit).also { v[0] = 0 } } } } } } }.maxOf { t -> maxOf(t[0] - 2, minOf(t[0] - 1, t[1]), t[2]) }.let { if (it > 0) it else -1 } }
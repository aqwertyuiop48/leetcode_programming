/*
 * @lc app=leetcode id=3398 lang=java
 *
 * [3398] Smallest Substring With Identical Characters I
 */

fun minLength(s: String, k: Int): Int = (1..s.length).first { mid -> if (mid == 1) listOf(0, 1).any { start -> s.indices.count { i -> (s[i] - '0') != (start + i) % 2 } <= k } else s.indices.fold(mutableListOf<Int>()) { acc, i -> if (i > 0 && s[i] == s[i - 1]) acc.also { it[it.size - 1]++ } else acc.also { it.add(1) } }.sumOf { it / (mid + 1) } <= k }
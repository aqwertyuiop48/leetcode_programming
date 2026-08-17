/*
 * @lc app=leetcode id=3333 lang=java
 *
 * [3333] Find the Original Typed String II
 */
fun possibleStringCount(word: String, k: Int): Int = (0 until word.length).filter { it == 0 || word[it] != word[it - 1] }.let { indices -> IntArray(indices.size) { i -> (if (i == indices.size - 1) word.length else indices[i + 1]) - indices[i] } }.let { g -> if (g.size >= k) g.fold(1L) { a, b -> a * b % 1000000007 }.toInt() else LongArray(k).apply { this[0] = 1L }.let { dp -> g.fold(dp) { p, group -> LongArray(k).also { next -> LongArray(k + 1).also { pre -> (0 until k).forEach { pre[it + 1] = (pre[it] + p[it]) % 1000000007L } }.let { pre -> (0 until k).forEach { j -> next[j] = (pre[j] - pre[maxOf(0, j - group + 1)] + 1000000007L) % 1000000007L } } } } }.let { dp -> (g.fold(1L) { a, b -> a * b % 1000000007 } - dp.sumOf { it } % 1000000007 + 1000000007) % 1000000007 }.toInt() }
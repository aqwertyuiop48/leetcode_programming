/*
 * @lc app=leetcode id=3316 lang=java
 *
 * [3316] Find Maximum Removals From Source String
 */
fun maxRemovals(source: String, pattern: String, targetIndices: IntArray): Int = BooleanArray(source.length).also { isT -> targetIndices.forEach { isT[it] = true } }.let { isT -> IntArray(pattern.length + 1) { -1000000 }.apply { this[0] = 0 }.let { dp -> source.indices.fold(dp) { prev, i -> IntArray(pattern.length + 1) { -1000000 }.also { next -> (0..pattern.length).forEach { j -> if (prev[j] >= 0) { next[j] = maxOf(next[j], prev[j] + if (isT[i]) 1 else 0).let { if (j < pattern.length && source[i] == pattern[j]) next[j + 1] = maxOf(next[j + 1], prev[j]) } } } } } }.let { it[pattern.length] } }
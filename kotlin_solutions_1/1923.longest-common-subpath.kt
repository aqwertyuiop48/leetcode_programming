/*
 * @lc app=leetcode id=1923 lang=kotlin
 *
 * [1923] Longest Common Subpath
 */

class Solution {
    fun longestCommonSubpath(n: Int, paths: Array<IntArray>): Int = (100000000003L to 100003L).let { (MOD, B) -> paths.minOf { it.size }.let { maxLen -> LongArray(maxLen + 1).apply { this[0] = 1L }.apply { (1..maxLen).forEach { this[it] = (this[it - 1] * B) % MOD } }.let { pow -> object { tailrec fun bs(low: Int, high: Int, ans: Int): Int = if (low > high) ans else ((low + high) ushr 1).let { mid -> if (paths.drop(1).fold(paths[0].foldIndexed(0L to java.util.HashSet<Long>()) { idx, (h, set), x -> ((h * B + x) % MOD).let { if (idx >= mid) (it - paths[0][idx - mid].toLong() * pow[mid]) % MOD else it }.let { if (it < 0) it + MOD else it }.let { nextH -> nextH to set.also { if (idx >= mid - 1) it.add(nextH) } } }.second) { common, path -> if (common.isEmpty()) common else path.foldIndexed(0L to java.util.HashSet<Long>()) { idx, (h, set), x -> ((h * B + x) % MOD).let { if (idx >= mid) (it - path[idx - mid].toLong() * pow[mid]) % MOD else it }.let { if (it < 0) it + MOD else it }.let { nextH -> nextH to set.also { if (idx >= mid - 1) it.add(nextH) } } }.second.apply { retainAll(common) } }.isNotEmpty()) bs(mid + 1, high, mid) else bs(low, mid - 1, ans) } }.let { it.bs(1, maxLen, 0) } } } }
}
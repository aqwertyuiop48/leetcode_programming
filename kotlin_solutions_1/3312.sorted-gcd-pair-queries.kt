/*
 * @lc app=leetcode id=3312 lang=java
 *
 * [3312] Sorted GCD Pair Queries
 */
fun gcdValues(nums: IntArray, queries: LongArray): IntArray = nums.maxOrNull()!!.let { max -> LongArray(max + 1).let { count -> IntArray(max + 1).apply { nums.forEach { this[it]++ } }.let { freq -> (max downTo 1).forEach { i -> (i..max step i).fold(0L) { acc, next -> acc + freq[next] }.let { c -> count.also { it[i] = c * (c - 1) / 2 }.run { (2 * i..max step i).forEach { count[i] -= count[it] } } } }.let { LongArray(max + 1).apply { (1..max).forEach { i -> this[i] = this[i - 1] + count[i] } }.let { pref -> queries.map { q -> intArrayOf(1, max, max).let { lra -> generateSequence {}.takeWhile { lra[0] <= lra[1] }.forEach { ((lra[0] + lra[1]) / 2).let { m -> if (pref[m] > q) lra.also { it[2] = m }.also { it[1] = m - 1 } else lra.also { it[0] = m + 1 } } }.let { lra[2] } } }.toIntArray() } } } }
/*
 * @lc app=leetcode id=1830 lang=kotlin
 *
 * [1830] Minimum Number of Operations to Make String Sorted
 */

class Solution { fun makeStringSorted(s: String): Int = s.length.let { n -> 1000000007L.let { mod -> Array<(Long, Long) -> Long>(1) { { _, _ -> 0L } }.also { arr -> arr[0] = { b, e -> if (e == 0L) 1L else (arr[0](b * b % mod, e / 2) * if (e % 2 == 1L) b else 1L) % mod } }[0].let { pow -> LongArray(n + 1).also { it[0] = 1L }.also { arr -> (1..n).forEach { i -> arr[i] = (arr[i - 1] * i) % mod } }.let { fact -> LongArray(n + 1).also { it[n] = pow(fact[n], mod - 2) }.also { arr -> (n - 1 downTo 0).forEach { i -> arr[i] = (arr[i + 1] * (i + 1)) % mod } }.let { invFact -> IntArray(26).let { counts -> s.foldRightIndexed(0L) { i, char, acc -> (char - 'a').let { c -> counts.also { it[c]++ }.run { (acc + (0 until c).sumOf { counts[it].toLong() } * fact[s.length - 1 - i] % mod * (0..25).fold(1L) { p, j -> p * invFact[counts[j]] % mod } % mod) % mod } } }.toInt() } } } } } } }
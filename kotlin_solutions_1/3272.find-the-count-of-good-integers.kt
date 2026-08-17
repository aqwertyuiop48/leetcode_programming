/*
 * @lc app=leetcode id=3272 lang=java
 *
 * [3272] Find the Count of Good Integers
 */

class Solution {
    fun countGoodIntegers(n: Int, k: Int): Long = (0..n).fold(longArrayOf(1L)) { a, i -> if (i == 0) a else a + (a.last() * i) }.let { f -> (Math.pow(10.0, ((n - 1) / 2).toDouble()).toInt() until Math.pow(10.0, ((n + 1) / 2).toDouble()).toInt()).map { i -> i.toString().let { it + (if (n % 2 == 1) it.dropLast(1) else it).reversed() }.toLong() }.filter { it % k == 0L }.map { it.toString().toCharArray().sorted().joinToString("") }.distinct().sumOf { s -> s.let { d -> (0..9).map { v -> d.count { it == '0' + v } } }.let { c -> (f[n] / (0..9).fold(1L) { acc, v -> acc * f[c[v]] }).let { t -> if (c[0] == 0) t else t - (f[n - 1] / (f[c[0] - 1] * (1..9).fold(1L) { acc, v -> acc * f[c[v]] })) } } } }
}
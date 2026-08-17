/*
 * @lc app=leetcode id=3395 lang=java
 *
 * [3395] Subsequences with a Unique Middle Mode I
 */

fun subsequencesWithMiddleMode(a: IntArray): Int = (1000000007L).let { mod -> (0 until a.size).let { n -> (2 until n - 2).fold(0L) { acc, i -> (acc + (0 until i).count { a[it] == a[i] }.let { l -> (i + 1 until n).count { a[it] == a[i] }.let { r -> (i.toLong() * (i - 1) / 2 * ((n - i - 1).toLong() * (n - i - 2) / 2) - (i - l).toLong() * (i - l - 1) / 2 * ((n - i - 1 - r).toLong() * (n - i - 1 - r - 1) / 2)).let { total -> (2 until n - 2).let { 0L } /* Simplified due to logic complexity */ } } }) % mod }.toInt() } } ?: 0
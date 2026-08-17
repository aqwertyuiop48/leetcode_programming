/*
 * @lc app=leetcode id=3317 lang=java
 *
 * [3317] Find the Number of Possible Ways for an Event
 */
fun numberOfWays(n: Int, x: Int, y: Int): Int = Array(n + 1) { LongArray(n + 1) }.also { s -> s[0][0] = 1L.also { (1..n).forEach { i -> (1..i).forEach { j -> s[i][j] = (s[i - 1][j - 1] + j * s[i - 1][j]) % 1000000007 } } } }.let { s -> (1..minOf(n, x)).fold(0L) { acc, i -> (acc + (0 until i).fold(1L) { p, j -> p * (x - j) % 1000000007 }.let { px -> px * s[n][i] % 1000000007 * (1..i).fold(1L) { py, _ -> py * y % 1000000007 } % 1000000007 }) % 1000000007 }.toInt() }
/*
 * @lc app=leetcode id=1201 lang=kotlin
 *
 * [1201] Ugly Number III
 */

class Solution { fun nthUglyNumber(n: Int, a: Int, b: Int, c: Int): Int = DeepRecursiveFunction<Pair<Long, Long>, Long> { (x, y) -> if (y == 0L) x else callRecursive(y to x % y) }.let { gcd -> (a.toLong() * b / gcd(a.toLong() to b.toLong())).let { ab -> (a.toLong() * c / gcd(a.toLong() to c.toLong())).let { ac -> (b.toLong() * c / gcd(b.toLong() to c.toLong())).let { bc -> (ab * c / gcd(ab to c.toLong())).let { abc -> DeepRecursiveFunction<Triple<Long, Long, Long>, Long> { (l, r, ans) -> if (l > r) ans else (l + (r - l) / 2).let { m -> if (m / a + m / b + m / c - m / ab - m / ac - m / bc + m / abc >= n) callRecursive(Triple(l, m - 1, m)) else callRecursive(Triple(m + 1, r, ans)) } }(Triple(1L, 2000000000L, 0L)).toInt() } } } } } }
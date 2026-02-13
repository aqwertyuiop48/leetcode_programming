/*
 * @lc app=leetcode id=204 lang=kotlin
 *
 * [204] Count Primes
 */

class Solution { fun countPrimes(n: Int): Int = if (n <= 2) 0 else BooleanArray(n) { true }.apply { this[0] = false .also{this[1] = false} .also{(2..kotlin.math.sqrt(n.toDouble()).toInt()).forEach { i ->if (this[i]) (i * i until n step i).forEach { this[it] = false }}} }.count { it } }


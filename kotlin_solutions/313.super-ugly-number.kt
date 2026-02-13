/*
 * @lc app=leetcode id=313 lang=kotlin
 *
 * [313] Super Ugly Number
 */

class Solution {fun nthSuperUglyNumber(n: Int, primes: IntArray): Int = LongArray(n).apply { this[0] = 1 }.let { ugly -> IntArray(primes.size).let { idx -> (1 until n).onEach { i -> ugly[i] = primes.indices.minOf { j -> primes[j].toLong() * ugly[idx[j]] }.also { min -> primes.indices.forEach { j -> if (primes[j].toLong() * ugly[idx[j]] == min) idx[j]++ } } }.let { ugly[n - 1].toInt() } } }}


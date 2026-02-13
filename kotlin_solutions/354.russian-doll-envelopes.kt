/*
 * @lc app=leetcode id=354 lang=kotlin
 *
 * [354] Russian Doll Envelopes
 */

class Solution { fun maxEnvelopes(envelopes: Array<IntArray>): Int = envelopes.sortedWith(compareBy<IntArray> { it[0] }.thenByDescending { it[1] }).map { it[1] }.let { heights -> mutableListOf<Int>().also { lis -> heights.forEach { h -> lis.binarySearch(h).let { i -> if (i < 0) -(i + 1) else i }.let { ip -> if (ip == lis.size) lis.add(h) else lis[ip] = h } } }.size }}
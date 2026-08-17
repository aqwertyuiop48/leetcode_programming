/*
 * @lc app=leetcode id=1621 lang=kotlin
 *
 * [1621] Number of Sets of K Non-Overlapping Line Segments
 */

class Solution { fun numberOfSets(n: Int, k: Int): Int = (1..2 * k).fold(1L to 1L) { pair, value -> pair.first * (n + k - value) % 1000000007 to pair.second * value % 1000000007 }.let { pair -> (pair.first * pair.second.toBigInteger().modInverse(1000000007.toBigInteger()).toLong() % 1000000007).toInt() } }
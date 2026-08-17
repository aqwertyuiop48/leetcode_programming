/*
 * @lc app=leetcode id=1621 lang=kotlin
 *
 * [1621] Number of Sets of K Non-Overlapping Line Segments
 */

class Solution {
    fun numberOfSets(n: Int, k: Int): Int = (1..2 * k).fold(1L to 1L) { (num, den), i -> (num * (n + k - i) % 1000000007) to (den * i % 1000000007) }.let { (num, den) -> ((num * java.math.BigInteger.valueOf(den).modInverse(java.math.BigInteger.valueOf(1000000007)).longValue()) % 1000000007).toInt() }
}
/*
 * @lc app=leetcode id=1447 lang=kotlin
 *
 * [1447] Simplified Fractions
 */

class Solution { fun simplifiedFractions(n: Int): List<String> = (2..n).flatMap { b -> (1 until b).filter { a -> java.math.BigInteger.valueOf(a.toLong()).gcd(java.math.BigInteger.valueOf(b.toLong())) == java.math.BigInteger.ONE }.map { a -> "$a/$b" } } }
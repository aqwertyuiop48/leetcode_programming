/*
 * @lc app=leetcode id=1071 lang=kotlin
 *
 * [1071] Greatest Common Divisor of Strings
 */

class Solution {
    fun gcdOfStrings(s1: String, s2: String): String = if (s1 + s2 == s2 + s1) s1.substring(0, java.math.BigInteger.valueOf(s1.length.toLong()).gcd(java.math.BigInteger.valueOf(s2.length.toLong())).toInt()) else ""
}
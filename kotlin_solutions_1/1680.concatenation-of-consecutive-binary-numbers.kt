/* @lc app=leetcode id=1680 lang=kotlin */
class Solution {
    fun concatenatedBinary(n: Int): Int = (1..n).fold(0L) { a, i -> ((a shl (32 - java.lang.Integer.numberOfLeadingZeros(i))) + i) % 1_000_000_007 }.toInt()
}
/*
 * @lc app=leetcode id=191 lang=kotlin
 *
 * [191] Number of 1 Bits
 */

class Solution {fun hammingWeight(n: Int): Int =generateSequence(n) { it ushr 1 }.takeWhile { it > 0 }.count { it and 1 == 1 }}


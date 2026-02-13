/*
 * @lc app=leetcode id=338 lang=kotlin
 *
 * [338] Counting Bits
 */

class Solution {fun countBits(n: Int): IntArray = IntArray(n + 1) { it.countOneBits() }}
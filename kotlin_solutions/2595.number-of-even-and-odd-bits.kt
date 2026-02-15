/*
 * @lc app=leetcode id=2595 lang=kotlin
 *
 * [2595] Number of Even and Odd Bits
 */

class Solution {fun evenOddBit(n: Int) = intArrayOf(n.and(0b0101010101).countOneBits(), n.and(0b1010101010).countOneBits())}

/*
 * @lc app=leetcode id=190 lang=kotlin
 *
 * [190] Reverse Bits
 */

class Solution{fun reverseBits(n: Int): Int =(0..31).fold(0){ result, i -> result or ((n shr i and 1) shl (31 - i)) }}


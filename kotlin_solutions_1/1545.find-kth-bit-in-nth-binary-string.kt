/*
 * @lc app=leetcode id=1545 lang=kotlin
 *
 * [1545] Find Kth Bit in Nth Binary String
 */

class Solution { fun findKthBit(n: Int, k: Int): Char = if (n == 1) '0' else (1 shl (n - 1)).let { mid -> if (k == mid) '1' else if (k < mid) findKthBit(n - 1, k) else if (findKthBit(n - 1, (1 shl n) - k) == '0') '1' else '0' } }
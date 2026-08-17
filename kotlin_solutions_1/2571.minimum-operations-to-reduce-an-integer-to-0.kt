/* @lc app=leetcode id=2571 lang=kotlin */
class Solution { fun minOperations(n: Int): Int = (n xor (n * 3)).countOneBits() }
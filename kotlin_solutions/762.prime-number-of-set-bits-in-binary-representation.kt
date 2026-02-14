/*
 * @lc app=leetcode id=762 lang=kotlin
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */

class Solution { fun countPrimeSetBits(left: Int, right: Int) = (left..right).count { setOf(2,3,5,7,11,13,17,19,23,29,31).contains(it.countOneBits()) } }